package j3;

import java.io.Serializable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Serializable g;

    public boolean a(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i9 & (-2097152)) != -2097152 || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return false;
        }
        this.a = i10;
        this.g = b.m[3 - i11];
        int i14 = b.n[i13];
        this.c = i14;
        if (i10 == 2) {
            this.c = i14 / 2;
        } else if (i10 == 0) {
            this.c = i14 / 4;
        }
        int i15 = (i9 >>> 9) & 1;
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
            int i17 = i10 == 3 ? b.o[i12 - 1] : b.p[i12 - 1];
            this.e = i17;
            this.b = (((i17 * 12) / this.c) + i15) * 4;
        } else {
            if (i10 == 3) {
                int i18 = i11 == 2 ? b.q[i12 - 1] : b.r[i12 - 1];
                this.e = i18;
                this.b = ((i18 * 144) / this.c) + i15;
            } else {
                int i19 = b.s[i12 - 1];
                this.e = i19;
                this.b = (((i11 == 1 ? 72 : 144) * i19) / this.c) + i15;
            }
        }
        this.d = ((i9 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
