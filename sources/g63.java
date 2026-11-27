// default package

import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class g63 extends asb {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final z53 l;
    public final ft6 m;
    public final at6 n;

    public g63(long j, long j2, long j3, int i, long j4, long j5, long j6, z53 z53Var, ft6 ft6Var, at6 at6Var) {
        yve.p(z53Var.d == (at6Var != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = z53Var;
        this.m = ft6Var;
        this.n = at6Var;
    }

    @Override // asb
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // asb
    public final xrb f(int i, xrb xrbVar, boolean z) {
        String str;
        Integer num;
        yve.j(i, h());
        z53 z53Var = this.l;
        if (z) {
            str = z53Var.b(i).a;
            num = Integer.valueOf(this.h + i);
        } else {
            str = null;
            num = null;
        }
        long d = z53Var.d(i);
        long T = gcc.T(z53Var.b(i).b - z53Var.b(0).b) - this.i;
        ea eaVar = ea.c;
        xrbVar.h(str, num, 0, d, T, false);
        return xrbVar;
    }

    @Override // asb
    public final int h() {
        return this.l.l.size();
    }

    @Override // asb
    public final Object l(int i) {
        yve.j(i, h());
        return Integer.valueOf(this.h + i);
    }

    @Override // asb
    public final zrb m(int i, zrb zrbVar, long j) {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        j63 b;
        yve.j(i, 1);
        z53 z53Var = this.l;
        boolean z3 = z53Var.d;
        long j4 = this.k;
        if (z3 && z53Var.e != -9223372036854775807L && z53Var.b == -9223372036854775807L) {
            long j5 = 0;
            if (j > 0) {
                j4 += j;
                if (j4 > this.j) {
                    z = true;
                    z2 = false;
                    j4 = -9223372036854775807L;
                    j2 = -9223372036854775807L;
                    zrbVar.b(zrb.p, this.m, z53Var, this.e, this.f, this.g, true, (z53Var.d || z53Var.e == j2 || z53Var.b != j2) ? z2 : z, this.n, j4, this.j, 0, h() - 1, this.i);
                    return zrbVar;
                }
            }
            long j6 = this.i + j4;
            long d = z53Var.d(0);
            int i2 = 0;
            while (i2 < z53Var.l.size() - 1 && j6 >= d) {
                j6 -= d;
                i2++;
                d = z53Var.d(i2);
            }
            v68 b2 = z53Var.b(i2);
            List list = b2.c;
            z = true;
            int size = list.size();
            j2 = -9223372036854775807L;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    j3 = j5;
                    i3 = -1;
                    break;
                }
                j3 = j5;
                if (((fa) list.get(i3)).b == 2) {
                    break;
                }
                i3++;
                j5 = j3;
            }
            if (i3 != -1 && (b = ((ub9) ((fa) b2.c.get(i3)).c.get(0)).b()) != null && b.Y(d) != j3) {
                j4 = (b.f(b.I(j6, d)) + j4) - j6;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        z2 = false;
        zrbVar.b(zrb.p, this.m, z53Var, this.e, this.f, this.g, true, (z53Var.d || z53Var.e == j2 || z53Var.b != j2) ? z2 : z, this.n, j4, this.j, 0, h() - 1, this.i);
        return zrbVar;
    }
}
