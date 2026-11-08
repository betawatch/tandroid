package h9;

import a8.ha;
import a8.kb;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c extends a8.h0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractMap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AbstractMap abstractMap, int i7) {
        super(2);
        this.b = i7;
        this.c = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        i().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                Set entrySet = ((kb) this.c).b.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return f(obj);
        }
    }

    public final boolean f(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map i7 = i();
        i7.getClass();
        try {
            obj2 = i7.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (ha.a(obj2, entry.getValue())) {
            return obj2 != null || i().containsKey(key);
        }
        return false;
    }

    public final Map i() {
        switch (this.b) {
            case 0:
                return (kb) this.c;
            default:
                return (i1) this.c;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return i().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                return new a8.d((kb) this.c, (char) 0);
            default:
                i1 i1Var = (i1) this.c;
                Iterator it = i1Var.a.entrySet().iterator();
                h1 h1Var = i1Var.b;
                h1Var.getClass();
                return new w0(it, new f1(h1Var, 0));
        }
    }

    public final boolean j(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return i().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                l1 l1Var = (l1) ((kb) this.c).e;
                Object key = entry.getKey();
                Map map = l1Var.e;
                map.getClass();
                try {
                    obj2 = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    l1Var.f -= size;
                }
                return true;
            default:
                return j(obj);
        }
    }

    @Override // a8.h0, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z9 = false;
            while (it.hasNext()) {
                z9 |= remove(it.next());
            }
            return z9;
        }
    }

    @Override // a8.h0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(o.d(collection.size()));
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return i().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return i().size();
    }
}
