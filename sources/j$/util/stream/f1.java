package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class f1 extends h1 implements j$.util.G {
    f1(C0 c0) {
        super(c0);
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
