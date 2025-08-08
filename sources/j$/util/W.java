package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class W extends A implements G {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        A.f(this, consumer);
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
        return A.m(this, consumer);
    }

    @Override // j$.util.A, j$.util.D, j$.util.M, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ G trySplit() {
        return null;
    }

    @Override // j$.util.A, j$.util.D, j$.util.M, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ M trySplit() {
        return null;
    }

    @Override // j$.util.G
    /* renamed from: c */
    public final void e(j$.util.function.G g) {
        g.getClass();
    }

    @Override // j$.util.G
    /* renamed from: g */
    public final boolean p(j$.util.function.G g) {
        g.getClass();
        return false;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
