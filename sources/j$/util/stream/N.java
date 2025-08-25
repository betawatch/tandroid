package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
final class N extends P implements l2 {
    final LongConsumer b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.c(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.l2
    public final /* synthetic */ void j(Long l) {
        w0.i(this, l);
    }

    @Override // j$.util.stream.G3
    public final Object b(b bVar, Spliterator spliterator) {
        bVar.U(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.G3
    public final /* bridge */ /* synthetic */ Object c(b bVar, Spliterator spliterator) {
        e(bVar, spliterator);
        return null;
    }

    N(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // j$.util.stream.P, j$.util.stream.m2
    public final void accept(long j) {
        this.b.accept(j);
    }
}
