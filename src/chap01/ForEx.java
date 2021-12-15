package chap01;

import java.util.Scanner;

public class ForEx {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i < n) {
                System.out.print( i + " + ");
            } else {
                System.out.print(i);
            }

            sum += i;
        }

        System.out.println(" = " + sum);


//        String sumStr = "";
//
//        for(int i = 1; i <= 7; i++) {
//            sum += i;
//
//            if(i < 7) {
//                sumStr += i + " + ";
//            } else {
//                sumStr += i;
//            }
//        }
//
//        System.out.println(sumStr + " = " + sum);
    }
}
