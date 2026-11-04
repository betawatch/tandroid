package b8;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ah extends AbstractCollection implements List {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;

    public ah(dh dhVar, Object obj, List list, ah ahVar) {
        this.h = dhVar;
        this.f = dhVar;
        this.b = obj;
        this.c = list;
        this.e = ahVar;
        this.d = ahVar == null ? null : ahVar.c;
    }

    @Override // java.util.List
    public final void add(int i3, Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i3, obj);
                if (isEmpty) {
                    k();
                    break;
                }
                break;
            case 1:
                i();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i3, obj);
                ((g9.k1) this.h).f++;
                if (isEmpty2) {
                    h();
                    break;
                }
                break;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i3, obj);
                ((z7.e) this.h).d++;
                if (isEmpty3) {
                    k();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i3, Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.c).addAll(i3, collection);
                if (!addAll) {
                    return addAll;
                }
                this.c.size();
                if (size != 0) {
                    return addAll;
                }
                k();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll2 = ((List) this.c).addAll(i3, collection);
                if (!addAll2) {
                    return addAll2;
                }
                int size3 = this.c.size();
                ((g9.k1) this.h).f += size3 - size2;
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
                boolean addAll3 = ((List) this.c).addAll(i3, collection);
                if (!addAll3) {
                    return addAll3;
                }
                int size5 = this.c.size();
                ((z7.e) this.h).d += size5 - size4;
                if (size4 != 0) {
                    return addAll3;
                }
                k();
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.a) {
            case 0:
                if (size() != 0) {
                    this.c.clear();
                    l();
                    break;
                }
                break;
            case 1:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((g9.k1) this.f).f -= size;
                    j();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((z7.e) this.f).d -= size2;
                    l();
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
                i();
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
                i();
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
                i();
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
    public final Object get(int i3) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                i();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).get(i3);
    }

    public void h() {
        ah ahVar = (ah) this.e;
        if (ahVar != null) {
            ahVar.h();
        } else {
            ((g9.k1) this.f).e.put(this.b, this.c);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                zzb();
                return this.c.hashCode();
            case 1:
                i();
                return this.c.hashCode();
            default:
                zzb();
                return this.c.hashCode();
        }
    }

    public void i() {
        Collection collection;
        ah ahVar = (ah) this.e;
        if (ahVar != null) {
            ahVar.i();
            if (ahVar.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((g9.k1) this.f).e.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                i();
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
                return new ra(this);
            case 1:
                i();
                return new ra(this, (byte) 0);
            default:
                zzb();
                return new ra(this, (char) 0);
        }
    }

    public void j() {
        ah ahVar = (ah) this.e;
        if (ahVar != null) {
            ahVar.j();
        } else if (this.c.isEmpty()) {
            ((g9.k1) this.f).e.remove(this.b);
        }
    }

    public void k() {
        switch (this.a) {
            case 0:
                ah ahVar = (ah) this.e;
                if (ahVar == null) {
                    ((dh) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    ahVar.k();
                    break;
                }
            default:
                ah ahVar2 = (ah) this.e;
                if (ahVar2 == null) {
                    ((z7.e) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    ahVar2.k();
                    break;
                }
        }
    }

    public void l() {
        switch (this.a) {
            case 0:
                ah ahVar = (ah) this.e;
                if (ahVar == null) {
                    if (this.c.isEmpty()) {
                        dh dhVar = (dh) this.f;
                        dhVar.c.remove(this.b);
                        break;
                    }
                } else {
                    ahVar.l();
                    break;
                }
                break;
            default:
                ah ahVar2 = (ah) this.e;
                if (ahVar2 == null) {
                    if (this.c.isEmpty()) {
                        ((z7.e) this.f).c.remove(this.b);
                        break;
                    }
                } else {
                    ahVar2.l();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                i();
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
                return new rg(this);
            case 1:
                i();
                return new g9.j(this);
            default:
                zzb();
                return new z7.c(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i3) {
        switch (this.a) {
            case 0:
                zzb();
                Object remove = ((List) this.c).remove(i3);
                l();
                return remove;
            case 1:
                i();
                Object remove2 = ((List) this.c).remove(i3);
                g9.k1 k1Var = (g9.k1) this.h;
                k1Var.f--;
                j();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.c).remove(i3);
                z7.e eVar = (z7.e) this.h;
                eVar.d--;
                l();
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
                l();
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
                ((g9.k1) this.f).f += size2 - size;
                j();
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
                ((z7.e) this.f).d += size4 - size3;
                l();
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
                    l();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size = size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    int size2 = this.c.size();
                    ((g9.k1) this.f).f += size2 - size;
                    j();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.c.size();
                    ((z7.e) this.f).d += size4 - size3;
                    l();
                }
                return retainAll3;
        }
    }

    @Override // java.util.List
    public final Object set(int i3, Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                i();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).set(i3, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                i();
                break;
            default:
                zzb();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i3, int i10) {
        switch (this.a) {
            case 0:
                zzb();
                List subList = ((List) this.c).subList(i3, i10);
                ah ahVar = (ah) this.e;
                if (ahVar == null) {
                    ahVar = this;
                }
                dh dhVar = (dh) this.h;
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.b;
                return z10 ? new je(dhVar, obj, subList, ahVar) : new ah(dhVar, obj, subList, ahVar);
            case 1:
                i();
                g9.k1 k1Var = (g9.k1) this.h;
                List subList2 = ((List) this.c).subList(i3, i10);
                ah ahVar2 = (ah) this.e;
                if (ahVar2 == null) {
                    ahVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.b;
                return z11 ? new g9.g(k1Var, obj2, subList2, ahVar2) : new ah(k1Var, obj2, subList2, ahVar2);
            default:
                zzb();
                z7.e eVar = (z7.e) this.h;
                List subList3 = ((List) this.c).subList(i3, i10);
                ah ahVar3 = (ah) this.e;
                if (ahVar3 == null) {
                    ahVar3 = this;
                }
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.b;
                return z12 ? new z7.b(eVar, obj3, subList3, ahVar3) : new ah(eVar, obj3, subList3, ahVar3);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                i();
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
                ah ahVar = (ah) this.e;
                if (ahVar != null) {
                    ahVar.zzb();
                    if (ahVar.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (this.c.isEmpty()) {
                        Collection collection2 = (Collection) ((dh) this.f).c.get(this.b);
                        if (collection2 != null) {
                            this.c = collection2;
                            return;
                        }
                        return;
                    }
                    return;
                }
            default:
                ah ahVar2 = (ah) this.e;
                if (ahVar2 != null) {
                    ahVar2.zzb();
                    if (ahVar2.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.c.isEmpty() || (collection = (Collection) ((z7.e) this.f).c.get(this.b)) == null) {
                        return;
                    }
                    this.c = collection;
                    return;
                }
        }
    }

    public ah(z7.e eVar, Object obj, List list, ah ahVar) {
        this.h = eVar;
        this.f = eVar;
        this.b = obj;
        this.c = list;
        this.e = ahVar;
        this.d = ahVar == null ? null : ahVar.c;
    }

    public ah(g9.k1 k1Var, Object obj, List list, ah ahVar) {
        this.h = k1Var;
        this.f = k1Var;
        this.b = obj;
        this.c = list;
        this.e = ahVar;
        this.d = ahVar == null ? null : ahVar.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i3) {
        switch (this.a) {
            case 0:
                zzb();
                return new rg(this, i3);
            case 1:
                i();
                return new g9.j(this, i3);
            default:
                zzb();
                return new z7.c(this, i3);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    l();
                }
                return remove;
            case 1:
                i();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    g9.k1 k1Var = (g9.k1) this.f;
                    k1Var.f--;
                    j();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    z7.e eVar = (z7.e) this.f;
                    eVar.d--;
                    l();
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
                k();
                return true;
            case 1:
                i();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (add2) {
                    ((g9.k1) this.f).f++;
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
                ((z7.e) this.f).d++;
                if (!isEmpty3) {
                    return add3;
                }
                k();
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
                k();
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
                ((g9.k1) this.f).f += size3 - size2;
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
                ((z7.e) this.f).d += size5 - size4;
                if (size4 != 0) {
                    return addAll3;
                }
                k();
                return true;
        }
    }
}
