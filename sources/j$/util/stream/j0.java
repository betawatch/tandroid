package j$.util.stream;

import java.util.function.LongConsumer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
