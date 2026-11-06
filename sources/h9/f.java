package h9;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class f extends i implements NavigableSet {
    public final /* synthetic */ l1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l1 l1Var, NavigableMap navigableMap) {
        super(l1Var, navigableMap);
        this.e = l1Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((d) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new f(this.e, f().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return f().floorKey(obj);
    }

    @Override // h9.i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return f().higherKey(obj);
    }

    @Override // h9.i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        a8.d dVar = (a8.d) iterator();
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

    @Override // h9.i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // h9.i, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z9) {
        return new f(this.e, f().headMap(obj, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        return new f(this.e, f().subMap(obj, z9, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z9) {
        return new f(this.e, f().tailMap(obj, z9));
    }
}
