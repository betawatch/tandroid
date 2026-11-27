// default package

import java.util.function.LongSupplier;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
