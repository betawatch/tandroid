package c8;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class q9 {
    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i7 = 0; i7 < str.length(); i7++) {
            sb2.append(str.charAt(i7));
            if (str2.length() > i7) {
                sb2.append(str2.charAt(i7));
            }
        }
        return sb2.toString();
    }
}
