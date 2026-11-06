package a8;

import c8.be;
import c8.jg;
import c8.zf;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public class f extends AbstractCollection implements List {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;

    public f(i iVar, Object obj, List list, f fVar) {
        this.h = iVar;
        this.f = iVar;
        this.b = obj;
        this.c = list;
        this.e = fVar;
        this.d = fVar == null ? null : fVar.c;
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
                ((i) this.f).d++;
                if (!isEmpty) {
                    return add;
                }
                k();
                return true;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (!add2 || !isEmpty2) {
                    return add2;
                }
                k();
                return true;
            default:
                i();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (add3) {
                    ((h9.l1) this.f).f++;
                    if (isEmpty3) {
                        f();
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
                ((i) this.f).d += size2 - size;
                if (size != 0) {
                    return addAll;
                }
                k();
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
                k();
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
                ((h9.l1) this.f).f += size5 - size4;
                if (size4 != 0) {
                    return addAll3;
                }
                f();
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
                    ((i) this.f).d -= size;
                    l();
                    break;
                }
                break;
            case 1:
                if (size() != 0) {
                    this.c.clear();
                    l();
                    break;
                }
                break;
            default:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((h9.l1) this.f).f -= size2;
                    j();
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
                i();
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
                i();
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
                i();
                return this.c.equals(obj);
        }
    }

    public void f() {
        f fVar = (f) this.e;
        if (fVar != null) {
            fVar.f();
        } else {
            ((h9.l1) this.f).e.put(this.b, this.c);
        }
    }

    @Override // java.util.List
    public final Object get(int i7) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                i();
                break;
        }
        return ((List) this.c).get(i7);
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
                i();
                return this.c.hashCode();
        }
    }

    public void i() {
        Collection collection;
        f fVar = (f) this.e;
        if (fVar != null) {
            fVar.i();
            if (fVar.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((h9.l1) this.f).e.get(this.b)) == null) {
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
                zzb();
                break;
            default:
                i();
                break;
        }
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                zzb();
                return new d(this);
            case 1:
                zzb();
                return new d(this, (byte) 0);
            default:
                i();
                return new d(this, (char) 0);
        }
    }

    public void j() {
        f fVar = (f) this.e;
        if (fVar != null) {
            fVar.j();
        } else if (this.c.isEmpty()) {
            ((h9.l1) this.f).e.remove(this.b);
        }
    }

    public void k() {
        switch (this.a) {
            case 0:
                f fVar = (f) this.e;
                if (fVar == null) {
                    ((i) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    fVar.k();
                    break;
                }
            default:
                f fVar2 = (f) this.e;
                if (fVar2 == null) {
                    ((jg) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    fVar2.k();
                    break;
                }
        }
    }

    public void l() {
        switch (this.a) {
            case 0:
                f fVar = (f) this.e;
                if (fVar == null) {
                    if (this.c.isEmpty()) {
                        ((i) this.f).c.remove(this.b);
                        break;
                    }
                } else {
                    fVar.l();
                    break;
                }
                break;
            default:
                f fVar2 = (f) this.e;
                if (fVar2 == null) {
                    if (this.c.isEmpty()) {
                        jg jgVar = (jg) this.f;
                        jgVar.c.remove(this.b);
                        break;
                    }
                } else {
                    fVar2.l();
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
                zzb();
                break;
            default:
                i();
                break;
        }
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                zzb();
                return new e(this);
            case 1:
                zzb();
                return new zf(this);
            default:
                i();
                return new h9.j(this);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    i iVar = (i) this.f;
                    iVar.d--;
                    l();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    l();
                }
                return remove2;
            default:
                i();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    h9.l1 l1Var = (h9.l1) this.f;
                    l1Var.f--;
                    j();
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
                ((i) this.f).d += size2 - size;
                l();
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
                l();
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
                ((h9.l1) this.f).f += size4 - size3;
                j();
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
                    ((i) this.f).d += size2 - size;
                    l();
                }
                return retainAll;
            case 1:
                collection.getClass();
                size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    this.c.size();
                    l();
                }
                return retainAll2;
            default:
                collection.getClass();
                int size3 = size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    int size4 = this.c.size();
                    ((h9.l1) this.f).f += size4 - size3;
                    j();
                }
                return retainAll3;
        }
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                break;
            case 1:
                zzb();
                break;
            default:
                i();
                break;
        }
        return ((List) this.c).set(i7, obj);
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
                i();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        switch (this.a) {
            case 0:
                zzb();
                i iVar = (i) this.h;
                List subList = ((List) this.c).subList(i7, i10);
                f fVar = (f) this.e;
                if (fVar == null) {
                    fVar = this;
                }
                boolean z9 = subList instanceof RandomAccess;
                Object obj = this.b;
                return z9 ? new c(iVar, obj, subList, fVar) : new f(iVar, obj, subList, fVar);
            case 1:
                zzb();
                List subList2 = ((List) this.c).subList(i7, i10);
                f fVar2 = (f) this.e;
                if (fVar2 == null) {
                    fVar2 = this;
                }
                jg jgVar = (jg) this.h;
                boolean z10 = subList2 instanceof RandomAccess;
                Object obj2 = this.b;
                return z10 ? new be(jgVar, obj2, subList2, fVar2) : new f(jgVar, obj2, subList2, fVar2);
            default:
                i();
                h9.l1 l1Var = (h9.l1) this.h;
                List subList3 = ((List) this.c).subList(i7, i10);
                f fVar3 = (f) this.e;
                if (fVar3 == null) {
                    fVar3 = this;
                }
                boolean z11 = subList3 instanceof RandomAccess;
                Object obj3 = this.b;
                return z11 ? new h9.g(l1Var, obj3, subList3, fVar3) : new f(l1Var, obj3, subList3, fVar3);
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
                i();
                break;
        }
        return this.c.toString();
    }

    public void zzb() {
        Collection collection;
        switch (this.a) {
            case 0:
                f fVar = (f) this.e;
                if (fVar != null) {
                    fVar.zzb();
                    if (fVar.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.c.isEmpty() || (collection = (Collection) ((i) this.f).c.get(this.b)) == null) {
                        return;
                    }
                    this.c = collection;
                    return;
                }
            default:
                f fVar2 = (f) this.e;
                if (fVar2 != null) {
                    fVar2.zzb();
                    if (fVar2.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (this.c.isEmpty()) {
                        Collection collection2 = (Collection) ((jg) this.f).c.get(this.b);
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

    public f(jg jgVar, Object obj, List list, f fVar) {
        this.h = jgVar;
        this.f = jgVar;
        this.b = obj;
        this.c = list;
        this.e = fVar;
        this.d = fVar == null ? null : fVar.c;
    }

    public f(h9.l1 l1Var, Object obj, List list, f fVar) {
        this.h = l1Var;
        this.f = l1Var;
        this.b = obj;
        this.c = list;
        this.e = fVar;
        this.d = fVar == null ? null : fVar.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        switch (this.a) {
            case 0:
                zzb();
                return new e(this, i7);
            case 1:
                zzb();
                return new zf(this, i7);
            default:
                i();
                return new h9.j(this, i7);
        }
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        switch (this.a) {
            case 0:
                zzb();
                Object remove = ((List) this.c).remove(i7);
                i iVar = (i) this.h;
                iVar.d--;
                l();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.c).remove(i7);
                l();
                return remove2;
            default:
                i();
                Object remove3 = ((List) this.c).remove(i7);
                h9.l1 l1Var = (h9.l1) this.h;
                l1Var.f--;
                j();
                return remove3;
        }
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        switch (this.a) {
            case 0:
                zzb();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i7, obj);
                ((i) this.h).d++;
                if (isEmpty) {
                    k();
                    break;
                }
                break;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i7, obj);
                if (isEmpty2) {
                    k();
                    break;
                }
                break;
            default:
                i();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i7, obj);
                ((h9.l1) this.h).f++;
                if (isEmpty3) {
                    f();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean addAll = ((List) this.c).addAll(i7, collection);
                if (!addAll) {
                    return addAll;
                }
                int size2 = this.c.size();
                ((i) this.h).d += size2 - size;
                if (size != 0) {
                    return addAll;
                }
                k();
                return true;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.c).addAll(i7, collection);
                if (!addAll2) {
                    return addAll2;
                }
                this.c.size();
                if (size3 != 0) {
                    return addAll2;
                }
                k();
                return true;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size4 = size();
                boolean addAll3 = ((List) this.c).addAll(i7, collection);
                if (!addAll3) {
                    return addAll3;
                }
                int size5 = this.c.size();
                ((h9.l1) this.h).f += size5 - size4;
                if (size4 != 0) {
                    return addAll3;
                }
                f();
                return addAll3;
        }
    }
}
