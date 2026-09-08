package e9;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class v0 extends o implements Serializable {
    public final transient Map d;
    public transient int e;
    public transient u0 f;

    public v0(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.d = map;
    }

    @Override // e9.o
    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map map2 = this.d;
        Map fVar = map2 instanceof NavigableMap ? new f(this, (NavigableMap) map2) : map2 instanceof SortedMap ? new i(this, (SortedMap) map2) : new d(this, map2, 0);
        this.c = fVar;
        return fVar;
    }

    public final void b() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.e = 0;
    }

    public final Collection c() {
        return (List) this.f.get();
    }
}
