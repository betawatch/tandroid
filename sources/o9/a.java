package o9;

import mh.c3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public static final l9.a b = new l9.a();
    public static final String c = a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final c3 e = new c3(6);
    public final c a;

    public a(c cVar) {
        this.a = cVar;
    }

    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb.append(str2.charAt(i10));
            }
        }
        return sb.toString();
    }
}
