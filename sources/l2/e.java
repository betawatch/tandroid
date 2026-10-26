package l2;

import a8.yb;
import b2.j0;
import b2.m1;
import b2.o1;
import b2.p0;
import b2.p1;
import e2.n0;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e extends p1 {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final m2.c l;
    public final p0 m;
    public final j0 n;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, m2.c cVar, p0 p0Var, j0 j0Var) {
        yb.p(cVar.d == (j0Var != null));
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = i10;
        this.i = j13;
        this.j = j14;
        this.k = j15;
        this.l = cVar;
        this.m = p0Var;
        this.n = j0Var;
    }

    @Override // b2.p1
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // b2.p1
    public final m1 f(int i10, m1 m1Var, boolean z10) {
        yb.j(i10, h());
        m2.c cVar = this.l;
        String str = z10 ? cVar.b(i10).a : null;
        Integer valueOf = z10 ? Integer.valueOf(this.h + i10) : null;
        long d = cVar.d(i10);
        long S = n0.S(cVar.b(i10).b - cVar.b(0).b) - this.i;
        m1Var.getClass();
        m1Var.h(str, valueOf, 0, d, S, b2.c.c, false);
        return m1Var;
    }

    @Override // b2.p1
    public final int h() {
        return this.l.m.size();
    }

    @Override // b2.p1
    public final Object l(int i10) {
        yb.j(i10, h());
        return Integer.valueOf(this.h + i10);
    }

    @Override // b2.p1
    public final o1 m(int i10, o1 o1Var, long j10) {
        boolean z10;
        long j11;
        boolean z11;
        long j12;
        h c10;
        yb.j(i10, 1);
        m2.c cVar = this.l;
        boolean z12 = cVar.d;
        long j13 = this.k;
        if (z12 && cVar.e != -9223372036854775807L && cVar.b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.j) {
                    z10 = true;
                    z11 = false;
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    o1Var.b(o1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? z11 : z10, this.n, j13, this.j, 0, h() - 1, this.i);
                    return o1Var;
                }
            }
            long j15 = this.i + j13;
            long d = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.m.size() - 1 && j15 >= d) {
                j15 -= d;
                i11++;
                d = cVar.d(i11);
            }
            m2.h b10 = cVar.b(i11);
            List list = b10.c;
            z10 = true;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    j12 = j14;
                    i12 = -1;
                    break;
                }
                j12 = j14;
                if (((m2.a) list.get(i12)).b == 2) {
                    break;
                }
                i12++;
                j14 = j12;
            }
            if (i12 != -1 && (c10 = ((m2.m) ((m2.a) b10.c.get(i12)).c.get(0)).c()) != null && c10.V(d) != j12) {
                j13 = (c10.a(c10.t(j15, d)) + j13) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        z11 = false;
        o1Var.b(o1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? z11 : z10, this.n, j13, this.j, 0, h() - 1, this.i);
        return o1Var;
    }

    @Override // b2.p1
    public final int o() {
        return 1;
    }
}
