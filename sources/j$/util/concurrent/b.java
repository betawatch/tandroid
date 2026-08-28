package j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class b implements Collection, Serializable {
    private static final long serialVersionUID = 7249069246763182397L;
    public final ConcurrentHashMap a;

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public abstract boolean remove(Object obj);

    public b(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long j10 = this.a.j();
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i9 = (int) j10;
        Object[] objArr = new Object[i9];
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i10 == i9) {
                if (i9 >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i11 = i9 < 1073741819 ? (i9 >>> 1) + 1 + i9 : 2147483639;
                objArr = Arrays.copyOf(objArr, i11);
                i9 = i11;
            }
            objArr[i10] = next;
            i10++;
        }
        return i10 == i9 ? objArr : Arrays.copyOf(objArr, i10);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long j10 = this.a.j();
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 > 2147483639) {
            throw new OutOfMemoryError("Required array size too large");
        }
        int i9 = (int) j10;
        Object[] objArr2 = objArr.length >= i9 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i9);
        int length = objArr2.length;
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i10 == length) {
                if (length >= 2147483639) {
                    throw new OutOfMemoryError("Required array size too large");
                }
                int i11 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                objArr2 = Arrays.copyOf(objArr2, i11);
                length = i11;
            }
            objArr2[i10] = next;
            i10++;
        }
        if (objArr != objArr2 || i10 >= length) {
            return i10 == length ? objArr2 : Arrays.copyOf(objArr2, i10);
        }
        objArr2[i10] = null;
        return objArr2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (collection == this) {
            return true;
        }
        for (Object obj : collection) {
            if (obj == null || !contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        l[] lVarArr = this.a.a;
        boolean z10 = false;
        if (lVarArr == null) {
            return false;
        }
        if ((collection instanceof Set) && collection.size() > lVarArr.length) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            z10 |= remove(it2.next());
        }
        return z10;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }
}
