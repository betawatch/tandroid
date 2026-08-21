package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class Q1 extends S1 implements f2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.f2
    public final /* synthetic */ void s(Long l) {
        r1.i(this, l);
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
    public final void accept(long j) {
        this.b++;
    }
}
