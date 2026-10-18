package n7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class a0 extends t {
    public static final a0 h;
    public final transient n f;

    static {
        j jVar = n.b;
        h = new a0(y.e, w.b);
    }

    public a0(n nVar, Comparator comparator) {
        super(comparator);
        this.f = nVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int y3 = y(obj, true);
        n nVar = this.f;
        if (y3 == nVar.size()) {
            return null;
        }
        return nVar.get(y3);
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
        if (collection instanceof v) {
            collection = ((v) collection).zza();
        }
        Comparator comparator = this.d;
        if (!a.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        j listIterator = this.f.listIterator(0);
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
        return this.f.q().listIterator(0);
    }

    @Override // n7.p, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            n nVar = this.f;
            if (nVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.d;
                if (!a.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    j listIterator = nVar.listIterator(0);
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

    @Override // n7.t, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int x10 = x(obj, true) - 1;
        if (x10 == -1) {
            return null;
        }
        return this.f.get(x10);
    }

    @Override // n7.i
    public final int h(Object[] objArr) {
        return this.f.h(objArr);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int y3 = y(obj, false);
        n nVar = this.f;
        if (y3 == nVar.size()) {
            return null;
        }
        return nVar.get(y3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f.listIterator(0);
    }

    @Override // n7.t, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(r0.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int x10 = x(obj, false) - 1;
        if (x10 == -1) {
            return null;
        }
        return this.f.get(x10);
    }

    @Override // n7.i
    public final int m() {
        return this.f.m();
    }

    @Override // n7.i
    public final int n() {
        return this.f.n();
    }

    @Override // n7.i
    public final e0 o() {
        return this.f.listIterator(0);
    }

    @Override // n7.i
    public final Object[] p() {
        return this.f.p();
    }

    @Override // n7.p
    public final n s() {
        return this.f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    public final int x(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    public final int y(Object obj, boolean z10) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.f, obj, this.d);
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    public final a0 z(int i10, int i11) {
        n nVar = this.f;
        if (i10 == 0) {
            if (i11 == nVar.size()) {
                return this;
            }
            i10 = 0;
        }
        Comparator comparator = this.d;
        return i10 < i11 ? new a0(nVar.subList(i10, i11), comparator) : t.w(comparator);
    }
}
