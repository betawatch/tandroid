package a8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class dh extends AbstractCollection implements List {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;

    public dh(gh ghVar, Object obj, List list, dh dhVar) {
        this.h = ghVar;
        this.f = ghVar;
        this.b = obj;
        this.c = list;
        this.e = dhVar;
        this.d = dhVar == null ? null : dhVar.c;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                if (isEmpty) {
                    o();
                    break;
                }
                break;
            case 1:
                m();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                ((f9.k1) this.h).f++;
                if (isEmpty2) {
                    h();
                    break;
                }
                break;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                ((y7.e) this.h).d++;
                if (isEmpty3) {
                    o();
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
                this.c.size();
                if (size != 0) {
                    return addAll;
                }
                o();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll2 = ((List) this.c).addAll(i10, collection);
                if (!addAll2) {
                    return addAll2;
                }
                int size3 = this.c.size();
                ((f9.k1) this.h).f += size3 - size2;
                if (size2 != 0) {
                    return addAll2;
                }
                h();
                return addAll2;
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
                ((y7.e) this.h).d += size5 - size4;
                if (size4 != 0) {
                    return addAll3;
                }
                o();
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.a) {
            case 0:
                if (size() != 0) {
                    this.c.clear();
                    p();
                    break;
                }
                break;
            case 1:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((f9.k1) this.f).f -= size;
                    n();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((y7.e) this.f).d -= size2;
                    p();
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
                m();
                break;
            default:
                zzb();
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
                m();
                break;
            default:
                zzb();
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
                m();
                return this.c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                zzb();
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
                m();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).get(i10);
    }

    public void h() {
        dh dhVar = (dh) this.e;
        if (dhVar != null) {
            dhVar.h();
        } else {
            ((f9.k1) this.f).e.put(this.b, this.c);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                zzb();
                return this.c.hashCode();
            case 1:
                m();
                return this.c.hashCode();
            default:
                zzb();
                return this.c.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                m();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                zzb();
                return new ta(this);
            case 1:
                m();
                return new ta(this, (byte) 0);
            default:
                zzb();
                return new ta(this, (char) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                m();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                zzb();
                return new ug(this);
            case 1:
                m();
                return new f9.j(this);
            default:
                zzb();
                return new y7.c(this);
        }
    }

    public void m() {
        Collection collection;
        dh dhVar = (dh) this.e;
        if (dhVar != null) {
            dhVar.m();
            if (dhVar.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((f9.k1) this.f).e.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    public void n() {
        dh dhVar = (dh) this.e;
        if (dhVar != null) {
            dhVar.n();
        } else if (this.c.isEmpty()) {
            ((f9.k1) this.f).e.remove(this.b);
        }
    }

    public void o() {
        switch (this.a) {
            case 0:
                dh dhVar = (dh) this.e;
                if (dhVar == null) {
                    ((gh) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    dhVar.o();
                    break;
                }
            default:
                dh dhVar2 = (dh) this.e;
                if (dhVar2 == null) {
                    ((y7.e) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    dhVar2.o();
                    break;
                }
        }
    }

    public void p() {
        switch (this.a) {
            case 0:
                dh dhVar = (dh) this.e;
                if (dhVar == null) {
                    if (this.c.isEmpty()) {
                        gh ghVar = (gh) this.f;
                        ghVar.c.remove(this.b);
                        break;
                    }
                } else {
                    dhVar.p();
                    break;
                }
                break;
            default:
                dh dhVar2 = (dh) this.e;
                if (dhVar2 == null) {
                    if (this.c.isEmpty()) {
                        ((y7.e) this.f).c.remove(this.b);
                        break;
                    }
                } else {
                    dhVar2.p();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        switch (this.a) {
            case 0:
                zzb();
                Object remove = ((List) this.c).remove(i10);
                p();
                return remove;
            case 1:
                m();
                Object remove2 = ((List) this.c).remove(i10);
                f9.k1 k1Var = (f9.k1) this.h;
                k1Var.f--;
                n();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.c).remove(i10);
                y7.e eVar = (y7.e) this.h;
                eVar.d--;
                p();
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
                size();
                boolean removeAll = this.c.removeAll(collection);
                if (!removeAll) {
                    return removeAll;
                }
                this.c.size();
                p();
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean removeAll2 = this.c.removeAll(collection);
                if (!removeAll2) {
                    return removeAll2;
                }
                int size2 = this.c.size();
                ((f9.k1) this.f).f += size2 - size;
                n();
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
                ((y7.e) this.f).d += size4 - size3;
                p();
                return removeAll3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                size();
                boolean retainAll = this.c.retainAll(collection);
                if (retainAll) {
                    this.c.size();
                    p();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size = size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    int size2 = this.c.size();
                    ((f9.k1) this.f).f += size2 - size;
                    n();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.c.size();
                    ((y7.e) this.f).d += size4 - size3;
                    p();
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
                m();
                break;
            default:
                zzb();
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
                m();
                break;
            default:
                zzb();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        switch (this.a) {
            case 0:
                zzb();
                List subList = ((List) this.c).subList(i10, i11);
                dh dhVar = (dh) this.e;
                if (dhVar == null) {
                    dhVar = this;
                }
                gh ghVar = (gh) this.h;
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.b;
                return z10 ? new le(ghVar, obj, subList, dhVar) : new dh(ghVar, obj, subList, dhVar);
            case 1:
                m();
                f9.k1 k1Var = (f9.k1) this.h;
                List subList2 = ((List) this.c).subList(i10, i11);
                dh dhVar2 = (dh) this.e;
                if (dhVar2 == null) {
                    dhVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.b;
                return z11 ? new f9.g(k1Var, obj2, subList2, dhVar2) : new dh(k1Var, obj2, subList2, dhVar2);
            default:
                zzb();
                y7.e eVar = (y7.e) this.h;
                List subList3 = ((List) this.c).subList(i10, i11);
                dh dhVar3 = (dh) this.e;
                if (dhVar3 == null) {
                    dhVar3 = this;
                }
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.b;
                return z12 ? new y7.b(eVar, obj3, subList3, dhVar3) : new dh(eVar, obj3, subList3, dhVar3);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                m();
                break;
            default:
                zzb();
                break;
        }
        return this.c.toString();
    }

    public void zzb() {
        Collection collection;
        switch (this.a) {
            case 0:
                dh dhVar = (dh) this.e;
                if (dhVar != null) {
                    dhVar.zzb();
                    if (dhVar.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (this.c.isEmpty()) {
                        Collection collection2 = (Collection) ((gh) this.f).c.get(this.b);
                        if (collection2 != null) {
                            this.c = collection2;
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                dh dhVar2 = (dh) this.e;
                if (dhVar2 != null) {
                    dhVar2.zzb();
                    if (dhVar2.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.c.isEmpty() || (collection = (Collection) ((y7.e) this.f).c.get(this.b)) == null) {
                        return;
                    }
                    this.c = collection;
                    return;
                }
        }
    }

    public dh(y7.e eVar, Object obj, List list, dh dhVar) {
        this.h = eVar;
        this.f = eVar;
        this.b = obj;
        this.c = list;
        this.e = dhVar;
        this.d = dhVar == null ? null : dhVar.c;
    }

    public dh(f9.k1 k1Var, Object obj, List list, dh dhVar) {
        this.h = k1Var;
        this.f = k1Var;
        this.b = obj;
        this.c = list;
        this.e = dhVar;
        this.d = dhVar == null ? null : dhVar.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.a) {
            case 0:
                zzb();
                return new ug(this, i10);
            case 1:
                m();
                return new f9.j(this, i10);
            default:
                zzb();
                return new y7.c(this, i10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    p();
                }
                return remove;
            case 1:
                m();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    f9.k1 k1Var = (f9.k1) this.f;
                    k1Var.f--;
                    n();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    y7.e eVar = (y7.e) this.f;
                    eVar.d--;
                    p();
                }
                return remove3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (!add || !isEmpty) {
                    return add;
                }
                o();
                return true;
            case 1:
                m();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (add2) {
                    ((f9.k1) this.f).f++;
                    if (isEmpty2) {
                        h();
                    }
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (!add3) {
                    return add3;
                }
                ((y7.e) this.f).d++;
                if (!isEmpty3) {
                    return add3;
                }
                o();
                return true;
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
                this.c.size();
                if (size != 0) {
                    return addAll;
                }
                o();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll2 = this.c.addAll(collection);
                if (!addAll2) {
                    return addAll2;
                }
                int size3 = this.c.size();
                ((f9.k1) this.f).f += size3 - size2;
                if (size2 != 0) {
                    return addAll2;
                }
                h();
                return addAll2;
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
                ((y7.e) this.f).d += size5 - size4;
                if (size4 != 0) {
                    return addAll3;
                }
                o();
                return true;
        }
    }
}
