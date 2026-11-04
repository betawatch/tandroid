package g9;

import b8.ah;
import b8.mb;
import b8.zb;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k1 extends l implements a1, Serializable {
    public final transient Map e;
    public transient int f;
    public transient j1 h;

    public k1(Map map) {
        zb.f(map.isEmpty());
        this.e = map;
    }

    @Override // g9.i1
    public final void clear() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // g9.l
    public final Map d() {
        Map map = this.e;
        return map instanceof NavigableMap ? new e(this, (NavigableMap) map) : map instanceof SortedMap ? new h(this, (SortedMap) map) : new mb(this, map, 1);
    }

    @Override // g9.l
    public final Collection e() {
        return new b8.f(this, 2);
    }

    @Override // g9.l
    public final Set f() {
        Map map = this.e;
        return map instanceof NavigableMap ? new f(this, (NavigableMap) map) : map instanceof SortedMap ? new i(this, (SortedMap) map) : new d(this, map);
    }

    @Override // g9.l
    public final Iterator g() {
        return new b(this, 1);
    }

    @Override // g9.i1
    public final Collection get(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new g(this, obj, list, null) : new ah(this, obj, list, (ah) null);
    }

    public final Collection h() {
        return (List) this.h.get();
    }

    @Override // g9.i1
    public final int size() {
        return this.f;
    }
}
