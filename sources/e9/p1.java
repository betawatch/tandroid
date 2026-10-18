package e9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class p1 extends p implements f1, Serializable {
    public final transient Map e;
    public transient int f;
    public transient o1 h;

    public p1(Map map) {
        u6.g(map.isEmpty());
        this.e = map;
    }

    @Override // e9.n1
    public final void clear() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // e9.p
    public final Map d() {
        Map map = this.e;
        return map instanceof NavigableMap ? new g(this, (NavigableMap) map) : map instanceof SortedMap ? new j(this, (SortedMap) map) : new e(this, map, 0);
    }

    @Override // e9.p
    public final Collection e() {
        return new o(this, 0);
    }

    @Override // e9.p
    public final Set f() {
        Map map = this.e;
        return map instanceof NavigableMap ? new h(this, (NavigableMap) map) : map instanceof SortedMap ? new k(this, (SortedMap) map) : new f(this, map);
    }

    @Override // e9.p
    public final Iterator g() {
        return new b(this, 1);
    }

    @Override // e9.n1
    public final Collection get(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new i(this, obj, list, null) : new m(this, obj, list, (m) null);
    }

    public final Collection h() {
        return (List) this.h.get();
    }

    @Override // e9.n1
    public final int size() {
        return this.f;
    }
}
