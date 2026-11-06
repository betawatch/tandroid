package a8;

import c8.jg;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                ((kb) this.b).clear();
                break;
            case 2:
                ((c8.d) this.b).clear();
                break;
            case 3:
                ((kb) this.b).clear();
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
                return ((kb) this.b).containsValue(obj);
            case 2:
            case 6:
            default:
                return super.contains(obj);
            case 3:
                return ((kb) this.b).containsValue(obj);
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
                return ((kb) this.b).isEmpty();
            case 3:
                return ((kb) this.b).isEmpty();
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
                return new x(((kb) this.b).entrySet().iterator(), 0);
            case 2:
                c8.d dVar = (c8.d) this.b;
                Map b11 = dVar.b();
                return b11 != null ? b11.values().iterator() : new c8.a(dVar, 2);
            case 3:
                return new x(((kb) this.b).entrySet().iterator(), 1);
            case 4:
                return ((h9.l) this.b).g();
            case 5:
                return new h9.b((h9.l1) this.b, 0);
            case 6:
                h9.s sVar = (h9.s) this.b;
                Map d = sVar.d();
                return d != null ? d.values().iterator() : new h9.p(sVar, 2);
            default:
                return new h9.g1(((AbstractMap) this.b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                kb kbVar = (kb) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : kbVar.entrySet()) {
                        if (w0.a(obj, entry.getValue())) {
                            kbVar.remove(entry.getKey());
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
                kb kbVar2 = (kb) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : kbVar2.entrySet()) {
                        if (e8.a(obj, entry2.getValue())) {
                            kbVar2.remove(entry2.getKey());
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
                        if (ha.a(obj, entry4.getValue())) {
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
                kb kbVar = (kb) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : kbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((i) kbVar.e).b().removeAll(hashSet);
                }
            case 3:
                kb kbVar2 = (kb) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : kbVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((jg) kbVar2.e).b().removeAll(hashSet2);
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
                kb kbVar = (kb) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : kbVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((i) kbVar.e).b().retainAll(hashSet);
                }
            case 3:
                kb kbVar2 = (kb) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : kbVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((jg) kbVar2.e).b().retainAll(hashSet2);
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
                return ((kb) this.b).b.size();
            case 2:
                return ((c8.d) this.b).size();
            case 3:
                return ((kb) this.b).b.size();
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
