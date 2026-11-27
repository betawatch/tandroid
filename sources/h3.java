// default package

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h3 extends k3 implements NavigableSet {
    public final /* synthetic */ gj7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(gj7 gj7Var, NavigableMap navigableMap) {
        super(gj7Var, navigableMap);
        this.e = gj7Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return h().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((f3) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new h3(this.e, h().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return h().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new h3(this.e, h().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return h().higherKey(obj);
    }

    @Override // k3
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
        d3 d3Var = (d3) iterator();
        if (!d3Var.hasNext()) {
            return null;
        }
        Object next = d3Var.next();
        d3Var.remove();
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

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new h3(this.e, h().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new h3(this.e, h().tailMap(obj, z));
    }

    @Override // k3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // k3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // k3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
