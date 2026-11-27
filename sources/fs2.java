// default package

import java.util.function.LongSupplier;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class fs2 extends vr2 {
    public long d;
    public long e;
    public long f;

    public final gs2 u(js2 js2Var) {
        long j = this.d;
        r(j >= this.e && j <= this.f, Long.valueOf(j));
        final long j2 = this.d;
        gs2 gs2Var = new gs2(s(), new LongSupplier() { // from class: es2
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return j2;
            }
        }, this.e, this.f, this.a);
        q(js2Var, gs2Var);
        return gs2Var;
    }

    public final void v() {
        this.e = 0L;
        this.f = Long.MAX_VALUE;
    }
}
