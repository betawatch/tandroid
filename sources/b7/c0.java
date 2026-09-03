package b7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c0 extends v {
    public static final c0 h;
    public final transient o f;

    static {
        k kVar = o.b;
        h = new c0(a0.e, y.b);
    }

    public c0(o oVar, Comparator comparator) {
        super(comparator);
        this.f = oVar;
    }

    public final c0 A(int i10, int i11) {
        o oVar = this.f;
        if (i10 == 0) {
            if (i11 == oVar.size()) {
                return this;
            }
            i10 = 0;
        }
        Comparator comparator = this.d;
        return i10 < i11 ? new c0(oVar.subList(i10, i11), comparator) : v.x(comparator);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int z4 = z(obj, true);
        o oVar = this.f;
        if (z4 == oVar.size()) {
            return null;
        }
        return oVar.get(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof x) {
            collection = ((x) collection).zza();
        }
        Comparator comparator = this.d;
        if (!b.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        k listIterator = this.f.listIterator(0);
        Iterator it = collection.iterator();
        if (listIterator.hasNext()) {
            Object next = it.next();
            Object next2 = listIterator.next();
            while (true) {
                try {
                    int compare = comparator.compare(next2, next);
                    if (compare >= 0) {
                        if (compare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        next2 = listIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f.r().listIterator(0);
    }

    @Override // b7.q, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            o oVar = this.f;
            if (oVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.d;
                if (!b.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    k listIterator = oVar.listIterator(0);
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        Object next2 = it.next();
                        if (next2 != null && comparator.compare(next, next2) == 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // b7.v, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int y10 = y(obj, true) - 1;
        if (y10 == -1) {
            return null;
        }
        return this.f.get(y10);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int z4 = z(obj, false);
        o oVar = this.f;
        if (z4 == oVar.size()) {
            return null;
        }
        return oVar.get(z4);
    }

    @Override // b7.j
    public final int i(Object[] objArr) {
        return this.f.i(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // b7.v, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int y10 = y(obj, false) - 1;
        if (y10 == -1) {
            return null;
        }
        return this.f.get(y10);
    }

    @Override // b7.j
    public final int n() {
        return this.f.n();
    }

    @Override // b7.j
    public final int o() {
        return this.f.o();
    }

    @Override // b7.j
    public final g0 p() {
        return this.f.listIterator(0);
    }

    @Override // b7.j
    public final Object[] q() {
        return this.f.q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    @Override // b7.q
    public final o t() {
        return this.f;
    }

    public final int y(Object obj, boolean z4) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z4 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int z(Object obj, boolean z4) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z4 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }
}
