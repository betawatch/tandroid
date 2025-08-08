package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class B implements D {
    public final /* synthetic */ Spliterator.OfDouble a;

    private /* synthetic */ B(Spliterator.OfDouble ofDouble) {
        this.a = ofDouble;
    }

    public static /* synthetic */ D b(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C ? ((C) ofDouble).a : new B(ofDouble);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.D
    /* renamed from: e */
    public final /* synthetic */ void forEachRemaining(j$.util.function.l lVar) {
        this.a.forEachRemaining(j$.util.function.k.a(lVar));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfDouble ofDouble = this.a;
        if (obj instanceof B) {
            obj = ((B) obj).a;
        }
        return ofDouble.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.M
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void e(Object obj) {
        this.a.forEachRemaining((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.D
    /* renamed from: p */
    public final /* synthetic */ boolean tryAdvance(j$.util.function.l lVar) {
        return this.a.tryAdvance(j$.util.function.k.a(lVar));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return this.a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.M
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean p(Object obj) {
        return this.a.tryAdvance((Spliterator.OfDouble) obj);
    }

    @Override // j$.util.D, j$.util.M, j$.util.Spliterator
    public final /* synthetic */ D trySplit() {
        return b(this.a.trySplit());
    }

    @Override // j$.util.M, j$.util.Spliterator
    public final /* synthetic */ M trySplit() {
        return K.b(this.a.trySplit());
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return N.b(this.a.trySplit());
    }
}
