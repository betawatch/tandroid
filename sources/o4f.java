// default package

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class o4f extends fba {
    public final /* synthetic */ byte b = 0;
    public final AbstractMap c;

    public o4f(lmf lmfVar, lp2 lp2Var) {
        super((byte) 1);
        lp2Var.getClass();
        this.c = lp2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.b) {
            case 0:
                ((e3) this.c).clear();
                break;
            default:
                Iterator it = iterator();
                while (true) {
                    xbf xbfVar = (xbf) it;
                    if (!xbfVar.hasNext()) {
                        break;
                    } else {
                        xbfVar.next();
                        xbfVar.remove();
                    }
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                try {
                    return ((lp2) ((e3) abstractMap).d).entrySet().contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return ((lp2) abstractMap).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        switch (this.b) {
            case 1:
                return ((lp2) this.c).keySet().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        switch (this.b) {
            case 1:
                return this == obj || ((lp2) this.c).keySet().equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        switch (this.b) {
            case 1:
                return ((lp2) this.c).keySet().hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return ((e3) abstractMap).isEmpty();
            default:
                return ((lp2) abstractMap).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return new d3((e3) abstractMap, (byte) 0);
            default:
                return new xbf(this, ((lp2) abstractMap).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                if (contains(obj)) {
                    Map.Entry entry = (Map.Entry) obj;
                    entry.getClass();
                    Object key = entry.getKey();
                    lp2 lp2Var = ((lmf) ((e3) abstractMap).e).c;
                    lp2Var.getClass();
                    try {
                        obj2 = lp2Var.remove(key);
                    } catch (ClassCastException | NullPointerException unused) {
                        obj2 = null;
                    }
                    Collection collection = (Collection) obj2;
                    if (collection != null) {
                        collection.size();
                        collection.clear();
                    }
                    break;
                }
                break;
            default:
                Collection collection2 = (Collection) ((lp2) abstractMap).remove(obj);
                if (collection2 != null) {
                    int size = collection2.size();
                    collection2.clear();
                    if (size > 0) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // fba, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.b) {
            case 0:
                try {
                    if (collection != null) {
                        return g5f.a(this, collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    Iterator it = collection.iterator();
                    boolean z = false;
                    while (it.hasNext()) {
                        z |= remove(it.next());
                    }
                    return z;
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // fba, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        switch (this.b) {
            case 0:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    int size = collection.size();
                    if (size >= 3) {
                        ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : ConnectionsManager.DEFAULT_DATACENTER_ID;
                    } else {
                        if (size < 0) {
                            lq5.j(uh9.k(size, "expectedSize cannot be negative but was: "));
                            return false;
                        }
                        ceil = size + 1;
                    }
                    HashSet hashSet = new HashSet(ceil);
                    for (Object obj : collection) {
                        if (contains(obj) && (obj instanceof Map.Entry)) {
                            hashSet.add(((Map.Entry) obj).getKey());
                        }
                    }
                    lmf lmfVar = (lmf) ((e3) this.c).e;
                    o4f o4fVar = lmfVar.a;
                    if (o4fVar == null) {
                        o4fVar = new o4f(lmfVar, lmfVar.c);
                        lmfVar.a = o4fVar;
                    }
                    return o4fVar.retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.b;
        AbstractMap abstractMap = this.c;
        switch (b) {
            case 0:
                return ((lp2) ((e3) abstractMap).d).size();
            default:
                return ((lp2) abstractMap).size();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4f(e3 e3Var) {
        super((byte) 1);
        this.c = e3Var;
    }
}
