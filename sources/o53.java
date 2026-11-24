// default package

import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o53 extends aob {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final h53 l;
    public final br6 m;
    public final wq6 n;

    public o53(long j, long j2, long j3, int i, long j4, long j5, long j6, h53 h53Var, br6 br6Var, wq6 wq6Var) {
        gre.p(h53Var.d == (wq6Var != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = h53Var;
        this.m = br6Var;
        this.n = wq6Var;
    }

    @Override // aob
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // aob
    public final xnb f(int i, xnb xnbVar, boolean z) {
        String str;
        Integer num;
        gre.j(i, h());
        h53 h53Var = this.l;
        if (z) {
            str = h53Var.b(i).a;
            num = Integer.valueOf(this.h + i);
        } else {
            str = null;
            num = null;
        }
        long d = h53Var.d(i);
        long T = g8c.T(h53Var.b(i).b - h53Var.b(0).b) - this.i;
        da daVar = da.c;
        xnbVar.h(str, num, 0, d, T, false);
        return xnbVar;
    }

    @Override // aob
    public final int h() {
        return this.l.l.size();
    }

    @Override // aob
    public final Object l(int i) {
        gre.j(i, h());
        return Integer.valueOf(this.h + i);
    }

    @Override // aob
    public final znb m(int i, znb znbVar, long j) {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        r53 b;
        gre.j(i, 1);
        h53 h53Var = this.l;
        boolean z3 = h53Var.d;
        long j4 = this.k;
        if (z3 && h53Var.e != -9223372036854775807L && h53Var.b == -9223372036854775807L) {
            long j5 = 0;
            if (j > 0) {
                j4 += j;
                if (j4 > this.j) {
                    z = true;
                    z2 = false;
                    j4 = -9223372036854775807L;
                    j2 = -9223372036854775807L;
                    znbVar.b(znb.p, this.m, h53Var, this.e, this.f, this.g, true, (h53Var.d || h53Var.e == j2 || h53Var.b != j2) ? z2 : z, this.n, j4, this.j, 0, h() - 1, this.i);
                    return znbVar;
                }
            }
            long j6 = this.i + j4;
            long d = h53Var.d(0);
            int i2 = 0;
            while (i2 < h53Var.l.size() - 1 && j6 >= d) {
                j6 -= d;
                i2++;
                d = h53Var.d(i2);
            }
            f38 b2 = h53Var.b(i2);
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
            if (i3 != -1 && (b = ((i89) ((ea) b2.c.get(i3)).c.get(0)).b()) != null && b.f0(d) != j3) {
                j4 = (b.e(b.C(j6, d)) + j4) - j6;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        z2 = false;
        znbVar.b(znb.p, this.m, h53Var, this.e, this.f, this.g, true, (h53Var.d || h53Var.e == j2 || h53Var.b != j2) ? z2 : z, this.n, j4, this.j, 0, h() - 1, this.i);
        return znbVar;
    }
}
