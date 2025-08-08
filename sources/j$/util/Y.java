package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class Y extends A implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return A.k(this, i);
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        consumer.getClass();
    }

    @Override // j$.util.Spliterator
    public final boolean s(Consumer consumer) {
        consumer.getClass();
        return false;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
