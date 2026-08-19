package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class O1 extends R1 implements d2 {
    @Override // j$.util.stream.d2
    public final /* synthetic */ void A(Integer num) {
        q1.g(this, num);
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        A((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.c(this, intConsumer);
    }

    @Override // j$.util.stream.M1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.L1
    public final void n(L1 l1) {
        this.b += ((R1) l1).b;
    }

    @Override // j$.util.stream.R1, j$.util.stream.f2
    public final void accept(int i) {
        this.b++;
    }
}
