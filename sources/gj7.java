// default package

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gj7 extends r3 implements Serializable {
    public final transient Map e;
    public transient int f;
    public transient fj7 h;

    public gj7(Map map) {
        yve.f(map.isEmpty());
        this.e = map;
    }

    @Override // r3
    public final void b() {
        Map map = this.e;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f = 0;
    }

    @Override // r3
    public final Map d() {
        Map map = this.e;
        return map instanceof NavigableMap ? new g3(this, (NavigableMap) map) : map instanceof SortedMap ? new j3(this, (SortedMap) map) : new e3(this, map, (byte) 0);
    }

    @Override // r3
    public final Set f() {
        Map map = this.e;
        return map instanceof NavigableMap ? new h3(this, (NavigableMap) map) : map instanceof SortedMap ? new k3(this, (SortedMap) map) : new f3(this, map);
    }

    @Override // r3
    public final Collection g() {
        return super.g();
    }

    @Override // r3
    public final Iterator h() {
        return new b3(this, (byte) 1);
    }

    @Override // r3
    public final Collection i(Object obj) {
        Collection collection = (Collection) this.e.get(obj);
        if (collection == null) {
            collection = m();
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new i3(this, obj, list, null) : new m3(this, obj, list, (m3) null);
    }

    @Override // r3
    public final int l() {
        return this.f;
    }

    public final Collection m() {
        return (List) this.h.get();
    }
}
