package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.m0;
import f2.t;
import java.math.RoundingMode;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class f implements b0 {
    public final t a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public f(t tVar, int i10, long j10, long j11) {
        this.a = tVar;
        this.b = i10;
        this.c = j10;
        long j12 = (j11 - j10) / tVar.c;
        this.d = j12;
        this.e = i(j12);
    }

    @Override // c3.b0
    public final boolean d() {
        return true;
    }

    @Override // c3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // c3.b0
    public final a0 f(long j10) {
        t tVar = this.a;
        long j11 = this.d;
        long j12 = m0.j((tVar.b * j10) / (this.b * 1000000), 0L, j11 - 1);
        long j13 = this.c;
        long i10 = i(j12);
        c0 c0Var = new c0(i10, (tVar.c * j12) + j13);
        if (i10 >= j10 || j12 == j11 - 1) {
            return new a0(c0Var, c0Var);
        }
        long j14 = j12 + 1;
        return new a0(c0Var, new c0(i(j14), (tVar.c * j14) + j13));
    }

    @Override // c3.b0
    public final long h() {
        return this.e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.b;
        long j12 = this.a.b;
        String str = m0.a;
        return m0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
