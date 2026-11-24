// default package

import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class a73 extends bqb {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final t63 l;
    public final bt6 m;
    public final ws6 n;

    public a73(long j, long j2, long j3, int i, long j4, long j5, long j6, t63 t63Var, bt6 bt6Var, ws6 ws6Var) {
        jte.p(t63Var.d == (ws6Var != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = t63Var;
        this.m = bt6Var;
        this.n = ws6Var;
    }

    @Override // bqb
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // bqb
    public final ypb f(int i, ypb ypbVar, boolean z) {
        String str;
        Integer num;
        jte.j(i, h());
        t63 t63Var = this.l;
        if (z) {
            str = t63Var.b(i).a;
            num = Integer.valueOf(this.h + i);
        } else {
            str = null;
            num = null;
        }
        long d = t63Var.d(i);
        long T = hac.T(t63Var.b(i).b - t63Var.b(0).b) - this.i;
        da daVar = da.c;
        ypbVar.h(str, num, 0, d, T, false);
        return ypbVar;
    }

    @Override // bqb
    public final int h() {
        return this.l.l.size();
    }

    @Override // bqb
    public final Object l(int i) {
        jte.j(i, h());
        return Integer.valueOf(this.h + i);
    }

    @Override // bqb
    public final aqb m(int i, aqb aqbVar, long j) {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        d73 b;
        jte.j(i, 1);
        t63 t63Var = this.l;
        boolean z3 = t63Var.d;
        long j4 = this.k;
        if (z3 && t63Var.e != -9223372036854775807L && t63Var.b == -9223372036854775807L) {
            long j5 = 0;
            if (j > 0) {
                j4 += j;
                if (j4 > this.j) {
                    z = true;
                    z2 = false;
                    j4 = -9223372036854775807L;
                    j2 = -9223372036854775807L;
                    aqbVar.b(aqb.p, this.m, t63Var, this.e, this.f, this.g, true, (t63Var.d || t63Var.e == j2 || t63Var.b != j2) ? z2 : z, this.n, j4, this.j, 0, h() - 1, this.i);
                    return aqbVar;
                }
            }
            long j6 = this.i + j4;
            long d = t63Var.d(0);
            int i2 = 0;
            while (i2 < t63Var.l.size() - 1 && j6 >= d) {
                j6 -= d;
                i2++;
                d = t63Var.d(i2);
            }
            h58 b2 = t63Var.b(i2);
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
                if (((ea) list.get(i3)).b == 2) {
                    break;
                }
                i3++;
                j5 = j3;
            }
            if (i3 != -1 && (b = ((ka9) ((ea) b2.c.get(i3)).c.get(0)).b()) != null && b.X(d) != j3) {
                j4 = (b.e(b.J(j6, d)) + j4) - j6;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        z2 = false;
        aqbVar.b(aqb.p, this.m, t63Var, this.e, this.f, this.g, true, (t63Var.d || t63Var.e == j2 || t63Var.b != j2) ? z2 : z, this.n, j4, this.j, 0, h() - 1, this.i);
        return aqbVar;
    }
}
