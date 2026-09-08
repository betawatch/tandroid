package e9;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import v7.t6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class j1 extends AbstractCollection implements Set {
    public final Set a;
    public final d9.g b;

    public j1(Set set, d9.g gVar) {
        this.a = set;
        this.b = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.b.apply(obj)) {
            return this.a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.a;
        boolean z10 = set instanceof RandomAccess;
        d9.g gVar = this.b;
        if (!z10 || !(set instanceof List)) {
            Iterator it = set.iterator();
            gVar.getClass();
            while (it.hasNext()) {
                if (gVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        gVar.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!gVar.apply(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        q.r(list, gVar, i10, i11);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        q.r(list, gVar, i10, i11);
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean z10;
        Set set = this.a;
        set.getClass();
        try {
            z10 = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z10 = false;
        }
        if (z10) {
            return this.b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return q.i(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return q.m(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.a.iterator();
        d9.g gVar = this.b;
        t6.d(gVar, "predicate");
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (gVar.apply(it.next())) {
                break;
            }
            i10++;
        }
        return true ^ (i10 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        d9.g gVar = this.b;
        gVar.getClass();
        return new n0(it, gVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.b.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            n0 n0Var = (n0) it;
            if (!n0Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(n0Var.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            n0 n0Var = (n0) it;
            if (n0Var.hasNext()) {
                arrayList.add(n0Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
