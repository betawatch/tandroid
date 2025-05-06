package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class e1 extends h1 implements j$.util.D {
    e1(A0 a0) {
        super(a0);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return j$.util.A.l(this, consumer);
    }
}
