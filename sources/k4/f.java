package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.d0;
import e2.q;
import java.math.RoundingMode;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class f implements b0 {
    public final q a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public f(q qVar, int i10, long j3, long j10) {
        this.a = qVar;
        this.b = i10;
        this.c = j3;
        long j11 = (j10 - j3) / qVar.c;
        this.d = j11;
        this.e = b(j11);
    }

    public final long b(long j3) {
        long j10 = j3 * this.b;
        long j11 = this.a.b;
        String str = d0.a;
        return d0.Y(j10, 1000000L, j11, RoundingMode.DOWN);
    }

    @Override // c3.b0
    public final boolean f() {
        return true;
    }

    @Override // c3.b0
    public final a0 j(long j3) {
        q qVar = this.a;
        long j10 = this.d;
        long i10 = d0.i((qVar.b * j3) / (this.b * 1000000), 0L, j10 - 1);
        long j11 = this.c;
        long b10 = b(i10);
        c0 c0Var = new c0(b10, (qVar.c * i10) + j11);
        if (b10 >= j3 || i10 == j10 - 1) {
            return new a0(c0Var, c0Var);
        }
        long j12 = i10 + 1;
        return new a0(c0Var, new c0(b(j12), (qVar.c * j12) + j11));
    }

    @Override // c3.b0
    public final long l() {
        return this.e;
    }
}
