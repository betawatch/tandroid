package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class P1 extends S1 implements e2 {
    @Override // j$.util.stream.e2
    public final /* synthetic */ void A(Integer num) {
        r1.g(this, num);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        A((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
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
    public final void accept(int i) {
        this.b++;
    }
}
