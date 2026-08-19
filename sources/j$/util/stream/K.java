package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class K extends N implements d2 {
    public final IntConsumer b;

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

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.y3
    public final Object b(a aVar, Spliterator spliterator) {
        aVar.Q(spliterator, this);
        return null;
    }

    @Override // j$.util.stream.y3
    public final /* bridge */ /* synthetic */ Object c(a aVar, Spliterator spliterator) {
        e(aVar, spliterator);
        return null;
    }

    public K(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // j$.util.stream.N, j$.util.stream.f2
    public final void accept(int i) {
        this.b.accept(i);
    }
}
