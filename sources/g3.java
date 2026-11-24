// default package

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g3 extends j3 implements NavigableSet {
    public final /* synthetic */ zi7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(zi7 zi7Var, NavigableMap navigableMap) {
        super(zi7Var, navigableMap);
        this.e = zi7Var;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return h().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((e3) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new g3(this.e, h().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return h().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new g3(this.e, h().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return h().higherKey(obj);
    }

    @Override // j3
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
        c3 c3Var = (c3) iterator();
        if (!c3Var.hasNext()) {
            return null;
        }
        Object next = c3Var.next();
        c3Var.remove();
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
        return new g3(this.e, h().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new g3(this.e, h().tailMap(obj, z));
    }

    @Override // j3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // j3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // j3, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
