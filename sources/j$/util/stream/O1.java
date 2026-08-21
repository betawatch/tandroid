package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class O1 extends S1 implements d2 {
    @Override // j$.util.stream.d2
    public final /* synthetic */ void E(Double d) {
        r1.e(this, d);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        E((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.b(this, doubleConsumer);
    }

    @Override // j$.util.stream.N1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.M1
    public final void n(M1 m1) {
        this.b += ((S1) m1).b;
    }

    @Override // j$.util.stream.S1, j$.util.stream.g2
    public final void accept(double d) {
        this.b++;
    }
}
