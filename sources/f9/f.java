package f9;

import a8.ta;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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

    @Override // f9.i, java.util.SortedSet, java.util.NavigableSet
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

    @Override // f9.i
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final NavigableMap h() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        ta taVar = (ta) iterator();
        if (!taVar.hasNext()) {
            return null;
        }
        Object next = taVar.next();
        taVar.remove();
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

    @Override // f9.i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // f9.i, java.util.SortedSet, java.util.NavigableSet
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
