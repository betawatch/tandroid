package h9;

import a8.kb;
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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e extends h implements NavigableMap {
    public final /* synthetic */ l1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l1 l1Var, NavigableMap navigableMap) {
        super(l1Var, navigableMap);
        this.n = l1Var;
    }

    @Override // h9.h
    public final SortedSet c() {
        return new f(this.n, e());
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

    @Override // h9.h
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
        return new e(this.n, e().descendingMap());
    }

    public final e0 f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection h = this.n.h();
        h.addAll((Collection) entry.getValue());
        it.remove();
        return new e0(entry.getKey(), DesugarCollections.unmodifiableList((List) h));
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

    @Override // h9.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.b);
    }

    @Override // h9.h, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
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

    @Override // h9.h, a8.kb, java.util.AbstractMap, java.util.Map
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
        return f(((c) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return f(((c) ((kb) descendingMap()).entrySet()).iterator());
    }

    @Override // h9.h, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // h9.h, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z9) {
        return new e(this.n, e().headMap(obj, z9));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z9, Object obj2, boolean z10) {
        return new e(this.n, e().subMap(obj, z9, obj2, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z9) {
        return new e(this.n, e().tailMap(obj, z9));
    }
}
