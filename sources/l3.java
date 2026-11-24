// default package

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class l3 extends AbstractCollection implements List {
    public final /* synthetic */ byte a = 1;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;

    public l3(l9d l9dVar, Object obj, List list, l3 l3Var) {
        this.h = l9dVar;
        this.f = l9dVar;
        this.b = obj;
        this.c = list;
        this.e = l3Var;
        this.d = l3Var == null ? null : l3Var.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                i();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (add) {
                    ((zi7) serializable).f++;
                    if (isEmpty) {
                        h();
                    }
                }
                return add;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (add2) {
                    ((l9d) serializable).d++;
                    if (isEmpty2) {
                        k();
                        return true;
                    }
                }
                return add2;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (!add3 || !isEmpty3) {
                    return add3;
                }
                k();
                return true;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.a;
        Serializable serializable = this.h;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = ((List) this.c).addAll(i, collection);
                    if (z) {
                        ((zi7) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            h();
                        }
                    }
                }
                return z;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = ((List) this.c).addAll(i, collection);
                if (addAll) {
                    ((l9d) serializable).d += this.c.size() - size2;
                    if (size2 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = ((List) this.c).addAll(i, collection);
                if (addAll2) {
                    this.c.size();
                    if (size3 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((zi7) serializable).f -= size;
                    j();
                    break;
                }
                break;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((l9d) serializable).d -= size2;
                    l();
                    break;
                }
                break;
            default:
                if (size() != 0) {
                    this.c.clear();
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
                i();
                break;
            case 1:
                zzb();
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
                i();
                break;
            case 1:
                zzb();
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
                if (obj != this) {
                    i();
                    break;
                }
                break;
            case 1:
                if (obj != this) {
                    zzb();
                    break;
                }
                break;
            default:
                if (obj != this) {
                    zzb();
                    break;
                }
                break;
        }
        return this.c.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).get(i);
    }

    public final void h() {
        l3 l3Var = (l3) this.e;
        if (l3Var != null) {
            l3Var.h();
        } else {
            ((zi7) this.f).e.put(this.b, this.c);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return this.c.hashCode();
    }

    public final void i() {
        Collection collection;
        l3 l3Var = (l3) this.e;
        if (l3Var != null) {
            l3Var.i();
            if (l3Var.c != this.d) {
                zg.b();
                return;
            }
            return;
        }
        if (!this.c.isEmpty() || (collection = (Collection) ((zi7) this.f).e.get(this.b)) == null) {
            return;
        }
        this.c = collection;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
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
                i();
                return new c3(this);
            case 1:
                zzb();
                return new c3(this, (byte) 0);
            default:
                zzb();
                return new c3(this, (char) 0);
        }
    }

    public final void j() {
        l3 l3Var = (l3) this.e;
        if (l3Var != null) {
            l3Var.j();
        } else if (this.c.isEmpty()) {
            ((zi7) this.f).e.remove(this.b);
        }
    }

    public final void k() {
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                l3 l3Var = (l3) abstractCollection;
                if (l3Var == null) {
                    ((l9d) serializable).c.put(obj, this.c);
                    break;
                } else {
                    l3Var.k();
                    break;
                }
            default:
                l3 l3Var2 = (l3) abstractCollection;
                if (l3Var2 == null) {
                    ((wjf) serializable).c.put(obj, this.c);
                    break;
                } else {
                    l3Var2.k();
                    break;
                }
        }
    }

    public final void l() {
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                l3 l3Var = (l3) abstractCollection;
                if (l3Var == null) {
                    if (this.c.isEmpty()) {
                        ((l9d) serializable).c.remove(obj);
                        break;
                    }
                } else {
                    l3Var.l();
                    break;
                }
                break;
            default:
                l3 l3Var2 = (l3) abstractCollection;
                if (l3Var2 == null) {
                    if (this.c.isEmpty()) {
                        ((wjf) serializable).c.remove(obj);
                        break;
                    }
                } else {
                    l3Var2.l();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
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
                i();
                return new k3(this);
            case 1:
                zzb();
                return new m8d(this);
            default:
                zzb();
                return new hhf(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.a;
        Serializable serializable = this.h;
        switch (b) {
            case 0:
                i();
                Object remove = ((List) this.c).remove(i);
                zi7 zi7Var = (zi7) serializable;
                zi7Var.f--;
                j();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.c).remove(i);
                l9d l9dVar = (l9d) serializable;
                l9dVar.d--;
                l();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.c).remove(i);
                l();
                return remove3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((zi7) serializable).f += this.c.size() - size;
                        j();
                        break;
                    }
                }
                break;
            case 1:
                if (!collection.isEmpty()) {
                    int size2 = size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        ((l9d) serializable).d += this.c.size() - size2;
                        l();
                        break;
                    }
                }
                break;
            default:
                if (!collection.isEmpty()) {
                    size();
                    z = this.c.removeAll(collection);
                    if (z) {
                        this.c.size();
                        l();
                        break;
                    }
                }
                break;
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                collection.getClass();
                int size = size();
                boolean retainAll = this.c.retainAll(collection);
                if (retainAll) {
                    ((zi7) serializable).f += this.c.size() - size;
                    j();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size2 = size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    ((l9d) serializable).d += this.c.size() - size2;
                    l();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    this.c.size();
                    l();
                }
                return retainAll3;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        byte b = this.a;
        Serializable serializable = this.h;
        Object obj = this.b;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 0:
                i();
                zi7 zi7Var = (zi7) serializable;
                List subList = ((List) this.c).subList(i, i2);
                l3 l3Var = (l3) abstractCollection;
                if (l3Var != null) {
                    this = l3Var;
                }
                return subList instanceof RandomAccess ? new h3(zi7Var, obj, subList, this) : new l3(zi7Var, obj, subList, this);
            case 1:
                zzb();
                l9d l9dVar = (l9d) serializable;
                List subList2 = ((List) this.c).subList(i, i2);
                l3 l3Var2 = (l3) abstractCollection;
                if (l3Var2 != null) {
                    this = l3Var2;
                }
                return subList2 instanceof RandomAccess ? new m7d(l9dVar, obj, subList2, this) : new l3(l9dVar, obj, subList2, this);
            default:
                zzb();
                List subList3 = ((List) this.c).subList(i, i2);
                l3 l3Var3 = (l3) abstractCollection;
                if (l3Var3 != null) {
                    this = l3Var3;
                }
                wjf wjfVar = (wjf) serializable;
                return subList3 instanceof RandomAccess ? new bdf(wjfVar, obj, subList3, this) : new l3(wjfVar, obj, subList3, this);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                i();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return this.c.toString();
    }

    public final void zzb() {
        Collection collection;
        Collection collection2;
        byte b = this.a;
        Object obj = this.b;
        Serializable serializable = this.f;
        Collection collection3 = this.d;
        AbstractCollection abstractCollection = this.e;
        switch (b) {
            case 1:
                l3 l3Var = (l3) abstractCollection;
                if (l3Var == null) {
                    if (this.c.isEmpty() && (collection = (Collection) ((l9d) serializable).c.get(obj)) != null) {
                        this.c = collection;
                        break;
                    }
                } else {
                    l3Var.zzb();
                    if (l3Var.c != collection3) {
                        zg.b();
                        break;
                    }
                }
                break;
            default:
                l3 l3Var2 = (l3) abstractCollection;
                if (l3Var2 == null) {
                    if (this.c.isEmpty() && (collection2 = (Collection) ((wjf) serializable).c.get(obj)) != null) {
                        this.c = collection2;
                        break;
                    }
                } else {
                    l3Var2.zzb();
                    if (l3Var2.c != collection3) {
                        zg.b();
                        break;
                    }
                }
                break;
        }
    }

    public l3(wjf wjfVar, Object obj, List list, l3 l3Var) {
        this.h = wjfVar;
        this.f = wjfVar;
        this.b = obj;
        this.c = list;
        this.e = l3Var;
        this.d = l3Var == null ? null : l3Var.c;
    }

    public l3(zi7 zi7Var, Object obj, List list, l3 l3Var) {
        this.h = zi7Var;
        this.f = zi7Var;
        this.b = obj;
        this.c = list;
        this.e = l3Var;
        this.d = l3Var == null ? null : l3Var.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                i();
                return new k3(this, i);
            case 1:
                zzb();
                return new m8d(this, i);
            default:
                zzb();
                return new hhf(this, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        byte b = this.a;
        Serializable serializable = this.f;
        switch (b) {
            case 0:
                i();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    zi7 zi7Var = (zi7) serializable;
                    zi7Var.f--;
                    j();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    l9d l9dVar = (l9d) serializable;
                    l9dVar.d--;
                    l();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    l();
                }
                return remove3;
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.a;
        Serializable serializable = this.h;
        switch (b) {
            case 0:
                i();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((zi7) serializable).f++;
                if (isEmpty) {
                    h();
                    break;
                }
                break;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((l9d) serializable).d++;
                if (isEmpty2) {
                    k();
                    break;
                }
                break;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                if (isEmpty3) {
                    k();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        byte b = this.a;
        Serializable serializable = this.f;
        boolean z = false;
        switch (b) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    z = this.c.addAll(collection);
                    if (z) {
                        ((zi7) serializable).f += this.c.size() - size;
                        if (size == 0) {
                            h();
                        }
                    }
                }
                return z;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size2 = size();
                boolean addAll = this.c.addAll(collection);
                if (addAll) {
                    ((l9d) serializable).d += this.c.size() - size2;
                    if (size2 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean addAll2 = this.c.addAll(collection);
                if (addAll2) {
                    this.c.size();
                    if (size3 == 0) {
                        k();
                        return true;
                    }
                }
                return addAll2;
        }
    }
}
