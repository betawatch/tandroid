package a8;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class f extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((g) this.b).clear();
                break;
            case 1:
                ((pb) this.b).clear();
                break;
            case 2:
                ((f9.l) this.b).clear();
                break;
            case 3:
                ((f9.k1) this.b).clear();
                break;
            case 4:
                ((f9.s) this.b).clear();
                break;
            case 5:
                ((AbstractMap) this.b).clear();
                break;
            case 6:
                ((y7.i) this.b).clear();
                break;
            default:
                ((pb) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                return ((pb) this.b).containsValue(obj);
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f9.l lVar = (f9.l) this.b;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) lVar.b().get(key);
                return collection != null && collection.contains(value);
            case 3:
                return ((f9.k1) this.b).c(obj);
            case 4:
            case 6:
            default:
                return super.contains(obj);
            case 5:
                return ((AbstractMap) this.b).containsValue(obj);
            case 7:
                return ((pb) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return ((pb) this.b).isEmpty();
            case 5:
                return ((AbstractMap) this.b).isEmpty();
            case 7:
                return ((pb) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                g gVar = (g) this.b;
                Map a2 = gVar.a();
                return a2 != null ? a2.values().iterator() : new b(gVar, 2);
            case 1:
                return new o(((pb) this.b).entrySet().iterator(), 0);
            case 2:
                return ((f9.l) this.b).g();
            case 3:
                return new f9.b((f9.k1) this.b, 0);
            case 4:
                f9.s sVar = (f9.s) this.b;
                Map c10 = sVar.c();
                return c10 != null ? c10.values().iterator() : new f9.p(sVar, 2);
            case 5:
                return new f9.f1(((AbstractMap) this.b).entrySet().iterator());
            case 6:
                y7.i iVar = (y7.i) this.b;
                Map a10 = iVar.a();
                return a10 != null ? a10.values().iterator() : new y7.f(iVar, 2);
            default:
                return new o(((pb) this.b).entrySet().iterator(), 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                pb pbVar = (pb) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : pbVar.entrySet()) {
                        if (n0.a(obj, entry.getValue())) {
                            pbVar.remove(entry.getKey());
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
                return ((f9.l) this.b).remove(entry2.getKey(), entry2.getValue());
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
                        if (xb.a(obj, entry3.getValue())) {
                            abstractMap.remove(entry3.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 7:
                pb pbVar2 = (pb) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : pbVar2.entrySet()) {
                        if (w7.g5.a(obj, entry4.getValue())) {
                            pbVar2.remove(entry4.getKey());
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
                pb pbVar = (pb) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : pbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((gh) pbVar.e).b().removeAll(hashSet);
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
                pb pbVar2 = (pb) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : pbVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((y7.e) pbVar2.e).b().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 1:
                pb pbVar = (pb) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : pbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((gh) pbVar.e).b().retainAll(hashSet);
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
                pb pbVar2 = (pb) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : pbVar2.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((y7.e) pbVar2.e).b().retainAll(hashSet3);
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
                return ((pb) this.b).b.size();
            case 2:
                return ((f9.l) this.b).size();
            case 3:
                return ((f9.k1) this.b).f;
            case 4:
                return ((f9.s) this.b).size();
            case 5:
                return ((AbstractMap) this.b).size();
            case 6:
                return ((y7.i) this.b).size();
            default:
                return ((pb) this.b).b.size();
        }
    }

    public /* synthetic */ f(AbstractMap abstractMap, int i10) {
        this.a = i10;
        this.b = abstractMap;
    }
}
