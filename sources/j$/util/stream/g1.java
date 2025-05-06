package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class g1 extends h1 implements j$.util.J {
    g1(E0 e0) {
        super(e0);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.n(this, consumer);
    }
}
