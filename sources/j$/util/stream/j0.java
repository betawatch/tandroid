package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class j0 extends l0 implements m5 {
    public static final g0 c;
    public static final g0 d;

    static {
        c7 c7Var = c7.LONG_VALUE;
        q qVar = new q((byte) 14);
        q qVar2 = new q((byte) 15);
        j$.util.d0 d0Var = j$.util.d0.c;
        c = new g0(true, c7Var, d0Var, qVar, qVar2);
        d = new g0(false, c7Var, d0Var, new q((byte) 14), new q((byte) 15));
    }

    @Override // j$.util.stream.l0, j$.util.stream.n5
    public final void accept(long j) {
        x(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.time.a.c(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.d0(((Long) this.b).longValue());
        }
        return null;
    }
}
