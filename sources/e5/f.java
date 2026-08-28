package e5;

import h3.t1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public f(List list, int i9, float f10, String str) {
        this.a = list;
        this.b = i9;
        this.c = f10;
        this.d = str;
    }

    public static f a(d5.y yVar) {
        int i9;
        try {
            yVar.D(21);
            int r10 = yVar.r() & 3;
            int r11 = yVar.r();
            int i10 = yVar.b;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < r11; i13++) {
                yVar.D(1);
                int w8 = yVar.w();
                for (int i14 = 0; i14 < w8; i14++) {
                    int w10 = yVar.w();
                    i12 += w10 + 4;
                    yVar.D(w10);
                }
            }
            yVar.C(i10);
            byte[] bArr = new byte[i12];
            float f10 = 1.0f;
            String str = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < r11) {
                int r12 = yVar.r() & 63;
                int w11 = yVar.w();
                int i17 = 0;
                while (i17 < w11) {
                    int w12 = yVar.w();
                    System.arraycopy(d5.a.d, i11, bArr, i16, 4);
                    int i18 = i16 + 4;
                    System.arraycopy(yVar.a, yVar.b, bArr, i18, w12);
                    if (r12 == 33 && i17 == 0) {
                        d5.r B = d5.a.B(i18, i18 + w12, bArr);
                        float f11 = B.g;
                        i9 = r10;
                        str = d5.a.d(B.a, B.c, B.d, B.f, B.b, B.e);
                        f10 = f11;
                    } else {
                        i9 = r10;
                    }
                    i16 = i18 + w12;
                    yVar.D(w12);
                    i17++;
                    r10 = i9;
                    i11 = 0;
                }
                i15++;
                i11 = 0;
            }
            return new f(i12 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), r10 + 1, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw t1.a("Error parsing HEVC config", e10);
        }
    }
}
