package e5;

import d5.z;
import h3.t1;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public e(List list, int i10, float f10, String str) {
        this.a = list;
        this.b = i10;
        this.c = f10;
        this.d = str;
    }

    public static e a(z zVar) {
        int i10;
        try {
            zVar.D(21);
            int r10 = zVar.r() & 3;
            int r11 = zVar.r();
            int i11 = zVar.b;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < r11; i14++) {
                zVar.D(1);
                int w10 = zVar.w();
                for (int i15 = 0; i15 < w10; i15++) {
                    int w11 = zVar.w();
                    i13 += w11 + 4;
                    zVar.D(w11);
                }
            }
            zVar.C(i11);
            byte[] bArr = new byte[i13];
            float f10 = 1.0f;
            String str = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 < r11) {
                int r12 = zVar.r() & 63;
                int w12 = zVar.w();
                int i18 = 0;
                while (i18 < w12) {
                    int w13 = zVar.w();
                    System.arraycopy(d5.a.d, i12, bArr, i17, 4);
                    int i19 = i17 + 4;
                    System.arraycopy(zVar.a, zVar.b, bArr, i19, w13);
                    if (r12 == 33 && i18 == 0) {
                        d5.r B = d5.a.B(i19, i19 + w13, bArr);
                        float f11 = B.g;
                        i10 = r10;
                        str = d5.a.d(B.a, B.c, B.d, B.f, B.b, B.e);
                        f10 = f11;
                    } else {
                        i10 = r10;
                    }
                    i17 = i19 + w13;
                    zVar.D(w13);
                    i18++;
                    r10 = i10;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            return new e(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), r10 + 1, f10, str);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw t1.a("Error parsing HEVC config", e9);
        }
    }
}
