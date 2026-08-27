package i7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import k7.bg;
import k7.de;
import k7.lg;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class e extends AbstractCollection implements List {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;

    public e(h hVar, Object obj, List list, e eVar) {
        this.h = hVar;
        this.f = hVar;
        this.b = obj;
        this.c = list;
        this.e = eVar;
        this.d = eVar == null ? null : eVar.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (!add) {
                    return add;
                }
                ((h) this.f).d++;
                if (!isEmpty) {
                    return add;
                }
                p();
                return true;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (!add2 || !isEmpty2) {
                    return add2;
                }
                p();
                return true;
            default:
                n();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (add3) {
                    ((p8.h0) this.f).e++;
                    if (isEmpty3) {
                        i();
                    }
                }
                return add3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = this.c.addAll(collection);
                if (!addAll) {
                    return addAll;
                }
                int size2 = this.c.size();
                ((h) this.f).d += size2 - size;
                if (size != 0) {
                    return addAll;
                }
                p();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = this.c.addAll(collection);
                if (!addAll2) {
                    return addAll2;
                }
                this.c.size();
                if (size3 != 0) {
                    return addAll2;
                }
                p();
                return true;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = this.c.addAll(collection);
                if (!addAll3) {
                    return addAll3;
                }
                int size5 = this.c.size();
                ((p8.h0) this.f).e += size5 - size4;
                if (size4 != 0) {
                    return addAll3;
                }
                i();
                return addAll3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((h) this.f).d -= size;
                    q();
                    break;
                }
                break;
            case 1:
                if (size() != 0) {
                    this.c.clear();
                    q();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((p8.h0) this.f).e -= size2;
                    o();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return this.c.containsAll(collection);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.c.equals(obj);
            case 1:
                if (obj == this) {
                    return true;
                }
                zzb();
                return this.c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                n();
                return this.c.equals(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i10) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return ((List) this.c).get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                zzb();
                return this.c.hashCode();
            case 1:
                zzb();
                return this.c.hashCode();
            default:
                n();
                return this.c.hashCode();
        }
    }

    public void i() {
        e eVar = (e) this.e;
        if (eVar != null) {
            eVar.i();
        } else {
            ((p8.h0) this.f).d.put(this.b, this.c);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                zzb();
                return new c(this);
            case 1:
                zzb();
                return new c(this, (byte) 0);
            default:
                n();
                return new c(this, (char) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                zzb();
                return new d(this);
            case 1:
                zzb();
                return new bg(this);
            default:
                n();
                return new p8.i(this);
        }
    }

    public void n() {
        Collection collection;
        e eVar = (e) this.e;
        if (eVar != null) {
            eVar.n();
            if (eVar.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((p8.h0) this.f).d.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    public void o() {
        e eVar = (e) this.e;
        if (eVar != null) {
            eVar.o();
        } else if (this.c.isEmpty()) {
            ((p8.h0) this.f).d.remove(this.b);
        }
    }

    public void p() {
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                if (eVar == null) {
                    ((h) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    eVar.p();
                    break;
                }
            default:
                e eVar2 = (e) this.e;
                if (eVar2 == null) {
                    ((lg) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    eVar2.p();
                    break;
                }
        }
    }

    public void q() {
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                if (eVar == null) {
                    if (this.c.isEmpty()) {
                        ((h) this.f).c.remove(this.b);
                        break;
                    }
                } else {
                    eVar.q();
                    break;
                }
                break;
            default:
                e eVar2 = (e) this.e;
                if (eVar2 == null) {
                    if (this.c.isEmpty()) {
                        lg lgVar = (lg) this.f;
                        lgVar.c.remove(this.b);
                        break;
                    }
                } else {
                    eVar2.q();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    h hVar = (h) this.f;
                    hVar.d--;
                    q();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    q();
                }
                return remove2;
            default:
                n();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    p8.h0 h0Var = (p8.h0) this.f;
                    h0Var.e--;
                    o();
                }
                return remove3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll = this.c.removeAll(collection);
                if (!removeAll) {
                    return removeAll;
                }
                int size2 = this.c.size();
                ((h) this.f).d += size2 - size;
                q();
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll2 = this.c.removeAll(collection);
                if (!removeAll2) {
                    return removeAll2;
                }
                this.c.size();
                q();
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll3 = this.c.removeAll(collection);
                if (!removeAll3) {
                    return removeAll3;
                }
                int size4 = this.c.size();
                ((p8.h0) this.f).e += size4 - size3;
                o();
                return removeAll3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.c.retainAll(collection);
                if (retainAll) {
                    int size2 = this.c.size();
                    ((h) this.f).d += size2 - size;
                    q();
                }
                return retainAll;
            case 1:
                collection.getClass();
                size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    this.c.size();
                    q();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.c.size();
                    ((p8.h0) this.f).e += size4 - size3;
                    o();
                }
                return retainAll3;
        }
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return ((List) this.c).set(i10, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        switch (this.a) {
            case 0:
                zzb();
                h hVar = (h) this.h;
                List subList = ((List) this.c).subList(i10, i11);
                e eVar = (e) this.e;
                if (eVar == null) {
                    eVar = this;
                }
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.b;
                return z10 ? new b(hVar, obj, subList, eVar) : new e(hVar, obj, subList, eVar);
            case 1:
                zzb();
                List subList2 = ((List) this.c).subList(i10, i11);
                e eVar2 = (e) this.e;
                if (eVar2 == null) {
                    eVar2 = this;
                }
                lg lgVar = (lg) this.h;
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.b;
                return z11 ? new de(lgVar, obj2, subList2, eVar2) : new e(lgVar, obj2, subList2, eVar2);
            default:
                n();
                p8.h0 h0Var = (p8.h0) this.h;
                List subList3 = ((List) this.c).subList(i10, i11);
                e eVar3 = (e) this.e;
                if (eVar3 == null) {
                    eVar3 = this;
                }
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.b;
                return z12 ? new p8.f(h0Var, obj3, subList3, eVar3) : new e(h0Var, obj3, subList3, eVar3);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                n();
                break;
        }
        return this.c.toString();
    }

    public void zzb() {
        Collection collection;
        switch (this.a) {
            case 0:
                e eVar = (e) this.e;
                if (eVar != null) {
                    eVar.zzb();
                    if (eVar.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.c.isEmpty() || (collection = (Collection) ((h) this.f).c.get(this.b)) == null) {
                        return;
                    }
                    this.c = collection;
                    return;
                }
            default:
                e eVar2 = (e) this.e;
                if (eVar2 != null) {
                    eVar2.zzb();
                    if (eVar2.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (this.c.isEmpty()) {
                        Collection collection2 = (Collection) ((lg) this.f).c.get(this.b);
                        if (collection2 != null) {
                            this.c = collection2;
                            return;
                        }
                        return;
                    }
                    return;
                }
        }
    }

    public e(lg lgVar, Object obj, List list, e eVar) {
        this.h = lgVar;
        this.f = lgVar;
        this.b = obj;
        this.c = list;
        this.e = eVar;
        this.d = eVar == null ? null : eVar.c;
    }

    public e(p8.h0 h0Var, Object obj, List list, e eVar) {
        this.h = h0Var;
        this.f = h0Var;
        this.b = obj;
        this.c = list;
        this.e = eVar;
        this.d = eVar == null ? null : eVar.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.a) {
            case 0:
                zzb();
                return new d(this, i10);
            case 1:
                zzb();
                return new bg(this, i10);
            default:
                n();
                return new p8.i(this, i10);
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        switch (this.a) {
            case 0:
                zzb();
                Object remove = ((List) this.c).remove(i10);
                h hVar = (h) this.h;
                hVar.d--;
                q();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.c).remove(i10);
                q();
                return remove2;
            default:
                n();
                Object remove3 = ((List) this.c).remove(i10);
                p8.h0 h0Var = (p8.h0) this.h;
                h0Var.e--;
                o();
                return remove3;
        }
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                ((h) this.h).d++;
                if (isEmpty) {
                    p();
                    break;
                }
                break;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                if (isEmpty2) {
                    p();
                    break;
                }
                break;
            default:
                n();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                ((p8.h0) this.h).e++;
                if (isEmpty3) {
                    i();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.c).addAll(i10, collection);
                if (!addAll) {
                    return addAll;
                }
                int size2 = this.c.size();
                ((h) this.h).d += size2 - size;
                if (size != 0) {
                    return addAll;
                }
                p();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.c).addAll(i10, collection);
                if (!addAll2) {
                    return addAll2;
                }
                this.c.size();
                if (size3 != 0) {
                    return addAll2;
                }
                p();
                return true;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = ((List) this.c).addAll(i10, collection);
                if (!addAll3) {
                    return addAll3;
                }
                int size5 = this.c.size();
                ((p8.h0) this.h).e += size5 - size4;
                if (size4 != 0) {
                    return addAll3;
                }
                i();
                return addAll3;
        }
    }
}
