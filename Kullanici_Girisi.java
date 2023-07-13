import java.util.Scanner;

public class Kullanici_Girisi {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String userName, password,newPassword;
        int islem;

        System.out.print("Kullanıcı adı: ");
        userName = input.nextLine();

        System.out.print("Şifre: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
        System.out.println("Giriş Başarılı !");
        }

        else if(!userName.equals("patika")){
            System.out.println("Kullanıcı Adı Hatalı.Tekrar Deneyin..");

        }
        else if (!password.equals("java123")){

            System.out.println("Yanlış Şifre Girdiniz ");
            System.out.println("Değiştirmek İstermisiniz (1-EVET 2-HAYIR)");
            islem =input.nextInt();

            if (islem==1){
                System.out.println("Yeni Şifreyi Giriniz (Önceden Kullanmadığınız Bir Şifre Giriniz!): ");
                newPassword=input.next();
                if (newPassword.equals("java123")){
                    System.out.println("Şifre Oluşturulmadı,Tekrar Deneyiniz.");
                }
                else {
                    System.out.println("Yeni Şifre Oluşturuldu.");
                }    }
            else {
                    System.out.println("Tekrar Deneyiniz.");
                }


        }






        }
}
