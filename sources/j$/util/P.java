package j$.util;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class P extends p0 {
    public final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.p0, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}
