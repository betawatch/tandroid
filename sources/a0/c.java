package a0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements Set {
    public final /* synthetic */ f a;

    public c(f fVar) {
        this.a = fVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        f fVar = this.a;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            if (fVar.c == set.size()) {
                return fVar.i(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        f fVar = this.a;
        int i9 = 0;
        for (int i10 = fVar.c - 1; i10 >= 0; i10--) {
            Object e10 = fVar.e(i10);
            i9 += e10 == null ? 0 : e10.hashCode();
        }
        return i9;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.a;
        int c10 = fVar.c(obj);
        if (c10 < 0) {
            return false;
        }
        fVar.f(c10);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.a;
        int i9 = fVar.c;
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            if (!collection.contains(fVar.e(i10))) {
                fVar.f(i10);
            }
        }
        return i9 != fVar.c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        f fVar = this.a;
        int i9 = fVar.c;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = fVar.e(i10);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.a;
        int i9 = fVar.c;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = fVar.e(i10);
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }
}
