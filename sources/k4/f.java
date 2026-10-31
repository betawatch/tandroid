package k4;

import c3.a0;
import c3.b0;
import c3.c0;
import e2.l0;
import f2.u;
import java.math.RoundingMode;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class f implements b0 {
    public final u a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public f(u uVar, int i10, long j10, long j11) {
        this.a = uVar;
        this.b = i10;
        this.c = j10;
        long j12 = (j11 - j10) / uVar.c;
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
        u uVar = this.a;
        long j11 = this.d;
        long j12 = l0.j((uVar.b * j10) / (this.b * 1000000), 0L, j11 - 1);
        long j13 = this.c;
        long i10 = i(j12);
        c0 c0Var = new c0(i10, (uVar.c * j12) + j13);
        if (i10 >= j10 || j12 == j11 - 1) {
            return new a0(c0Var, c0Var);
        }
        long j14 = j12 + 1;
        return new a0(c0Var, new c0(i(j14), (uVar.c * j14) + j13));
    }

    @Override // c3.b0
    public final long h() {
        return this.e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.b;
        long j12 = this.a.b;
        String str = l0.a;
        return l0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
