package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
final class U1 extends Y1 implements j2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.j2
    public final /* synthetic */ void p(Double d) {
        w0.e(this, d);
    }

    @Override // j$.util.stream.T1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.S1
    public final void g(S1 s1) {
        this.b += ((Y1) s1).b;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.m2, j$.util.stream.j2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b++;
    }
}
