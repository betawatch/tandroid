package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
final class V1 extends Y1 implements k2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.b(this, intConsumer);
    }

    @Override // j$.util.stream.k2
    public final /* synthetic */ void m(Integer num) {
        w0.g(this, num);
    }

    @Override // j$.util.stream.T1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.S1
    public final void g(S1 s1) {
        this.b += ((Y1) s1).b;
    }

    @Override // j$.util.stream.Y1, j$.util.stream.m2
    public final void accept(int i) {
        this.b++;
    }
}
