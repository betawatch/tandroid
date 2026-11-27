// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class dk4 {
    public final ki0 a;
    public final oi0 b;
    public li0 c;
    public final int d;

    public dk4(mi0 mi0Var, oi0 oi0Var, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = oi0Var;
        this.d = i;
        this.a = new ki0(mi0Var, j, j2, j3, j4, j5);
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    public static int c(cb3 cb3Var, long j, v11 v11Var) {
        if (j == cb3Var.d) {
            return 0;
        }
        v11Var.a = j;
        return 1;
    }

    public final int a(cb3 cb3Var, v11 v11Var) {
        boolean z;
        while (true) {
            li0 li0Var = this.c;
            li0Var.getClass();
            long j = li0Var.f;
            long j2 = li0Var.g;
            long j3 = li0Var.h;
            long j4 = j2 - j;
            long j5 = this.d;
            oi0 oi0Var = this.b;
            if (j4 <= j5) {
                this.c = null;
                oi0Var.f();
                return c(cb3Var, j, v11Var);
            }
            long j6 = j3 - cb3Var.d;
            if (j6 < 0 || j6 > 262144) {
                z = false;
            } else {
                cb3Var.l((int) j6, false);
                z = true;
            }
            if (!z) {
                return c(cb3Var, j3, v11Var);
            }
            cb3Var.f = 0;
            ni0 c = oi0Var.c(cb3Var, li0Var.b);
            int i = c.a;
            long j7 = c.b;
            long j8 = c.c;
            if (i == -3) {
                this.c = null;
                oi0Var.f();
                return c(cb3Var, j3, v11Var);
            }
            if (i == -2) {
                li0Var.d = j7;
                li0Var.f = j8;
                li0Var.h = li0.a(li0Var.b, j7, li0Var.e, j8, li0Var.g, li0Var.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        grb.i("Invalid case");
                        return 0;
                    }
                    long j9 = j8 - cb3Var.d;
                    if (j9 >= 0 && j9 <= 262144) {
                        cb3Var.l((int) j9, false);
                    }
                    this.c = null;
                    oi0Var.f();
                    return c(cb3Var, j8, v11Var);
                }
                li0Var.e = j7;
                li0Var.g = j8;
                li0Var.h = li0.a(li0Var.b, li0Var.d, j7, li0Var.f, j8, li0Var.c);
            }
        }
    }

    public final void d(long j) {
        li0 li0Var = this.c;
        if (li0Var == null || li0Var.a != j) {
            ki0 ki0Var = this.a;
            this.c = new li0(j, ki0Var.a.c(j), ki0Var.c, ki0Var.d, ki0Var.e, ki0Var.f);
        }
    }
}
