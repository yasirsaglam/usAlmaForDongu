import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, n, sonuc = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        a = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sonuc = sonuc * a;
        }
        System.out.print("a üzeri n üs alma işlemi sonucu : " + sonuc);
    }
}
