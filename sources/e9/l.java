package e9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import z7.bg;
import z7.de;
import z7.lg;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class l extends AbstractCollection implements List {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;

    public l(x7.f fVar, Object obj, List list, l lVar) {
        this.h = fVar;
        this.f = fVar;
        this.b = obj;
        this.c = list;
        this.e = lVar;
        this.d = lVar == null ? null : lVar.c;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        switch (this.a) {
            case 0:
                n();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                ((v0) this.h).e++;
                if (isEmpty) {
                    i();
                    break;
                }
                break;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                ((x7.f) this.h).d++;
                if (isEmpty2) {
                    p();
                    break;
                }
                break;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                if (isEmpty3) {
                    p();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        switch (this.a) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    boolean addAll = ((List) this.c).addAll(i10, collection);
                    if (addAll) {
                        int size2 = this.c.size();
                        ((v0) this.h).e += size2 - size;
                        if (size == 0) {
                            i();
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (!collection.isEmpty()) {
                    int size3 = size();
                    boolean addAll2 = ((List) this.c).addAll(i10, collection);
                    if (addAll2) {
                        int size4 = this.c.size();
                        ((x7.f) this.h).d += size4 - size3;
                        if (size3 == 0) {
                            p();
                            break;
                        }
                    }
                }
                break;
            default:
                if (!collection.isEmpty()) {
                    int size5 = size();
                    boolean addAll3 = ((List) this.c).addAll(i10, collection);
                    if (addAll3) {
                        this.c.size();
                        if (size5 == 0) {
                            p();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((v0) this.f).e -= size;
                    o();
                    break;
                }
                break;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((x7.f) this.f).d -= size2;
                    q();
                    break;
                }
                break;
            default:
                if (size() != 0) {
                    this.c.clear();
                    q();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                n();
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
                n();
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
                    n();
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
    public final Object get(int i10) {
        switch (this.a) {
            case 0:
                n();
                break;
            case 1:
                zzb();
                break;
            default:
                zzb();
                break;
        }
        return ((List) this.c).get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                n();
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

    public void i() {
        l lVar = (l) this.e;
        if (lVar != null) {
            lVar.i();
        } else {
            ((v0) this.f).d.put(this.b, this.c);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                n();
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
                n();
                return new c(this);
            case 1:
                zzb();
                return new c(this, (byte) 0);
            default:
                zzb();
                return new c(this, (char) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                n();
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
                n();
                return new k(this);
            case 1:
                zzb();
                return new x7.c(this);
            default:
                zzb();
                return new bg(this);
        }
    }

    public void n() {
        Collection collection;
        l lVar = (l) this.e;
        if (lVar != null) {
            lVar.n();
            if (lVar.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((v0) this.f).d.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    public void o() {
        l lVar = (l) this.e;
        if (lVar != null) {
            lVar.o();
        } else if (this.c.isEmpty()) {
            ((v0) this.f).d.remove(this.b);
        }
    }

    public void p() {
        switch (this.a) {
            case 1:
                l lVar = (l) this.e;
                if (lVar == null) {
                    ((x7.f) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    lVar.p();
                    break;
                }
            default:
                l lVar2 = (l) this.e;
                if (lVar2 == null) {
                    ((lg) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    lVar2.p();
                    break;
                }
        }
    }

    public void q() {
        switch (this.a) {
            case 1:
                l lVar = (l) this.e;
                if (lVar == null) {
                    if (this.c.isEmpty()) {
                        ((x7.f) this.f).c.remove(this.b);
                        break;
                    }
                } else {
                    lVar.q();
                    break;
                }
                break;
            default:
                l lVar2 = (l) this.e;
                if (lVar2 == null) {
                    if (this.c.isEmpty()) {
                        lg lgVar = (lg) this.f;
                        lgVar.c.remove(this.b);
                        break;
                    }
                } else {
                    lVar2.q();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        switch (this.a) {
            case 0:
                n();
                Object remove = ((List) this.c).remove(i10);
                v0 v0Var = (v0) this.h;
                v0Var.e--;
                o();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.c).remove(i10);
                x7.f fVar = (x7.f) this.h;
                fVar.d--;
                q();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.c).remove(i10);
                q();
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
                ((v0) this.f).e += size2 - size;
                o();
                return removeAll;
            case 1:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean removeAll2 = this.c.removeAll(collection);
                if (!removeAll2) {
                    return removeAll2;
                }
                int size4 = this.c.size();
                ((x7.f) this.f).d += size4 - size3;
                q();
                return removeAll2;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean removeAll3 = this.c.removeAll(collection);
                if (!removeAll3) {
                    return removeAll3;
                }
                this.c.size();
                q();
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
                    ((v0) this.f).e += size2 - size;
                    o();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size3 = size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    int size4 = this.c.size();
                    ((x7.f) this.f).d += size4 - size3;
                    q();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    this.c.size();
                    q();
                }
                return retainAll3;
        }
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        switch (this.a) {
            case 0:
                n();
                break;
            case 1:
                zzb();
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
                n();
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
    public final List subList(int i10, int i11) {
        switch (this.a) {
            case 0:
                n();
                v0 v0Var = (v0) this.h;
                List subList = ((List) this.c).subList(i10, i11);
                l lVar = (l) this.e;
                if (lVar == null) {
                    lVar = this;
                }
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.b;
                return z10 ? new h(v0Var, obj, subList, lVar) : new l(v0Var, obj, subList, lVar);
            case 1:
                zzb();
                x7.f fVar = (x7.f) this.h;
                List subList2 = ((List) this.c).subList(i10, i11);
                l lVar2 = (l) this.e;
                if (lVar2 == null) {
                    lVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.b;
                return z11 ? new x7.b(fVar, obj2, subList2, lVar2) : new l(fVar, obj2, subList2, lVar2);
            default:
                zzb();
                List subList3 = ((List) this.c).subList(i10, i11);
                l lVar3 = (l) this.e;
                if (lVar3 == null) {
                    lVar3 = this;
                }
                lg lgVar = (lg) this.h;
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.b;
                return z12 ? new de(lgVar, obj3, subList3, lVar3) : new l(lgVar, obj3, subList3, lVar3);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                n();
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

    public void zzb() {
        Collection collection;
        switch (this.a) {
            case 1:
                l lVar = (l) this.e;
                if (lVar != null) {
                    lVar.zzb();
                    if (lVar.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (!this.c.isEmpty() || (collection = (Collection) ((x7.f) this.f).c.get(this.b)) == null) {
                        return;
                    }
                    this.c = collection;
                    return;
                }
            default:
                l lVar2 = (l) this.e;
                if (lVar2 != null) {
                    lVar2.zzb();
                    if (lVar2.c != this.d) {
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

    public l(lg lgVar, Object obj, List list, l lVar) {
        this.h = lgVar;
        this.f = lgVar;
        this.b = obj;
        this.c = list;
        this.e = lVar;
        this.d = lVar == null ? null : lVar.c;
    }

    public l(v0 v0Var, Object obj, List list, l lVar) {
        this.h = v0Var;
        this.f = v0Var;
        this.b = obj;
        this.c = list;
        this.e = lVar;
        this.d = lVar == null ? null : lVar.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.a) {
            case 0:
                n();
                return new k(this, i10);
            case 1:
                zzb();
                return new x7.c(this, i10);
            default:
                zzb();
                return new bg(this, i10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                n();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    v0 v0Var = (v0) this.f;
                    v0Var.e--;
                    o();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    x7.f fVar = (x7.f) this.f;
                    fVar.d--;
                    q();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    q();
                }
                return remove3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                n();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (add) {
                    ((v0) this.f).e++;
                    if (isEmpty) {
                        i();
                        break;
                    }
                }
                break;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                boolean add2 = this.c.add(obj);
                if (add2) {
                    ((x7.f) this.f).d++;
                    if (isEmpty2) {
                        p();
                        break;
                    }
                }
                break;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (add3 && isEmpty3) {
                    p();
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                if (!collection.isEmpty()) {
                    int size = size();
                    boolean addAll = this.c.addAll(collection);
                    if (addAll) {
                        int size2 = this.c.size();
                        ((v0) this.f).e += size2 - size;
                        if (size == 0) {
                            i();
                            break;
                        }
                    }
                }
                break;
            case 1:
                if (!collection.isEmpty()) {
                    int size3 = size();
                    boolean addAll2 = this.c.addAll(collection);
                    if (addAll2) {
                        int size4 = this.c.size();
                        ((x7.f) this.f).d += size4 - size3;
                        if (size3 == 0) {
                            p();
                            break;
                        }
                    }
                }
                break;
            default:
                if (!collection.isEmpty()) {
                    int size5 = size();
                    boolean addAll3 = this.c.addAll(collection);
                    if (addAll3) {
                        this.c.size();
                        if (size5 == 0) {
                            p();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
