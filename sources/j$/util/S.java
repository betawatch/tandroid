package j$.util;

import java.util.Comparator;

/* loaded from: classes2.dex */
final class S extends s0 {
    final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    S(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.s0, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}
