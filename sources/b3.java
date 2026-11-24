// default package

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class b3 extends o7a {
    public final /* synthetic */ byte b;
    public final /* synthetic */ AbstractMap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(AbstractMap abstractMap, byte b) {
        super((byte) 0);
        this.b = b;
        this.c = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        i().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                Set entrySet = ((d3) this.c).d.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return h(obj);
        }
    }

    public final boolean h(Object obj) {
        Object obj2;
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Map i = i();
        i.getClass();
        try {
            obj2 = i.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        if (bqe.a(obj2, entry.getValue())) {
            return obj2 != null || i().containsKey(key);
        }
        return false;
    }

    public final Map i() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return (d3) abstractMap;
            default:
                return (oi6) abstractMap;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return i().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return new c3((d3) abstractMap);
            default:
                oi6 oi6Var = (oi6) abstractMap;
                Iterator it = oi6Var.a.entrySet().iterator();
                ni6 ni6Var = oi6Var.b;
                ni6Var.getClass();
                return new ks5(it, new li6(ni6Var));
        }
    }

    public final boolean j(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return i().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        switch (this.b) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                wg7 wg7Var = (wg7) ((d3) this.c).e;
                Object key = entry.getKey();
                Map map = wg7Var.e;
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
                    wg7Var.f -= size;
                }
                return true;
            default:
                return j(obj);
        }
    }

    @Override // o7a, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= this.remove(it.next());
            }
            return z;
        }
    }

    @Override // o7a, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(coe.a(collection.size()));
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.i().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return i().size();
    }
}
