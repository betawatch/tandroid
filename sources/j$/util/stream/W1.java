package j$.util.stream;

import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class W1 extends Y1 implements l2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // j$.util.stream.l2
    public final /* synthetic */ void j(Long l) {
        w0.i(this, l);
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
    public final void accept(long j) {
        this.b++;
    }
}
