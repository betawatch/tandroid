package o2;

import a8.ia;
import e2.f0;
import e2.i1;
import e2.k1;
import e2.l0;
import e2.l1;
import h2.m0;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e extends l1 {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final p2.c l;
    public final l0 m;
    public final f0 n;

    public e(long j3, long j10, long j11, int i7, long j12, long j13, long j14, p2.c cVar, l0 l0Var, f0 f0Var) {
        ia.p(cVar.d == (f0Var != null));
        this.e = j3;
        this.f = j10;
        this.g = j11;
        this.h = i7;
        this.i = j12;
        this.j = j13;
        this.k = j14;
        this.l = cVar;
        this.m = l0Var;
        this.n = f0Var;
    }

    @Override // e2.l1
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // e2.l1
    public final i1 f(int i7, i1 i1Var, boolean z9) {
        ia.j(i7, h());
        p2.c cVar = this.l;
        String str = z9 ? cVar.b(i7).a : null;
        Integer valueOf = z9 ? Integer.valueOf(this.h + i7) : null;
        long d = cVar.d(i7);
        long S = m0.S(cVar.b(i7).b - cVar.b(0).b) - this.i;
        i1Var.getClass();
        i1Var.h(str, valueOf, 0, d, S, e2.c.c, false);
        return i1Var;
    }

    @Override // e2.l1
    public final int h() {
        return this.l.m.size();
    }

    @Override // e2.l1
    public final Object l(int i7) {
        ia.j(i7, h());
        return Integer.valueOf(this.h + i7);
    }

    @Override // e2.l1
    public final k1 m(int i7, k1 k1Var, long j3) {
        boolean z9;
        long j10;
        boolean z10;
        long j11;
        i c10;
        ia.j(i7, 1);
        p2.c cVar = this.l;
        boolean z11 = cVar.d;
        long j12 = this.k;
        if (z11 && cVar.e != -9223372036854775807L && cVar.b == -9223372036854775807L) {
            long j13 = 0;
            if (j3 > 0) {
                j12 += j3;
                if (j12 > this.j) {
                    z9 = true;
                    z10 = false;
                    j12 = -9223372036854775807L;
                    j10 = -9223372036854775807L;
                    k1Var.b(k1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j10 || cVar.b != j10) ? z10 : z9, this.n, j12, this.j, 0, h() - 1, this.i);
                    return k1Var;
                }
            }
            long j14 = this.i + j12;
            long d = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.m.size() - 1 && j14 >= d) {
                j14 -= d;
                i10++;
                d = cVar.d(i10);
            }
            p2.h b10 = cVar.b(i10);
            List list = b10.c;
            z9 = true;
            int size = list.size();
            j10 = -9223372036854775807L;
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    j11 = j13;
                    i11 = -1;
                    break;
                }
                j11 = j13;
                if (((p2.a) list.get(i11)).b == 2) {
                    break;
                }
                i11++;
                j13 = j11;
            }
            if (i11 != -1 && (c10 = ((p2.m) ((p2.a) b10.c.get(i11)).c.get(0)).c()) != null && c10.x(d) != j11) {
                j12 = (c10.a(c10.o(j14, d)) + j12) - j14;
            }
        } else {
            z9 = true;
            j10 = -9223372036854775807L;
        }
        z10 = false;
        k1Var.b(k1.q, this.m, cVar, this.e, this.f, this.g, true, (cVar.d || cVar.e == j10 || cVar.b != j10) ? z10 : z9, this.n, j12, this.j, 0, h() - 1, this.i);
        return k1Var;
    }

    @Override // e2.l1
    public final int o() {
        return 1;
    }
}
