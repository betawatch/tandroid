package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class D extends H implements d2 {
    public static final C c;
    public static final C d;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.H, j$.util.stream.g2
    public final void accept(double d2) {
        s(Double.valueOf(d2));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return new j$.util.z(((Double) this.b).doubleValue());
        }
        return null;
    }

    static {
        T2 t2 = T2.DOUBLE_VALUE;
        j$.util.z zVar = j$.util.z.c;
        c = new C(true, t2, zVar, new n(10), new n(11));
        d = new C(false, t2, zVar, new n(10), new n(11));
    }
}
