package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class f1 extends g1 implements j$.util.J {
    f1(D0 d0) {
        super(d0);
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
