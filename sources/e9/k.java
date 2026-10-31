package e9;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class k extends f implements SortedSet {
    public final /* synthetic */ p1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p1 p1Var, SortedMap sortedMap) {
        super(p1Var, sortedMap);
        this.d = p1Var;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return l().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return l().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new k(this.d, l().headMap(obj));
    }

    public SortedMap l() {
        return (SortedMap) this.b;
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return l().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new k(this.d, l().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new k(this.d, l().tailMap(obj));
    }
}
