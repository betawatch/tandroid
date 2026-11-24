// default package

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ft2 extends ns2 {
    public int d;
    public fs e;
    public TimeUnit f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [et2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ft2, ns2] */
    public final gt2 u(bt2 bt2Var) {
        if (this.e == null) {
            long j = this.d;
            r(j >= 0 && j <= Long.MAX_VALUE, Long.valueOf(j));
        }
        if (this.f == null) {
            throw new IllegalStateException("ConfigTime " + s() + " without a unit");
        }
        String s = s();
        fs fsVar = this.e;
        if (fsVar == null) {
            final long j2 = this.d;
            fsVar = new LongSupplier(j2) { // from class: et2
                public final /* synthetic */ int a;

                {
                    this.a = (int) j2;
                }

                @Override // java.util.function.LongSupplier
                public final long getAsLong() {
                    return this.a;
                }
            };
        }
        gt2 gt2Var = new gt2(s, fsVar, this.f, this.a);
        q(bt2Var, gt2Var);
        return gt2Var;
    }

    public final void v(long j) {
        this.d = (int) j;
        this.e = null;
    }
}
