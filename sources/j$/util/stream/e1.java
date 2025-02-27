package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class e1 extends g1 implements j$.util.G {
    e1(B0 b0) {
        super(b0);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.m(this, consumer);
    }
}
