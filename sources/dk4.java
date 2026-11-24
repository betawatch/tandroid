// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dk4 {
    public final jj0 a;
    public final nj0 b;
    public kj0 c;
    public final int d;

    public dk4(lj0 lj0Var, nj0 nj0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = nj0Var;
        this.d = i;
        this.a = new jj0(lj0Var, j, j2, j3, j4, j5);
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static int c(vb3 vb3Var, long j, u21 u21Var) {
        if (j == vb3Var.d) {
            return 0;
        }
        u21Var.a = j;
        return 1;
    }

    public final int a(vb3 vb3Var, u21 u21Var) {
        boolean z;
        while (true) {
            kj0 kj0Var = this.c;
            kj0Var.getClass();
            long j = kj0Var.f;
            long j2 = kj0Var.g;
            long j3 = kj0Var.h;
            long j4 = j2 - j;
            long j5 = this.d;
            nj0 nj0Var = this.b;
            if (j4 <= j5) {
                this.c = null;
                nj0Var.c();
                return c(vb3Var, j, u21Var);
            }
            long j6 = j3 - vb3Var.d;
            if (j6 < 0 || j6 > 262144) {
                z = false;
            } else {
                vb3Var.m((int) j6, false);
                z = true;
            }
            if (!z) {
                return c(vb3Var, j3, u21Var);
            }
            vb3Var.f = 0;
            mj0 b = nj0Var.b(vb3Var, kj0Var.b);
            int i = b.a;
            long j7 = b.b;
            long j8 = b.c;
            if (i == -3) {
                this.c = null;
                nj0Var.c();
                return c(vb3Var, j3, u21Var);
            }
            if (i == -2) {
                kj0Var.d = j7;
                kj0Var.f = j8;
                kj0Var.h = kj0.a(kj0Var.b, j7, kj0Var.e, j8, kj0Var.g, kj0Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        dq9.m("Invalid case");
                        return 0;
                    }
                    long j9 = j8 - vb3Var.d;
                    if (j9 >= 0 && j9 <= 262144) {
                        vb3Var.m((int) j9, false);
                    }
                    this.c = null;
                    nj0Var.c();
                    return c(vb3Var, j8, u21Var);
                }
                kj0Var.e = j7;
                kj0Var.g = j8;
                kj0Var.h = kj0.a(kj0Var.b, kj0Var.d, j7, kj0Var.f, j8, kj0Var.c);
            }
        }
    }

    public final void d(long j) {
        kj0 kj0Var = this.c;
        if (kj0Var == null || kj0Var.a != j) {
            jj0 jj0Var = this.a;
            this.c = new kj0(j, jj0Var.a.c(j), jj0Var.c, jj0Var.d, jj0Var.e, jj0Var.f);
        }
    }
}
