// default package

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ob3 extends zme implements Map {
    public final Map b;

    public ob3(Map map) {
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
        qk6 qk6Var = new qk6(entrySet().iterator());
        if (obj == null) {
            while (qk6Var.hasNext()) {
                if (qk6Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (qk6Var.hasNext()) {
            if (obj.equals(qk6Var.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // zme
    public final Object d() {
        return this.b;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return qye.b(this.b.entrySet(), new nb3((byte) 0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && use.b(this, obj);
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
        return qye.c(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.b;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override // java.util.Map
    public final Set keySet() {
        return qye.b(this.b.keySet(), new nb3((byte) 1));
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
