package n4;

import f3.a0;
import f3.b0;
import f3.c0;
import h2.l0;
import i2.s;
import java.math.RoundingMode;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class e implements b0 {
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

    @Override // f3.b0
    public final boolean d() {
        return true;
    }

    @Override // f3.b0
    public final /* synthetic */ boolean e() {
        return false;
    }

    @Override // f3.b0
    public final a0 f(long j3) {
        s sVar = this.a;
        long j10 = this.d;
        long j11 = l0.j((sVar.b * j3) / (this.b * 1000000), 0L, j10 - 1);
        long j12 = this.c;
        long i7 = i(j11);
        c0 c0Var = new c0(i7, (sVar.c * j11) + j12);
        if (i7 >= j3 || j11 == j10 - 1) {
            return new a0(c0Var, c0Var);
        }
        long j13 = j11 + 1;
        return new a0(c0Var, new c0(i(j13), (sVar.c * j13) + j12));
    }

    @Override // f3.b0
    public final long h() {
        return this.e;
    }

    public final long i(long j3) {
        long j10 = j3 * this.b;
        long j11 = this.a.b;
        String str = l0.a;
        return l0.a0(j10, 1000000L, j11, RoundingMode.DOWN);
    }
}
