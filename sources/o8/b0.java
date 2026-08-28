package o8;

import j$.util.Map;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b0 implements Map, Serializable, j$.util.Map {
    public transient n0 a;
    public transient o0 b;
    public transient p0 c;

    public static b0 a(Map map) {
        if ((map instanceof b0) && !(map instanceof SortedMap)) {
            return (b0) map;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        boolean z10 = entrySet != null;
        a6.a aVar = new a6.a(z10 ? entrySet.size() : 4, 17);
        if (z10) {
            int size = entrySet.size() * 2;
            Object[] objArr = (Object[]) aVar.b;
            if (size > objArr.length) {
                aVar.b = Arrays.copyOf(objArr, w.d(objArr.length, size));
            }
        }
        for (Map.Entry entry : entrySet) {
            aVar.j(entry.getKey(), entry.getValue());
        }
        return aVar.c();
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final c0 entrySet() {
        n0 n0Var = this.a;
        if (n0Var != null) {
            return n0Var;
        }
        q0 q0Var = (q0) this;
        n0 n0Var2 = new n0(q0Var, q0Var.e, q0Var.f);
        this.a = n0Var2;
        return n0Var2;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final u values() {
        p0 p0Var = this.c;
        if (p0Var != null) {
            return p0Var;
        }
        q0 q0Var = (q0) this;
        p0 p0Var2 = new p0(1, q0Var.f, q0Var.e);
        this.c = p0Var2;
        return p0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.-CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.-CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.-CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return l.c(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.-CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return l.h(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((q0) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        o0 o0Var = this.b;
        if (o0Var != null) {
            return o0Var;
        }
        q0 q0Var = (q0) this;
        o0 o0Var2 = new o0(q0Var, new p0(0, q0Var.f, q0Var.e));
        this.b = o0Var2;
        return o0Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.-CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.-CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.-CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.-CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.-CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i9 = ((q0) this).f;
        l.a(i9, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i9 * 8, 1073741824L));
        sb2.append('{');
        x0 it = ((n0) entrySet()).iterator();
        boolean z10 = true;
        while (true) {
            x xVar = (x) it;
            if (!xVar.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) xVar.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.-CC.$default$replace(this, obj, obj2, obj3);
    }
}
