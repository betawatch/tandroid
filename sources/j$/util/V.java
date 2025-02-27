package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class V extends A implements D {
    V() {
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        A.b(this, consumer);
    }

    @Override // j$.util.D
    public final void e(j$.util.function.m mVar) {
        mVar.getClass();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return A.k(this, i);
    }

    @Override // j$.util.D
    public final boolean p(j$.util.function.m mVar) {
        mVar.getClass();
        return false;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return A.l(this, consumer);
    }

    @Override // j$.util.A, j$.util.D, j$.util.M, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ D trySplit() {
        return null;
    }

    @Override // j$.util.A, j$.util.D, j$.util.M, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ M trySplit() {
        return null;
    }
}
