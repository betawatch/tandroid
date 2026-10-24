package e9;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class h extends k implements NavigableSet {
    public final /* synthetic */ p1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p1 p1Var, NavigableMap navigableMap) {
        super(p1Var, navigableMap);
        this.e = p1Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return h().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((f) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new h(this.e, h().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return h().floorKey(obj);
    }

    @Override // e9.k, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return h().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return h().lowerKey(obj);
    }

    @Override // e9.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final NavigableMap h() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        d dVar = (d) iterator();
        if (!dVar.hasNext()) {
            return null;
        }
        Object next = dVar.next();
        dVar.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // e9.k, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // e9.k, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new h(this.e, h().headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new h(this.e, h().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new h(this.e, h().tailMap(obj, z10));
    }
}
