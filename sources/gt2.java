// default package

import java.util.concurrent.TimeUnit;
import java.util.function.LongSupplier;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class gt2 extends wh6 {
    public final TimeUnit j;

    public gt2(String str, LongSupplier longSupplier, TimeUnit timeUnit, int i) {
        super(str, longSupplier, 0L, Long.MAX_VALUE, i);
        this.j = timeUnit;
    }

    public final long g(TimeUnit timeUnit) {
        return timeUnit.convert(f(), this.j);
    }

    public final String toString() {
        return this.a + "=" + f() + " " + this.j;
    }
}
