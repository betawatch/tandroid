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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class g3 extends j3 implements NavigableMap {
    public final /* synthetic */ fj7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(fj7 fj7Var, NavigableMap navigableMap) {
        super(fj7Var, navigableMap);
        this.n = fj7Var;
    }

    @Override // j3
    public final SortedSet c() {
        return new h3(this.n, e());
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

    @Override // j3
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
        return new g3(this.n, e().descendingMap());
    }

    public final ko5 f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection m = this.n.m();
        m.addAll((Collection) entry.getValue());
        it.remove();
        return new ko5(entry.getKey(), DesugarCollections.unmodifiableList((List) m));
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

    @Override // j3
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.d);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new g3(this.n, e().headMap(obj, z));
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

    @Override // j3, e3, java.util.AbstractMap, java.util.Map
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
        return f(((c3) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return f(((c3) ((e3) descendingMap()).entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new g3(this.n, e().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new g3(this.n, e().tailMap(obj, z));
    }

    @Override // j3, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // j3, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // j3, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
