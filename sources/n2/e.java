package n2;

import b8.zb;
import d2.h0;
import d2.k1;
import d2.m1;
import d2.n0;
import d2.n1;
import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends n1 {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final o2.c l;
    public final n0 m;
    public final h0 n;

    public e(long j10, long j11, long j12, int i3, long j13, long j14, long j15, o2.c cVar, n0 n0Var, h0 h0Var) {
        zb.p(cVar.d == (h0Var != null));
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = i3;
        this.i = j13;
        this.j = j14;
        this.k = j15;
        this.l = cVar;
        this.m = n0Var;
        this.n = h0Var;
    }

    @Override // d2.n1
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // d2.n1
    public final k1 f(int i3, k1 k1Var, boolean z10) {
        zb.j(i3, h());
        o2.c cVar = this.l;
        String str = z10 ? cVar.b(i3).a : null;
        Integer valueOf = z10 ? Integer.valueOf(this.h + i3) : null;
        long d = cVar.d(i3);
        long S = g2.n0.S(cVar.b(i3).b - cVar.b(0).b) - this.i;
        k1Var.getClass();
        k1Var.h(str, valueOf, 0, d, S, d2.c.c, false);
        return k1Var;
    }

    @Override // d2.n1
    public final int h() {
        return this.l.m.size();
    }

    @Override // d2.n1
    public final Object l(int i3) {
        zb.j(i3, h());
        return Integer.valueOf(this.h + i3);
    }

    @Override // d2.n1
    public final m1 m(int i3, m1 m1Var, long j10) {
        boolean z10;
        long j11;
        boolean z11;
        long j12;
        i c2;
        zb.j(i3, 1);
        o2.c cVar = this.l;
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
                    m1Var.b(m1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? z11 : z10, this.n, j13, this.j, 0, h() - 1, this.i);
                    return m1Var;
                }
            }
            long j15 = this.i + j13;
            long d = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.m.size() - 1 && j15 >= d) {
                j15 -= d;
                i10++;
                d = cVar.d(i10);
            }
            o2.h b10 = cVar.b(i10);
            List list = b10.c;
            z10 = true;
            int size = list.size();
            j11 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    j12 = j14;
                    i11 = -1;
                    break;
                }
                j12 = j14;
                if (((o2.a) list.get(i11)).b == 2) {
                    break;
                }
                i11++;
                j14 = j12;
            }
            if (i11 != -1 && (c2 = ((o2.m) ((o2.a) b10.c.get(i11)).c.get(0)).c()) != null && c2.H(d) != j12) {
                j13 = (c2.b(c2.s(j15, d)) + j13) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        z11 = false;
        m1Var.b(m1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? z11 : z10, this.n, j13, this.j, 0, h() - 1, this.i);
        return m1Var;
    }

    @Override // d2.n1
    public final int o() {
        return 1;
    }
}
