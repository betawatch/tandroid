package j$.util;

import java.util.Comparator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
