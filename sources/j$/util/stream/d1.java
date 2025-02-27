package j$.util.stream;

import j$.util.function.Consumer;

/* loaded from: classes2.dex */
final class d1 extends g1 implements j$.util.D {
    d1(z0 z0Var) {
        super(z0Var);
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
