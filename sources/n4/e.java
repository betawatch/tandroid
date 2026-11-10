package n4;

import f3.b0;
import f3.c0;
import f3.d0;
import h2.m0;
import i2.s;
import java.math.RoundingMode;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e implements c0 {
    public final s a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public e(s sVar, int i7, long j3, long j10) {
        this.a = sVar;
        this.b = i7;
        this.c = j3;
        long j11 = (j10 - j3) / sVar.c;
        this.d = j11;
        this.e = i(j11);
    }

    @Override // f3.c0
    public final boolean d() {
        return true;
    }

    @Override // f3.c0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.c0
    public final b0 f(long j3) {
        s sVar = this.a;
        long j10 = this.d;
        long j11 = m0.j((sVar.b * j3) / (this.b * 1000000), 0L, j10 - 1);
        long j12 = this.c;
        long i7 = i(j11);
        d0 d0Var = new d0(i7, (sVar.c * j11) + j12);
        if (i7 >= j3 || j11 == j10 - 1) {
            return new b0(d0Var, d0Var);
        }
        long j13 = j11 + 1;
        return new b0(d0Var, new d0(i(j13), (sVar.c * j13) + j12));
    }

    @Override // f3.c0
    public final long h() {
        return this.e;
    }

    public final long i(long j3) {
        long j10 = j3 * this.b;
        long j11 = this.a.b;
        String str = m0.a;
        return m0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }
}
