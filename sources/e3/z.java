package e3;

import java.io.Serializable;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class z {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i3 & (-2097152)) != -2097152 || (i10 = (i3 >>> 19) & 3) == 1 || (i11 = (i3 >>> 17) & 3) == 0 || (i12 = (i3 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i3 >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i10;
        this.g = b.s[3 - i11];
        int i14 = b.t[i13];
        this.c = i14;
        if (i10 == 2) {
            this.c = i14 / 2;
        } else if (i10 == 0) {
            this.c = i14 / 4;
        }
        int i15 = (i3 >>> 9) & 1;
        int i16 = 1152;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException();
                }
                i16 = 384;
            }
        } else if (i10 != 3) {
            i16 = 576;
        }
        this.f = i16;
        if (i11 == 3) {
            int i17 = i10 == 3 ? b.u[i12 - 1] : b.v[i12 - 1];
            this.e = i17;
            this.b = (((i17 * 12) / this.c) + i15) * 4;
        } else {
            int i18 = hs.a2;
            if (i10 == 3) {
                int i19 = i11 == 2 ? b.w[i12 - 1] : b.x[i12 - 1];
                this.e = i19;
                this.b = ((i19 * hs.a2) / this.c) + i15;
            } else {
                int i20 = b.y[i12 - 1];
                this.e = i20;
                if (i11 == 1) {
                    i18 = 72;
                }
                this.b = ((i18 * i20) / this.c) + i15;
            }
        }
        this.d = ((i3 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
