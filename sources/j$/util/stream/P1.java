package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class P1 extends R1 implements e2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void s(Object obj) {
        s((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.d(this, longConsumer);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void s(Long l) {
        q1.i(this, l);
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
    public final void accept(long j) {
        this.b++;
    }
}
