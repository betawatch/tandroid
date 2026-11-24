package j$.util;

import java.util.Comparator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class r0 extends q1 {
    public final /* synthetic */ java.util.SortedSet f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.q1, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}
