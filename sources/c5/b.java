package c5;

import f5.w;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final w a = new w();
    public final StringBuilder b = new StringBuilder();

    public static String a(w wVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = wVar.b;
        int i11 = wVar.c;
        while (i10 < i11 && !z10) {
            char c3 = (char) wVar.a[i10];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !((c3 >= '0' && c3 <= '9') || c3 == '#' || c3 == '-' || c3 == '.' || c3 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c3);
            }
        }
        wVar.D(i10 - wVar.b);
        return sb2.toString();
    }

    public static String b(w wVar, StringBuilder sb2) {
        c(wVar);
        if (wVar.a() == 0) {
            return null;
        }
        String a2 = a(wVar, sb2);
        if (!"".equals(a2)) {
            return a2;
        }
        return "" + ((char) wVar.r());
    }

    public static void c(w wVar) {
        while (true) {
            for (boolean z10 = true; wVar.a() > 0 && z10; z10 = false) {
                int i10 = wVar.b;
                byte[] bArr = wVar.a;
                byte b10 = bArr[i10];
                char c3 = (char) b10;
                if (c3 == '\t' || c3 == '\n' || c3 == '\f' || c3 == '\r' || c3 == ' ') {
                    wVar.D(1);
                } else {
                    int i11 = wVar.c;
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
                            wVar.D(i11 - wVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
