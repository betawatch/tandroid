package f9;

import a8.dh;
import a8.pb;
import a8.yb;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class k1 extends l implements a1, Serializable {
    public final transient Map e;
    public transient int f;
    public transient j1 h;

    public k1(Map map) {
        yb.g(map.isEmpty());
        this.e = map;
    }

    @Override // f9.i1
    public final void clear() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // f9.l
    public final Map d() {
        Map map = this.e;
        return map instanceof NavigableMap ? new e(this, (NavigableMap) map) : map instanceof SortedMap ? new h(this, (SortedMap) map) : new pb(this, map, 1);
    }

    @Override // f9.l
    public final Collection e() {
        return new a8.f(this, 2);
    }

    @Override // f9.l
    public final Set f() {
        Map map = this.e;
        return map instanceof NavigableMap ? new f(this, (NavigableMap) map) : map instanceof SortedMap ? new i(this, (SortedMap) map) : new d(this, map);
    }

    @Override // f9.l
    public final Iterator g() {
        return new b(this, 1);
    }

    @Override // f9.i1
    public final Collection get(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = h();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new g(this, obj, list, null) : new dh(this, obj, list, (dh) null);
    }

    public final Collection h() {
        return (List) this.h.get();
    }

    @Override // f9.i1
    public final int size() {
        return this.f;
    }
}
