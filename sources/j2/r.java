package j2;

import h9.d2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r extends h9.o implements Map {
    public final Map b;

    public r(Map map) {
        this.b = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.b.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((d2) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return h9.o.l(this.b.entrySet(), new q(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && h9.o.j(this, obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return h9.o.o(entrySet());
    }

    @Override // h9.o
    public final Object i() {
        return this.b;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.b;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return h9.o.l(this.b.keySet(), new q(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.b.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.b.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.b.values();
    }
}
