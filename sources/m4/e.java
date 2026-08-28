package m4;

import d5.f0;
import h3.b1;
import h3.f1;
import h3.p2;
import h3.q2;
import h3.r2;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends r2 {
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

    public e(long j10, long j11, long j12, int i9, long j13, long j14, long j15, n4.c cVar, f1 f1Var, b1 b1Var) {
        d5.a.i(cVar.d == (b1Var != null));
        this.b = j10;
        this.c = j11;
        this.d = j12;
        this.e = i9;
        this.f = j13;
        this.h = j14;
        this.n = j15;
        this.r = cVar;
        this.s = f1Var;
        this.v = b1Var;
    }

    @Override // h3.r2
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // h3.r2
    public final p2 f(int i9, p2 p2Var, boolean z10) {
        d5.a.h(i9, h());
        n4.c cVar = this.r;
        String str = z10 ? cVar.b(i9).a : null;
        Integer valueOf = z10 ? Integer.valueOf(this.e + i9) : null;
        long d = cVar.d(i9);
        long H = f0.H(cVar.b(i9).b - cVar.b(0).b) - this.f;
        p2Var.getClass();
        p2Var.h(str, valueOf, 0, d, H, k4.b.f, false);
        return p2Var;
    }

    @Override // h3.r2
    public final int h() {
        return this.r.m.size();
    }

    @Override // h3.r2
    public final Object l(int i9) {
        d5.a.h(i9, h());
        return Integer.valueOf(this.e + i9);
    }

    @Override // h3.r2
    public final q2 m(int i9, q2 q2Var, long j10) {
        long j11;
        long j12;
        h c10;
        d5.a.h(i9, 1);
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
                    q2Var.b(q2.D, this.s, cVar, this.b, this.c, this.d, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? false : true, this.v, j13, this.h, 0, h() - 1, this.f);
                    return q2Var;
                }
            }
            long j15 = this.f + j13;
            long d = cVar.d(0);
            int i10 = 0;
            while (i10 < cVar.m.size() - 1 && j15 >= d) {
                j15 -= d;
                i10++;
                d = cVar.d(i10);
            }
            n4.h b10 = cVar.b(i10);
            List list = b10.c;
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
                if (((n4.a) list.get(i11)).b == 2) {
                    break;
                }
                i11++;
                j14 = j12;
            }
            if (i11 != -1 && (c10 = ((n4.m) ((n4.a) b10.c.get(i11)).c.get(0)).c()) != null && c10.z(d) != j12) {
                j13 = (c10.a(c10.q(j15, d)) + j13) - j15;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        q2Var.b(q2.D, this.s, cVar, this.b, this.c, this.d, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? false : true, this.v, j13, this.h, 0, h() - 1, this.f);
        return q2Var;
    }

    @Override // h3.r2
    public final int o() {
        return 1;
    }
}
