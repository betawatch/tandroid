package l2;

import b2.i0;
import b2.l1;
import b2.n1;
import b2.o0;
import b2.o1;
import e2.m0;
import java.util.List;
import v7.u6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class e extends o1 {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final m2.c l;
    public final o0 m;
    public final i0 n;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, m2.c cVar, o0 o0Var, i0 i0Var) {
        u6.p(cVar.d == (i0Var != null));
        this.e = j10;
        this.f = j11;
        this.g = j12;
        this.h = i10;
        this.i = j13;
        this.j = j14;
        this.k = j15;
        this.l = cVar;
        this.m = o0Var;
        this.n = i0Var;
    }

    @Override // b2.o1
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // b2.o1
    public final l1 f(int i10, l1 l1Var, boolean z10) {
        u6.j(i10, h());
        m2.c cVar = this.l;
        String str = z10 ? cVar.b(i10).a : null;
        Integer valueOf = z10 ? Integer.valueOf(this.h + i10) : null;
        long d = cVar.d(i10);
        long S = m0.S(cVar.b(i10).b - cVar.b(0).b) - this.i;
        l1Var.getClass();
        l1Var.h(str, valueOf, 0, d, S, b2.c.c, false);
        return l1Var;
    }

    @Override // b2.o1
    public final int h() {
        return this.l.m.size();
    }

    @Override // b2.o1
    public final Object l(int i10) {
        u6.j(i10, h());
        return Integer.valueOf(this.h + i10);
    }

    @Override // b2.o1
    public final n1 m(int i10, n1 n1Var, long j10) {
        boolean z10;
        long j11;
        boolean z11;
        long j12;
        i c10;
        u6.j(i10, 1);
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
                    n1Var.b(n1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? z11 : z10, this.n, j13, this.j, 0, h() - 1, this.i);
                    return n1Var;
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
            if (i12 != -1 && (c10 = ((m2.m) ((m2.a) b10.c.get(i12)).c.get(0)).c()) != null && c10.w(d) != j12) {
                j13 = (c10.a(c10.o(j15, d)) + j13) - j15;
            }
        } else {
            z10 = true;
            j11 = -9223372036854775807L;
        }
        z11 = false;
        n1Var.b(n1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? z11 : z10, this.n, j13, this.j, 0, h() - 1, this.i);
        return n1Var;
    }

    @Override // b2.o1
    public final int o() {
        return 1;
    }
}
