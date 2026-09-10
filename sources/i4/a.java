package i4;

import e2.v;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final v a = new v();
    public final StringBuilder b = new StringBuilder();

    public static String a(v vVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = vVar.b;
        int i11 = vVar.c;
        while (i10 < i11 && !z10) {
            char c10 = (char) vVar.a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        vVar.K(i10 - vVar.b);
        return sb2.toString();
    }

    public static String b(v vVar, StringBuilder sb2) {
        c(vVar);
        if (vVar.a() == 0) {
            return null;
        }
        String a2 = a(vVar, sb2);
        if (!a2.isEmpty()) {
            return a2;
        }
        return "" + ((char) vVar.x());
    }

    public static void c(v vVar) {
        while (true) {
            for (boolean z10 = true; vVar.a() > 0 && z10; z10 = false) {
                int i10 = vVar.b;
                byte[] bArr = vVar.a;
                byte b10 = bArr[i10];
                char c10 = (char) b10;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    vVar.K(1);
                } else {
                    int i11 = vVar.c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            vVar.K(i11 - vVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
