package c4;

import c2.b1;
import h5.d0;
import r3.r;
import r3.s;
import r3.t;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class f implements s {
    public final b1 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public f(b1 b1Var, int i10, long j10, long j11) {
        this.a = b1Var;
        this.b = i10;
        this.c = j10;
        long j12 = (j11 - j10) / b1Var.c;
        this.d = j12;
        this.e = d0.N(j12 * i10, 1000000L, b1Var.b);
    }

    @Override // r3.s
    public final boolean c() {
        return true;
    }

    @Override // r3.s
    public final r f(long j10) {
        b1 b1Var = this.a;
        int i10 = this.b;
        long j11 = this.d - 1;
        long i11 = d0.i((b1Var.b * j10) / (i10 * 1000000), 0L, j11);
        int i12 = b1Var.c;
        long j12 = this.c;
        long N = d0.N(i11 * i10, 1000000L, b1Var.b);
        t tVar = new t(N, (i12 * i11) + j12);
        if (N >= j10 || i11 == j11) {
            return new r(tVar, tVar);
        }
        long j13 = i11 + 1;
        return new r(tVar, new t(d0.N(j13 * i10, 1000000L, b1Var.b), (i12 * j13) + j12));
    }

    @Override // r3.s
    public final long g() {
        return this.e;
    }
}
