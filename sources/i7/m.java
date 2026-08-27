package i7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import k7.lg;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m(int i10, Serializable serializable) {
        this.a = i10;
        this.b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((n) this.b).clear();
                break;
            case 1:
                ((wa) this.b).clear();
                break;
            case 2:
                ((k7.d) this.b).clear();
                break;
            case 3:
                ((wa) this.b).clear();
                break;
            case 4:
                ((p8.h0) this.b).b();
                break;
            case 5:
                ((p8.p) this.b).clear();
                break;
            default:
                ((wa) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                return ((wa) this.b).containsValue(obj);
            case 2:
            case 5:
            default:
                return super.contains(obj);
            case 3:
                return ((wa) this.b).containsValue(obj);
            case 4:
                Iterator it = ((m) ((p8.h0) this.b).a().values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 6:
                return ((wa) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 1:
                return ((wa) this.b).isEmpty();
            case 3:
                return ((wa) this.b).isEmpty();
            case 6:
                return ((wa) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                n nVar = (n) this.b;
                Map a2 = nVar.a();
                return a2 != null ? a2.values().iterator() : new i(nVar, 2);
            case 1:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.b).entrySet().iterator(), 1);
            case 2:
                k7.d dVar = (k7.d) this.b;
                Map a3 = dVar.a();
                return a3 != null ? a3.values().iterator() : new k7.a(dVar, 2);
            case 3:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.b).entrySet().iterator(), 2);
            case 4:
                return new p8.a((p8.h0) this.b);
            case 5:
                p8.p pVar = (p8.p) this.b;
                Map b10 = pVar.b();
                return b10 != null ? b10.values().iterator() : new p8.m(pVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.h1(((wa) this.b).entrySet().iterator(), 3);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                wa waVar = (wa) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : waVar.entrySet()) {
                        if (g7.d8.a(obj, entry.getValue())) {
                            waVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
                wa waVar2 = (wa) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : waVar2.entrySet()) {
                        if (g7.x8.a(obj, entry2.getValue())) {
                            waVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                wa waVar3 = (wa) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : waVar3.entrySet()) {
                        if (h7.e0.a(obj, entry3.getValue())) {
                            waVar3.remove(entry3.getKey());
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
            case 1:
                wa waVar = (wa) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : waVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((h) waVar.e).b().removeAll(hashSet);
                }
            case 3:
                wa waVar2 = (wa) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : waVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((lg) waVar2.e).b().removeAll(hashSet2);
                }
            case 6:
                wa waVar3 = (wa) this.b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : waVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return waVar3.keySet().removeAll(hashSet3);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 1:
                wa waVar = (wa) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : waVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return ((h) waVar.e).b().retainAll(hashSet);
                }
            case 3:
                wa waVar2 = (wa) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : waVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((lg) waVar2.e).b().retainAll(hashSet2);
                }
            case 6:
                wa waVar3 = (wa) this.b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : waVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return waVar3.keySet().retainAll(hashSet3);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((n) this.b).size();
            case 1:
                return ((wa) this.b).b.size();
            case 2:
                return ((k7.d) this.b).size();
            case 3:
                return ((wa) this.b).b.size();
            case 4:
                return ((p8.h0) this.b).e;
            case 5:
                return ((p8.p) this.b).size();
            default:
                return ((wa) this.b).b.size();
        }
    }

    public /* synthetic */ m(AbstractMap abstractMap, int i10) {
        this.a = i10;
        this.b = abstractMap;
    }
}
