package e9;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import v7.t6;
import w7.g9;
import w7.m8;
import z7.mg;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class o extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((p) this.b).clear();
                break;
            case 1:
                ((p1) this.b).clear();
                break;
            case 2:
                ((x) this.b).clear();
                break;
            case 3:
                ((AbstractMap) this.b).clear();
                break;
            case 4:
                ((x7.j) this.b).clear();
                break;
            case 5:
                ((e) this.b).clear();
                break;
            case 6:
                ((z7.d) this.b).clear();
                break;
            default:
                ((e) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                p pVar = (p) this.b;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) pVar.b().get(key);
                return collection != null && collection.contains(value);
            case 1:
                return ((p1) this.b).c(obj);
            case 2:
            case 4:
            case 6:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) this.b).containsValue(obj);
            case 5:
                return ((e) this.b).containsValue(obj);
            case 7:
                return ((e) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 3:
                return ((AbstractMap) this.b).isEmpty();
            case 4:
            case 6:
            default:
                return super.isEmpty();
            case 5:
                return ((e) this.b).isEmpty();
            case 7:
                return ((e) this.b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((p) this.b).g();
            case 1:
                return new b((p1) this.b, 0);
            case 2:
                x xVar = (x) this.b;
                Map c10 = xVar.c();
                return c10 != null ? c10.values().iterator() : new t(xVar, 2);
            case 3:
                return new k1(((AbstractMap) this.b).entrySet().iterator());
            case 4:
                x7.j jVar = (x7.j) this.b;
                Map a2 = jVar.a();
                return a2 != null ? a2.values().iterator() : new x7.g(jVar, 2);
            case 5:
                return new com.google.android.gms.internal.clearcut.g1(((e) this.b).entrySet().iterator(), 1);
            case 6:
                z7.d dVar = (z7.d) this.b;
                Map a10 = dVar.a();
                return a10 != null ? a10.values().iterator() : new z7.a(dVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.g1(((e) this.b).entrySet().iterator(), 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((p) this.b).remove(entry.getKey(), entry.getValue());
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (t6.a(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 5:
                e eVar = (e) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : eVar.entrySet()) {
                        if (m8.a(obj, entry3.getValue())) {
                            eVar.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                e eVar2 = (e) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : eVar2.entrySet()) {
                        if (g9.a(obj, entry4.getValue())) {
                            eVar2.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            case 4:
            case 6:
            default:
                return super.removeAll(collection);
            case 5:
                e eVar = (e) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : eVar.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((x7.f) eVar.e).b().removeAll(hashSet2);
                }
            case 7:
                e eVar2 = (e) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : eVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((mg) eVar2.e).b().removeAll(hashSet3);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            case 4:
            case 6:
            default:
                return super.retainAll(collection);
            case 5:
                e eVar = (e) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : eVar.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((x7.f) eVar.e).b().retainAll(hashSet2);
                }
            case 7:
                e eVar2 = (e) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : eVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((mg) eVar2.e).b().retainAll(hashSet3);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((p) this.b).size();
            case 1:
                return ((p1) this.b).f;
            case 2:
                return ((x) this.b).size();
            case 3:
                return ((AbstractMap) this.b).size();
            case 4:
                return ((x7.j) this.b).size();
            case 5:
                return ((e) this.b).b.size();
            case 6:
                return ((z7.d) this.b).size();
            default:
                return ((e) this.b).b.size();
        }
    }

    public /* synthetic */ o(AbstractMap abstractMap, int i10) {
        this.a = i10;
        this.b = abstractMap;
    }
}
