package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;
import java.util.Spliterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements G {
    public final /* synthetic */ Spliterator.OfInt a;

    private /* synthetic */ E(Spliterator.OfInt ofInt) {
        this.a = ofInt;
    }

    public static /* synthetic */ G b(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof F ? ((F) ofInt).a : new E(ofInt);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        this.a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.G
    /* renamed from: c */
    public final /* synthetic */ void forEachRemaining(j$.util.function.G g) {
        this.a.forEachRemaining(j$.util.function.F.a(g));
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator.OfInt ofInt = this.a;
        if (obj instanceof E) {
            obj = ((E) obj).a;
        }
        return ofInt.equals(obj);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.M
    /* renamed from: forEachRemaining */
    public final /* synthetic */ void e(Object obj) {
        this.a.forEachRemaining((Spliterator.OfInt) obj);
    }

    @Override // j$.util.G
    /* renamed from: g */
    public final /* synthetic */ boolean tryAdvance(j$.util.function.G g) {
        return this.a.tryAdvance(j$.util.function.F.a(g));
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

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return this.a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    @Override // j$.util.M
    /* renamed from: tryAdvance */
    public final /* synthetic */ boolean p(Object obj) {
        return this.a.tryAdvance((Spliterator.OfInt) obj);
    }

    @Override // j$.util.G, j$.util.M, j$.util.Spliterator
    public final /* synthetic */ G trySplit() {
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
