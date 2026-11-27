package j$.util.stream;

import java.util.function.DoubleConsumer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class h0 extends l0 implements k5 {
    public static final g0 c;
    public static final g0 d;

    static {
        c7 c7Var = c7.DOUBLE_VALUE;
        q qVar = new q((byte) 10);
        q qVar2 = new q((byte) 11);
        j$.util.b0 b0Var = j$.util.b0.c;
        c = new g0(true, c7Var, b0Var, qVar, qVar2);
        d = new g0(false, c7Var, b0Var, new q((byte) 10), new q((byte) 11));
    }

    @Override // j$.util.stream.l0, j$.util.stream.n5, j$.util.stream.k5, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        x(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.time.a.b(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.b0(((Double) this.b).doubleValue());
        }
        return null;
    }
}
