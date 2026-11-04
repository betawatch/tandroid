package g9;

import b8.ra;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f extends i implements NavigableSet {
    public final /* synthetic */ k1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k1 k1Var, NavigableMap navigableMap) {
        super(k1Var, navigableMap);
        this.e = k1Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return h().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((d) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new f(this.e, h().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return h().floorKey(obj);
    }

    @Override // g9.i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return h().higherKey(obj);
    }

    @Override // g9.i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final NavigableMap h() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return h().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        ra raVar = (ra) iterator();
        if (!raVar.hasNext()) {
            return null;
        }
        Object next = raVar.next();
        raVar.remove();
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

    @Override // g9.i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // g9.i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new f(this.e, h().headMap(obj, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new f(this.e, h().subMap(obj, z10, obj2, z11));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new f(this.e, h().tailMap(obj, z10));
    }
}
