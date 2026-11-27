// default package

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class ns2 extends vr2 {
    public int d;
    public gr e;
    public TimeUnit f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [ms2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [ns2, vr2] */
    public final os2 u(js2 js2Var) {
        if (this.e == null) {
            long j = this.d;
            r(j >= 0 && j <= Long.MAX_VALUE, Long.valueOf(j));
        }
        if (this.f == null) {
            throw new IllegalStateException("ConfigTime " + s() + " without a unit");
        }
        String s = s();
        gr grVar = this.e;
        if (grVar == null) {
            final long j2 = this.d;
            grVar = new LongSupplier(j2) { // from class: ms2
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
        os2 os2Var = new os2(s, grVar, this.f, this.a);
        q(js2Var, os2Var);
        return os2Var;
    }

    public final void v(long j) {
        this.d = (int) j;
        this.e = null;
    }
}
