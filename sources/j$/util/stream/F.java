package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class F extends J implements j2 {
    static final E c;
    static final E d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.J, j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d2) {
        p(Double.valueOf(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return j$.util.B.d(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        b3 b3Var = b3.DOUBLE_VALUE;
        c = new E(true, b3Var, j$.util.B.a(), new k(13), new j(8));
        d = new E(false, b3Var, j$.util.B.a(), new k(13), new j(8));
    }
}
