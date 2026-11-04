package m4;

import e3.a0;
import e3.b0;
import e3.c0;
import g2.n0;
import h2.s;
import java.math.RoundingMode;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements b0 {
    public final s a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public e(s sVar, int i3, long j10, long j11) {
        this.a = sVar;
        this.b = i3;
        this.c = j10;
        long j12 = (j11 - j10) / sVar.c;
        this.d = j12;
        this.e = i(j12);
    }

    @Override // e3.b0
    public final boolean d() {
        return true;
    }

    @Override // e3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // e3.b0
    public final a0 f(long j10) {
        s sVar = this.a;
        long j11 = this.d;
        long j12 = n0.j((sVar.b * j10) / (this.b * 1000000), 0L, j11 - 1);
        long j13 = this.c;
        long i3 = i(j12);
        c0 c0Var = new c0(i3, (sVar.c * j12) + j13);
        if (i3 >= j10 || j12 == j11 - 1) {
            return new a0(c0Var, c0Var);
        }
        long j14 = j12 + 1;
        return new a0(c0Var, new c0(i(j14), (sVar.c * j14) + j13));
    }

    @Override // e3.b0
    public final long h() {
        return this.e;
    }

    public final long i(long j10) {
        long j11 = j10 * this.b;
        long j12 = this.a.b;
        String str = n0.a;
        return n0.a0(j11, 1000000L, j12, RoundingMode.DOWN);
    }
}
