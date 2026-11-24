// default package

import java.util.function.LongSupplier;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class mr2 extends cr2 {
    public long d;
    public long e;
    public long f;

    public final nr2 u(qr2 qr2Var) {
        long j = this.d;
        r(j >= this.e && j <= this.f, Long.valueOf(j));
        final long j2 = this.d;
        nr2 nr2Var = new nr2(s(), new LongSupplier() { // from class: lr2
            @Override // java.util.function.LongSupplier
            public final long getAsLong() {
                return j2;
            }
        }, this.e, this.f, this.a);
        q(qr2Var, nr2Var);
        return nr2Var;
    }

    public final void v() {
        this.e = 0L;
        this.f = Long.MAX_VALUE;
    }
}
