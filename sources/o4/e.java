package o4;

import f5.d0;
import j3.b1;
import j3.f1;
import j3.p2;
import j3.q2;
import j3.r2;
import java.util.List;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class e extends r2 {
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final long f;
    public final long h;
    public final long n;
    public final p4.c r;
    public final f1 s;
    public final b1 v;

    public e(long j10, long j11, long j12, int i10, long j13, long j14, long j15, p4.c cVar, f1 f1Var, b1 b1Var) {
        f5.a.i(cVar.d == (b1Var != null));
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

    @Override // j3.r2
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.e) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // j3.r2
    public final p2 f(int i10, p2 p2Var, boolean z10) {
        f5.a.h(i10, h());
        p4.c cVar = this.r;
        String str = z10 ? cVar.b(i10).a : null;
        Integer valueOf = z10 ? Integer.valueOf(this.e + i10) : null;
        long d = cVar.d(i10);
        long H = d0.H(cVar.b(i10).b - cVar.b(0).b) - this.f;
        p2Var.getClass();
        p2Var.h(str, valueOf, 0, d, H, m4.c.f, false);
        return p2Var;
    }

    @Override // j3.r2
    public final int h() {
        return this.r.m.size();
    }

    @Override // j3.r2
    public final Object l(int i10) {
        f5.a.h(i10, h());
        return Integer.valueOf(this.e + i10);
    }

    @Override // j3.r2
    public final q2 m(int i10, q2 q2Var, long j10) {
        long j11;
        long j12;
        i c3;
        f5.a.h(i10, 1);
        p4.c cVar = this.r;
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
            int i11 = 0;
            while (i11 < cVar.m.size() - 1 && j15 >= d) {
                j15 -= d;
                i11++;
                d = cVar.d(i11);
            }
            p4.h b10 = cVar.b(i11);
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
                if (((p4.a) list.get(i12)).b == 2) {
                    break;
                }
                i12++;
                j14 = j12;
            }
            if (i12 != -1 && (c3 = ((p4.m) ((p4.a) b10.c.get(i12)).c.get(0)).c()) != null && c3.F(d) != j12) {
                j13 = (c3.b(c3.r(j15, d)) + j13) - j15;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        q2Var.b(q2.D, this.s, cVar, this.b, this.c, this.d, true, (cVar.d || cVar.e == j11 || cVar.b != j11) ? false : true, this.v, j13, this.h, 0, h() - 1, this.f);
        return q2Var;
    }

    @Override // j3.r2
    public final int o() {
        return 1;
    }
}
