package e9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import v7.s6;
import w7.i9;
import w7.l8;
import z7.lg;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class n extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ n(int i10, Serializable serializable) {
        this.a = i10;
        this.b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((v0) this.b).b();
                break;
            case 1:
                ((v) this.b).clear();
                break;
            case 2:
                ((d) this.b).clear();
                break;
            case 3:
                ((x7.j) this.b).clear();
                break;
            case 4:
                ((d) this.b).clear();
                break;
            case 5:
                ((z7.d) this.b).clear();
                break;
            default:
                ((d) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                Iterator it = ((v0) this.b).a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            case 3:
            case 5:
            default:
                return super.contains(obj);
            case 2:
                return ((d) this.b).containsValue(obj);
            case 4:
                return ((d) this.b).containsValue(obj);
            case 6:
                return ((d) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 2:
                return ((d) this.b).isEmpty();
            case 3:
            case 5:
            default:
                return super.isEmpty();
            case 4:
                return ((d) this.b).isEmpty();
            case 6:
                return ((d) this.b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new a((v0) this.b);
            case 1:
                v vVar = (v) this.b;
                Map b10 = vVar.b();
                return b10 != null ? b10.values().iterator() : new r(vVar, 2);
            case 2:
                return new t0(((d) this.b).entrySet().iterator());
            case 3:
                x7.j jVar = (x7.j) this.b;
                Map a2 = jVar.a();
                return a2 != null ? a2.values().iterator() : new x7.g(jVar, 2);
            case 4:
                return new com.google.android.gms.internal.clearcut.f1(((d) this.b).entrySet().iterator(), 1);
            case 5:
                z7.d dVar = (z7.d) this.b;
                Map a10 = dVar.a();
                return a10 != null ? a10.values().iterator() : new z7.a(dVar, 2);
            default:
                return new com.google.android.gms.internal.clearcut.f1(((d) this.b).entrySet().iterator(), 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 2:
                d dVar = (d) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (s6.a(obj, entry.getValue())) {
                            dVar.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
            case 5:
            default:
                return super.remove(obj);
            case 4:
                d dVar2 = (d) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : dVar2.entrySet()) {
                        if (l8.a(obj, entry2.getValue())) {
                            dVar2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 6:
                d dVar3 = (d) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused3) {
                    for (Map.Entry entry3 : dVar3.entrySet()) {
                        if (i9.a(obj, entry3.getValue())) {
                            dVar3.remove(entry3.getKey());
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
            case 2:
                d dVar = (d) this.b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().removeAll(hashSet);
                }
            case 3:
            case 5:
            default:
                return super.removeAll(collection);
            case 4:
                d dVar2 = (d) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : dVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((x7.f) dVar2.e).b().removeAll(hashSet2);
                }
            case 6:
                d dVar3 = (d) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : dVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((lg) dVar3.e).b().removeAll(hashSet3);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 2:
                d dVar = (d) this.b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : dVar.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return dVar.keySet().retainAll(hashSet);
                }
            case 3:
            case 5:
            default:
                return super.retainAll(collection);
            case 4:
                d dVar2 = (d) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : dVar2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((x7.f) dVar2.e).b().retainAll(hashSet2);
                }
            case 6:
                d dVar3 = (d) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused3) {
                    HashSet hashSet3 = new HashSet();
                    for (Map.Entry entry3 : dVar3.entrySet()) {
                        if (collection.contains(entry3.getValue())) {
                            hashSet3.add(entry3.getKey());
                        }
                    }
                    return ((lg) dVar3.e).b().retainAll(hashSet3);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((v0) this.b).e;
            case 1:
                return ((v) this.b).size();
            case 2:
                return ((d) this.b).b.size();
            case 3:
                return ((x7.j) this.b).size();
            case 4:
                return ((d) this.b).b.size();
            case 5:
                return ((z7.d) this.b).size();
            default:
                return ((d) this.b).b.size();
        }
    }

    public /* synthetic */ n(AbstractMap abstractMap, int i10) {
        this.a = i10;
        this.b = abstractMap;
    }
}
