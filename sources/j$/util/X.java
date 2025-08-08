package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class X extends A implements J {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        A.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return A.k(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return A.n(this, consumer);
    }

    @Override // j$.util.A, j$.util.D, j$.util.M, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ J trySplit() {
        return null;
    }

    @Override // j$.util.A, j$.util.D, j$.util.M, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ M trySplit() {
        return null;
    }

    @Override // j$.util.J
    /* renamed from: d */
    public final void e(j$.util.function.Y y) {
        y.getClass();
    }

    @Override // j$.util.J
    /* renamed from: i */
    public final boolean p(j$.util.function.Y y) {
        y.getClass();
        return false;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
