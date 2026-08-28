package o8;

import h7.wa;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h0 extends k implements Serializable {
    public transient Map d;
    public transient int e;
    public transient g0 f;

    @Override // o8.k
    public final wa a() {
        wa waVar = this.c;
        if (waVar != null) {
            return waVar;
        }
        Map map = this.d;
        wa dVar = map instanceof NavigableMap ? new d(this, (NavigableMap) map) : map instanceof SortedMap ? new g(this, (SortedMap) map) : new wa(this, map, 2);
        this.c = dVar;
        return dVar;
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
}
