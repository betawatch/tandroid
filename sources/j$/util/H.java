package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class H implements J {
    public final /* synthetic */ Spliterator.OfLong a;

    private /* synthetic */ H(Spliterator.OfLong ofLong) {
        this.a = ofLong;
    }

    public static /* synthetic */ J b(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof I ? ((I) ofLong).a : new H(ofLong);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.J
    /* renamed from: d */
    public final /* synthetic */ void forEachRemaining(j$.util.function.T t) {
        this.a.forEachRemaining(j$.util.function.S.a(t));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfLong ofLong = this.a;
        if (obj instanceof H) {
            obj = ((H) obj).a;
        }
        return ofLong.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.M
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void e(Object obj) {
        this.a.forEachRemaining((Spliterator.OfLong) obj);
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

    @Override // j$.util.J
    /* renamed from: i */
    public final /* synthetic */ boolean tryAdvance(j$.util.function.T t) {
        return this.a.tryAdvance(j$.util.function.S.a(t));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return this.a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.M
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean p(Object obj) {
        return this.a.tryAdvance((Spliterator.OfLong) obj);
    }

    @Override // j$.util.J, j$.util.M, j$.util.Spliterator
    public final /* synthetic */ J trySplit() {
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
