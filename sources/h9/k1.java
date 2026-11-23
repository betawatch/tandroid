package h9;

import a8.lb;
import a8.ma;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k1 extends l implements a1, Serializable {
    public final transient Map e;
    public transient int f;
    public transient j1 h;

    public k1(Map map) {
        ma.f(map.isEmpty());
        this.e = map;
    }

    @Override // h9.i1
    public final void clear() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // h9.l
    public final Map d() {
        Map map = this.e;
        return map instanceof NavigableMap ? new e(this, (NavigableMap) map) : map instanceof SortedMap ? new h(this, (SortedMap) map) : new lb(this, map, 2);
    }

    @Override // h9.l
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override // h9.l
    public final Set f() {
        Map map = this.e;
        return map instanceof NavigableMap ? new f(this, (NavigableMap) map) : map instanceof SortedMap ? new i(this, (SortedMap) map) : new d(this, map);
    }

    @Override // h9.l
    public final Iterator g() {
        return new b(this, 1);
    }

    @Override // h9.i1
    public final Collection get(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new g(this, obj, list, null) : new a8.f(this, obj, list, (a8.f) null);
    }

    public final Collection h() {
        return (List) this.h.get();
    }

    @Override // h9.i1
    public final int size() {
        return this.f;
    }
}
