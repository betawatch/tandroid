package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class e0 extends i0 implements g5 {
    public static final d0 c;
    public static final d0 d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.i0, j$.util.stream.j5
    public final void accept(double d9) {
        x(Double.valueOf(d9));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.b0(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        w6 w6Var = w6.DOUBLE_VALUE;
        n nVar = new n(10);
        n nVar2 = new n(11);
        j$.util.b0 b0Var = j$.util.b0.c;
        c = new d0(true, w6Var, b0Var, nVar, nVar2);
        d = new d0(false, w6Var, b0Var, new n(10), new n(11));
    }
}
