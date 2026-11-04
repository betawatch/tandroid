package b8;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class f extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((g) this.b).clear();
                break;
            case 1:
                ((mb) this.b).clear();
                break;
            case 2:
                ((g9.l) this.b).clear();
                break;
            case 3:
                ((g9.k1) this.b).clear();
                break;
            case 4:
                ((g9.s) this.b).clear();
                break;
            case 5:
                ((AbstractMap) this.b).clear();
                break;
            case 6:
                ((z7.i) this.b).clear();
                break;
            default:
                ((mb) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                return ((mb) this.b).containsValue(obj);
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                g9.l lVar = (g9.l) this.b;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) lVar.b().get(key);
                return collection != null && collection.contains(value);
            case 3:
                return ((g9.k1) this.b).c(obj);
            case 4:
            case 6:
            default:
                return super.contains(obj);
            case 5:
                return ((AbstractMap) this.b).containsValue(obj);
            case 7:
                return ((mb) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return ((mb) this.b).isEmpty();
            case 5:
                return ((AbstractMap) this.b).isEmpty();
            case 7:
                return ((mb) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                Map b10 = gVar.b();
                return b10 != null ? b10.values().iterator() : new b(gVar, 2);
            case 1:
                return new o(((mb) this.b).entrySet().iterator(), 0);
            case 2:
                return ((g9.l) this.b).g();
            case 3:
                return new g9.b((g9.k1) this.b, 0);
            case 4:
                g9.s sVar = (g9.s) this.b;
                Map d = sVar.d();
                return d != null ? d.values().iterator() : new g9.p(sVar, 2);
            case 5:
                return new g9.f1(((AbstractMap) this.b).entrySet().iterator());
            case 6:
                z7.i iVar = (z7.i) this.b;
                Map b11 = iVar.b();
                return b11 != null ? b11.values().iterator() : new z7.f(iVar, 2);
            default:
                return new o(((mb) this.b).entrySet().iterator(), 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                mb mbVar = (mb) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : mbVar.entrySet()) {
                        if (m1.a(obj, entry.getValue())) {
                            mbVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return ((g9.l) this.b).remove(entry2.getKey(), entry2.getValue());
            case 3:
            case 4:
            case 6:
            default:
                return super.remove(obj);
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry3 : abstractMap.entrySet()) {
                        if (yb.a(obj, entry3.getValue())) {
                            abstractMap.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                mb mbVar2 = (mb) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : mbVar2.entrySet()) {
                        if (x7.w6.a(obj, entry4.getValue())) {
                            mbVar2.remove(entry4.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 1:
                mb mbVar = (mb) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : mbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((dh) mbVar.e).b().removeAll(hashSet);
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet2);
                }
            case 7:
                mb mbVar2 = (mb) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : mbVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((z7.e) mbVar2.e).b().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 1:
                mb mbVar = (mb) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : mbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((dh) mbVar.e).b().retainAll(hashSet);
                }
            case 5:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet2);
                }
            case 7:
                mb mbVar2 = (mb) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : mbVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((z7.e) mbVar2.e).b().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((g) this.b).size();
            case 1:
                return ((mb) this.b).b.size();
            case 2:
                return ((g9.l) this.b).size();
            case 3:
                return ((g9.k1) this.b).f;
            case 4:
                return ((g9.s) this.b).size();
            case 5:
                return ((AbstractMap) this.b).size();
            case 6:
                return ((z7.i) this.b).size();
            default:
                return ((mb) this.b).b.size();
        }
    }

    public /* synthetic */ f(AbstractMap abstractMap, int i3) {
        this.a = i3;
        this.b = abstractMap;
    }
}
