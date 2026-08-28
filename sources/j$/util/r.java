package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class r implements Spliterator {
    public final Spliterator a;

    public r(Spliterator spliterator) {
        this.a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return this.a.tryAdvance(new j$.time.t(1, consumer));
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        this.a.forEachRemaining(new j$.time.t(1, consumer));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator trySplit = this.a.trySplit();
        if (trySplit == null) {
            return null;
        }
        return new r(trySplit);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final boolean hasCharacteristics(int i9) {
        return this.a.hasCharacteristics(i9);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }
}
