package l3;

import java.io.Serializable;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i11;
        this.g = a.m[3 - i12];
        int i15 = a.n[i14];
        this.c = i15;
        if (i11 == 2) {
            this.c = i15 / 2;
        } else if (i11 == 0) {
            this.c = i15 / 4;
        }
        int i16 = (i10 >>> 9) & 1;
        int i17 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    throw new IllegalArgumentException();
                }
                i17 = 384;
            }
        } else if (i11 != 3) {
            i17 = 576;
        }
        this.f = i17;
        if (i12 == 3) {
            int i18 = i11 == 3 ? a.o[i13 - 1] : a.p[i13 - 1];
            this.e = i18;
            this.b = (((i18 * 12) / this.c) + i16) * 4;
        } else {
            if (i11 == 3) {
                int i19 = i12 == 2 ? a.q[i13 - 1] : a.r[i13 - 1];
                this.e = i19;
                this.b = ((i19 * 144) / this.c) + i16;
            } else {
                int i20 = a.s[i13 - 1];
                this.e = i20;
                this.b = (((i12 == 1 ? 72 : 144) * i20) / this.c) + i16;
            }
        }
        this.d = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
