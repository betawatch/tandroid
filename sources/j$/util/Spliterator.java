package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public interface Spliterator<T> {

    public final /* synthetic */ class Wrapper implements java.util.Spliterator {
        public /* synthetic */ Wrapper() {
        }

        public static /* synthetic */ java.util.Spliterator convert(Spliterator spliterator) {
            if (spliterator == null) {
                return null;
            }
            return spliterator instanceof e1 ? ((e1) spliterator).a : spliterator instanceof d1 ? c1.a((d1) spliterator) : new Wrapper();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ int characteristics() {
            return Spliterator.this.characteristics();
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Spliterator spliterator = Spliterator.this;
            if (obj instanceof Wrapper) {
                obj = Spliterator.this;
            }
            return spliterator.equals(obj);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ long estimateSize() {
            return Spliterator.this.estimateSize();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.this.forEachRemaining(consumer);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ Comparator getComparator() {
            return Spliterator.this.getComparator();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.this.getExactSizeIfKnown();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ boolean hasCharacteristics(int i9) {
            return Spliterator.this.hasCharacteristics(i9);
        }

        public final /* synthetic */ int hashCode() {
            return Spliterator.this.hashCode();
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return Spliterator.this.tryAdvance(consumer);
        }

        @Override // java.util.Spliterator
        public final /* synthetic */ java.util.Spliterator trySplit() {
            return convert(Spliterator.this.trySplit());
        }
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i9);

    boolean tryAdvance(Consumer consumer);

    Spliterator trySplit();
}
