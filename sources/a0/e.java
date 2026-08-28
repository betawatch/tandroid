package a0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements Collection {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.a;
        int a2 = fVar.a(obj);
        if (a2 < 0) {
            return false;
        }
        fVar.f(a2);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.a;
        int i9 = fVar.c;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i9) {
            if (collection.contains(fVar.h(i10))) {
                fVar.f(i10);
                i10--;
                i9--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.a;
        int i9 = fVar.c;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i9) {
            if (!collection.contains(fVar.h(i10))) {
                fVar.f(i10);
                i10--;
                i9--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.a;
        int i9 = fVar.c;
        Object[] objArr = new Object[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = fVar.h(i10);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.a;
        int i9 = fVar.c;
        if (objArr.length < i9) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = fVar.h(i10);
        }
        if (objArr.length > i9) {
            objArr[i9] = null;
        }
        return objArr;
    }
}
