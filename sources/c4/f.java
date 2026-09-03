package c4;

import c2.a1;
import h5.d0;
import r3.r;
import r3.s;
import r3.t;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f implements s {
    public final a1 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public f(a1 a1Var, int i10, long j10, long j11) {
        this.a = a1Var;
        this.b = i10;
        this.c = j10;
        long j12 = (j11 - j10) / a1Var.c;
        this.d = j12;
        this.e = d0.N(j12 * i10, 1000000L, a1Var.b);
    }

    @Override // r3.s
    public final boolean c() {
        return true;
    }

    @Override // r3.s
    public final r f(long j10) {
        a1 a1Var = this.a;
        int i10 = this.b;
        long j11 = this.d - 1;
        long i11 = d0.i((a1Var.b * j10) / (i10 * 1000000), 0L, j11);
        int i12 = a1Var.c;
        long j12 = this.c;
        long N = d0.N(i11 * i10, 1000000L, a1Var.b);
        t tVar = new t(N, (i12 * i11) + j12);
        if (N >= j10 || i11 == j11) {
            return new r(tVar, tVar);
        }
        long j13 = i11 + 1;
        return new r(tVar, new t(d0.N(j13 * i10, 1000000L, a1Var.b), (i12 * j13) + j12));
    }

    @Override // r3.s
    public final long g() {
        return this.e;
    }
}
