// default package

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f3 extends i3 implements NavigableMap {
    public final /* synthetic */ zi7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(zi7 zi7Var, NavigableMap navigableMap) {
        super(zi7Var, navigableMap);
        this.n = zi7Var;
    }

    @Override // i3
    public final SortedSet c() {
        return new g3(this.n, e());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = e().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return b(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return e().ceilingKey(obj);
    }

    @Override // i3
    /* renamed from: d */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new f3(this.n, e().descendingMap());
    }

    public final ho5 f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection m = this.n.m();
        m.addAll((Collection) entry.getValue());
        it.remove();
        return new ho5(entry.getKey(), DesugarCollections.unmodifiableList((List) m));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = e().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return b(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = e().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return b(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return e().floorKey(obj);
    }

    @Override // i3
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.d);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new f3(this.n, e().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = e().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return b(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return e().higherKey(obj);
    }

    @Override // i3, d3, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = e().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return b(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = e().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return b(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return e().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return f(((b3) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return f(((b3) ((d3) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new f3(this.n, e().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new f3(this.n, e().tailMap(obj, z));
    }

    @Override // i3, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // i3, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // i3, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
