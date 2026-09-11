package l2;

import b2.e0;
import b2.h1;
import b2.j1;
import b2.k0;
import b2.k1;
import e2.d0;
import java.util.List;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class e extends k1 {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final m2.c l;
    public final k0 m;
    public final e0 n;

    public e(long j3, long j10, long j11, int i10, long j12, long j13, long j14, m2.c cVar, k0 k0Var, e0 e0Var) {
        e2.d.g(cVar.d == (e0Var != null));
        this.e = j3;
        this.f = j10;
        this.g = j11;
        this.h = i10;
        this.i = j12;
        this.j = j13;
        this.k = j14;
        this.l = cVar;
        this.m = k0Var;
        this.n = e0Var;
    }

    @Override // b2.k1
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // b2.k1
    public final h1 f(int i10, h1 h1Var, boolean z10) {
        e2.d.c(i10, h());
        m2.c cVar = this.l;
        String str = z10 ? cVar.b(i10).a : null;
        Integer valueOf = z10 ? Integer.valueOf(this.h + i10) : null;
        long d = cVar.d(i10);
        long Q = d0.Q(cVar.b(i10).b - cVar.b(0).b) - this.i;
        h1Var.getClass();
        h1Var.h(str, valueOf, 0, d, Q, b2.b.c, false);
        return h1Var;
    }

    @Override // b2.k1
    public final int h() {
        return this.l.m.size();
    }

    @Override // b2.k1
    public final Object l(int i10) {
        e2.d.c(i10, h());
        return Integer.valueOf(this.h + i10);
    }

    @Override // b2.k1
    public final j1 m(int i10, j1 j1Var, long j3) {
        long j10;
        long j11;
        h d;
        e2.d.c(i10, 1);
        m2.c cVar = this.l;
        boolean z10 = cVar.d;
        long j12 = this.k;
        if (z10 && cVar.e != -9223372036854775807L && cVar.b == -9223372036854775807L) {
            long j13 = 0;
            if (j3 > 0) {
                j12 += j3;
                if (j12 > this.j) {
                    j12 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    j1Var.b(j1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j10 || cVar.b != j10) ? false : true, this.n, j12, this.j, 0, h() - 1, this.i);
                    return j1Var;
                }
            }
            long j14 = this.i + j12;
            long d10 = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.m.size() - 1 && j14 >= d10) {
                j14 -= d10;
                i11++;
                d10 = cVar.d(i11);
            }
            m2.h b10 = cVar.b(i11);
            List list = b10.c;
            int size = list.size();
            j10 = -9223372036854775807L;
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    j11 = j13;
                    i12 = -1;
                    break;
                }
                j11 = j13;
                if (((m2.a) list.get(i12)).b == 2) {
                    break;
                }
                i12++;
                j13 = j11;
            }
            if (i12 != -1 && (d = ((m2.m) ((m2.a) b10.c.get(i12)).c.get(0)).d()) != null && d.w(d10) != j11) {
                j12 = (d.a(d.o(j14, d10)) + j12) - j14;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        j1Var.b(j1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j10 || cVar.b != j10) ? false : true, this.n, j12, this.j, 0, h() - 1, this.i);
        return j1Var;
    }

    @Override // b2.k1
    public final int o() {
        return 1;
    }
}
