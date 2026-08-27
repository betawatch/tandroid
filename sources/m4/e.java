package m4;

import d5.g0;
import h3.b1;
import h3.f1;
import h3.p2;
import h3.r2;
import h3.s2;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class e extends s2 {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long h;
    public final long n;
    public final n4.c r;
    public final f1 s;
    public final b1 v;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, n4.c cVar, f1 f1Var, b1 b1Var) {
        d5.a.i(cVar.d == (b1Var != null));
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = i10;
        this.f = j13;
        this.h = j14;
        this.n = j15;
        this.r = cVar;
        this.s = f1Var;
        this.v = b1Var;
    }

    @Override // h3.s2
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // h3.s2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        d5.a.h(i10, h());
        n4.c cVar = this.r;
        String str = z10 ? cVar.b(i10).a : null;
        Integer valueOf = z10 ? Integer.valueOf(this.e + i10) : null;
        long d = cVar.d(i10);
        long H = g0.H(cVar.b(i10).b - cVar.b(0).b) - this.f;
        p2Var.getClass();
        p2Var.h(str, valueOf, 0, d, H, k4.b.f, false);
        return p2Var;
    }

    @Override // h3.s2
    public final int h() {
        return this.r.m.size();
    }

    @Override // h3.s2
    public final Object l(int i10) {
        d5.a.h(i10, h());
        return Integer.valueOf(this.e + i10);
    }

    @Override // h3.s2
    public final r2 m(int i10, r2 r2Var, long j10) {
        long j11;
        long j12;
        h c10;
        d5.a.h(i10, 1);
        n4.c cVar = this.r;
        boolean z10 = cVar.d;
        long j13 = this.n;
        if (z10 && cVar.e != -9223372036854775807L && cVar.b == -9223372036854775807L) {
            long j14 = 0;
            if (j10 > 0) {
                j13 += j10;
                if (j13 > this.h) {
                    j13 = -9223372036854775807L;
                    j11 = -9223372036854775807L;
                    r2Var.b(r2.D, this.s, cVar, this.b, this.c, this.d, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? false : true, this.v, j13, this.h, 0, h() - 1, this.f);
                    return r2Var;
                }
            }
            long j15 = this.f + j13;
            long d = cVar.d(0);
            int i11 = 0;
            while (i11 < cVar.m.size() - 1 && j15 >= d) {
                j15 -= d;
                i11++;
                d = cVar.d(i11);
            }
            n4.h b10 = cVar.b(i11);
            List list = b10.c;
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
                if (((n4.a) list.get(i12)).b == 2) {
                    break;
                }
                i12++;
                j14 = j12;
            }
            if (i12 != -1 && (c10 = ((n4.m) ((n4.a) b10.c.get(i12)).c.get(0)).c()) != null && c10.F(d) != j12) {
                j13 = (c10.a(c10.y(j15, d)) + j13) - j15;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        r2Var.b(r2.D, this.s, cVar, this.b, this.c, this.d, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? false : true, this.v, j13, this.h, 0, h() - 1, this.f);
        return r2Var;
    }

    @Override // h3.s2
    public final int o() {
        return 1;
    }
}
