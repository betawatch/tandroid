// default package

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hc3 extends dke implements Map {
    public final Map b;

    public hc3(Map map) {
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
        ok6 ok6Var = new ok6(entrySet().iterator());
        if (obj == null) {
            while (ok6Var.hasNext()) {
                if (ok6Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (ok6Var.hasNext()) {
            if (obj.equals(ok6Var.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // dke
    public final Object d() {
        return this.b;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return bwe.b(this.b.entrySet(), new gc3((byte) 0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && fqe.b(this, obj);
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
        return bwe.c(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.b;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return bwe.b(this.b.keySet(), new gc3((byte) 1));
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
