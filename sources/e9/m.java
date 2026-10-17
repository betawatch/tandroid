package e9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import z7.dg;
import z7.fe;
import z7.ng;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class m extends AbstractCollection implements List {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Serializable h;

    public m(x7.f fVar, Object obj, List list, m mVar) {
        this.h = fVar;
        this.f = fVar;
        this.b = obj;
        this.c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.c;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        switch (this.a) {
            case 0:
                m();
                boolean isEmpty = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                ((p1) this.h).f++;
                if (isEmpty) {
                    h();
                    break;
                }
                break;
            case 1:
                zzb();
                boolean isEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
                ((x7.f) this.h).d++;
                if (isEmpty2) {
                    o();
                    break;
                }
                break;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                ((List) this.c).add(i10, obj);
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
                if (!collection.isEmpty()) {
                    int size = size();
                    boolean addAll = ((List) this.c).addAll(i10, collection);
                    if (addAll) {
                        int size2 = this.c.size();
                        ((p1) this.h).f += size2 - size;
                        if (size == 0) {
                            h();
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
                            o();
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
                            o();
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
                    ((p1) this.f).f -= size;
                    n();
                    break;
                }
                break;
            case 1:
                int size2 = size();
                if (size2 != 0) {
                    this.c.clear();
                    ((x7.f) this.f).d -= size2;
                    p();
                    break;
                }
                break;
            default:
                if (size() != 0) {
                    this.c.clear();
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
                m();
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
                m();
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
                    m();
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
                m();
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

    public void h() {
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.h();
        } else {
            ((p1) this.f).e.put(this.b, this.c);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                m();
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

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                m();
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
                m();
                return new d(this);
            case 1:
                zzb();
                return new d(this, (byte) 0);
            default:
                zzb();
                return new d(this, (char) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                m();
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
                m();
                return new l(this);
            case 1:
                zzb();
                return new x7.c(this);
            default:
                zzb();
                return new dg(this);
        }
    }

    public void m() {
        Collection collection;
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.m();
            if (mVar.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((p1) this.f).e.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    public void n() {
        m mVar = (m) this.e;
        if (mVar != null) {
            mVar.n();
        } else if (this.c.isEmpty()) {
            ((p1) this.f).e.remove(this.b);
        }
    }

    public void o() {
        switch (this.a) {
            case 1:
                m mVar = (m) this.e;
                if (mVar == null) {
                    ((x7.f) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    mVar.o();
                    break;
                }
            default:
                m mVar2 = (m) this.e;
                if (mVar2 == null) {
                    ((ng) this.f).c.put(this.b, this.c);
                    break;
                } else {
                    mVar2.o();
                    break;
                }
        }
    }

    public void p() {
        switch (this.a) {
            case 1:
                m mVar = (m) this.e;
                if (mVar == null) {
                    if (this.c.isEmpty()) {
                        ((x7.f) this.f).c.remove(this.b);
                        break;
                    }
                } else {
                    mVar.p();
                    break;
                }
                break;
            default:
                m mVar2 = (m) this.e;
                if (mVar2 == null) {
                    if (this.c.isEmpty()) {
                        ng ngVar = (ng) this.f;
                        ngVar.c.remove(this.b);
                        break;
                    }
                } else {
                    mVar2.p();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        switch (this.a) {
            case 0:
                m();
                Object remove = ((List) this.c).remove(i10);
                p1 p1Var = (p1) this.h;
                p1Var.f--;
                n();
                return remove;
            case 1:
                zzb();
                Object remove2 = ((List) this.c).remove(i10);
                x7.f fVar = (x7.f) this.h;
                fVar.d--;
                p();
                return remove2;
            default:
                zzb();
                Object remove3 = ((List) this.c).remove(i10);
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
                int size = size();
                boolean removeAll = this.c.removeAll(collection);
                if (!removeAll) {
                    return removeAll;
                }
                int size2 = this.c.size();
                ((p1) this.f).f += size2 - size;
                n();
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
                p();
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
                p();
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
                    ((p1) this.f).f += size2 - size;
                    n();
                }
                return retainAll;
            case 1:
                collection.getClass();
                int size3 = size();
                boolean retainAll2 = this.c.retainAll(collection);
                if (retainAll2) {
                    int size4 = this.c.size();
                    ((x7.f) this.f).d += size4 - size3;
                    p();
                }
                return retainAll2;
            default:
                collection.getClass();
                size();
                boolean retainAll3 = this.c.retainAll(collection);
                if (retainAll3) {
                    this.c.size();
                    p();
                }
                return retainAll3;
        }
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        switch (this.a) {
            case 0:
                m();
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
                m();
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
                m();
                p1 p1Var = (p1) this.h;
                List subList = ((List) this.c).subList(i10, i11);
                m mVar = (m) this.e;
                if (mVar == null) {
                    mVar = this;
                }
                boolean z10 = subList instanceof RandomAccess;
                Object obj = this.b;
                return z10 ? new i(p1Var, obj, subList, mVar) : new m(p1Var, obj, subList, mVar);
            case 1:
                zzb();
                x7.f fVar = (x7.f) this.h;
                List subList2 = ((List) this.c).subList(i10, i11);
                m mVar2 = (m) this.e;
                if (mVar2 == null) {
                    mVar2 = this;
                }
                boolean z11 = subList2 instanceof RandomAccess;
                Object obj2 = this.b;
                return z11 ? new x7.b(fVar, obj2, subList2, mVar2) : new m(fVar, obj2, subList2, mVar2);
            default:
                zzb();
                List subList3 = ((List) this.c).subList(i10, i11);
                m mVar3 = (m) this.e;
                if (mVar3 == null) {
                    mVar3 = this;
                }
                ng ngVar = (ng) this.h;
                boolean z12 = subList3 instanceof RandomAccess;
                Object obj3 = this.b;
                return z12 ? new fe(ngVar, obj3, subList3, mVar3) : new m(ngVar, obj3, subList3, mVar3);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                m();
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
                m mVar = (m) this.e;
                if (mVar != null) {
                    mVar.zzb();
                    if (mVar.c != this.d) {
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
                m mVar2 = (m) this.e;
                if (mVar2 != null) {
                    mVar2.zzb();
                    if (mVar2.c != this.d) {
                        throw new ConcurrentModificationException();
                    }
                    return;
                } else {
                    if (this.c.isEmpty()) {
                        Collection collection2 = (Collection) ((ng) this.f).c.get(this.b);
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

    public m(ng ngVar, Object obj, List list, m mVar) {
        this.h = ngVar;
        this.f = ngVar;
        this.b = obj;
        this.c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.c;
    }

    public m(p1 p1Var, Object obj, List list, m mVar) {
        this.h = p1Var;
        this.f = p1Var;
        this.b = obj;
        this.c = list;
        this.e = mVar;
        this.d = mVar == null ? null : mVar.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        switch (this.a) {
            case 0:
                m();
                return new l(this, i10);
            case 1:
                zzb();
                return new x7.c(this, i10);
            default:
                zzb();
                return new dg(this, i10);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                m();
                boolean remove = this.c.remove(obj);
                if (remove) {
                    p1 p1Var = (p1) this.f;
                    p1Var.f--;
                    n();
                }
                return remove;
            case 1:
                zzb();
                boolean remove2 = this.c.remove(obj);
                if (remove2) {
                    x7.f fVar = (x7.f) this.f;
                    fVar.d--;
                    p();
                }
                return remove2;
            default:
                zzb();
                boolean remove3 = this.c.remove(obj);
                if (remove3) {
                    p();
                }
                return remove3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                m();
                boolean isEmpty = this.c.isEmpty();
                boolean add = this.c.add(obj);
                if (add) {
                    ((p1) this.f).f++;
                    if (isEmpty) {
                        h();
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
                        o();
                        break;
                    }
                }
                break;
            default:
                zzb();
                boolean isEmpty3 = this.c.isEmpty();
                boolean add3 = this.c.add(obj);
                if (add3 && isEmpty3) {
                    o();
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
                        ((p1) this.f).f += size2 - size;
                        if (size == 0) {
                            h();
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
                            o();
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
                            o();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
