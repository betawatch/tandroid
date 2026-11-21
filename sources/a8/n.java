package a8;

import c8.jg;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class n extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((o) this.b).clear();
                break;
            case 1:
                ((lb) this.b).clear();
                break;
            case 2:
                ((c8.d) this.b).clear();
                break;
            case 3:
                ((lb) this.b).clear();
                break;
            case 4:
                ((h9.l) this.b).clear();
                break;
            case 5:
                ((h9.l1) this.b).clear();
                break;
            case 6:
                ((h9.s) this.b).clear();
                break;
            default:
                ((AbstractMap) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                return ((lb) this.b).containsValue(obj);
            case 2:
            case 6:
            default:
                return super.contains(obj);
            case 3:
                return ((lb) this.b).containsValue(obj);
            case 4:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                h9.l lVar = (h9.l) this.b;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) lVar.b().get(key);
                return collection != null && collection.contains(value);
            case 5:
                return ((h9.l1) this.b).c(obj);
            case 7:
                return ((AbstractMap) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return ((lb) this.b).isEmpty();
            case 3:
                return ((lb) this.b).isEmpty();
            case 7:
                return ((AbstractMap) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                Map b10 = oVar.b();
                return b10 != null ? b10.values().iterator() : new j(oVar, 2);
            case 1:
                return new x(((lb) this.b).entrySet().iterator(), 0);
            case 2:
                c8.d dVar = (c8.d) this.b;
                Map b11 = dVar.b();
                return b11 != null ? b11.values().iterator() : new c8.a(dVar, 2);
            case 3:
                return new x(((lb) this.b).entrySet().iterator(), 1);
            case 4:
                return ((h9.l) this.b).g();
            case 5:
                return new h9.b((h9.l1) this.b, 0);
            case 6:
                h9.s sVar = (h9.s) this.b;
                Map d = sVar.d();
                return d != null ? d.values().iterator() : new h9.p(sVar, 2);
            default:
                return new h9.f1(((AbstractMap) this.b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                lb lbVar = (lb) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : lbVar.entrySet()) {
                        if (w0.a(obj, entry.getValue())) {
                            lbVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 2:
            case 5:
            case 6:
            default:
                return super.remove(obj);
            case 3:
                lb lbVar2 = (lb) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : lbVar2.entrySet()) {
                        if (f8.a(obj, entry2.getValue())) {
                            lbVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 4:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry3 = (Map.Entry) obj;
                return ((h9.l) this.b).remove(entry3.getKey(), entry3.getValue());
            case 7:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry4 : abstractMap.entrySet()) {
                        if (ka.a(obj, entry4.getValue())) {
                            abstractMap.remove(entry4.getKey());
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
                lb lbVar = (lb) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : lbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((i) lbVar.e).b().removeAll(hashSet);
                }
            case 3:
                lb lbVar2 = (lb) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : lbVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((jg) lbVar2.e).b().removeAll(hashSet2);
                }
            case 7:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : abstractMap.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 1:
                lb lbVar = (lb) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : lbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((i) lbVar.e).b().retainAll(hashSet);
                }
            case 3:
                lb lbVar2 = (lb) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : lbVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((jg) lbVar2.e).b().retainAll(hashSet2);
                }
            case 7:
                AbstractMap abstractMap = (AbstractMap) this.b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : abstractMap.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((o) this.b).size();
            case 1:
                return ((lb) this.b).b.size();
            case 2:
                return ((c8.d) this.b).size();
            case 3:
                return ((lb) this.b).b.size();
            case 4:
                return ((h9.l) this.b).size();
            case 5:
                return ((h9.l1) this.b).f;
            case 6:
                return ((h9.s) this.b).size();
            default:
                return ((AbstractMap) this.b).size();
        }
    }

    public /* synthetic */ n(AbstractMap abstractMap, int i7) {
        this.a = i7;
        this.b = abstractMap;
    }
}
