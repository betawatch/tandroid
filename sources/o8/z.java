package o8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class z extends u implements List, RandomAccess {
    public static final x b = new x(l0.e, 0);

    public static l0 s(int i9, Object[] objArr) {
        return i9 == 0 ? l0.e : new l0(i9, objArr);
    }

    public static l0 t(Object... objArr) {
        int length = objArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            if (objArr[i9] == null) {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i9);
                throw new NullPointerException(sb2.toString());
            }
        }
        return s(objArr.length, objArr);
    }

    public static z u(Collection collection) {
        if (!(collection instanceof u)) {
            return t(collection.toArray());
        }
        z i9 = ((u) collection).i();
        if (!i9.r()) {
            return i9;
        }
        Object[] array = i9.toArray(u.a);
        return s(array.length, array);
    }

    public static l0 v(Object[] objArr) {
        return objArr.length == 0 ? l0.e : t((Object[]) objArr.clone());
    }

    public static l0 x(Long l10, Long l11, Long l12, Long l13, Long l14) {
        return t(l10, l11, l12, l13, l14);
    }

    public static l0 y(Object obj) {
        return t(obj);
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o8.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && g7.c0.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i9 = 0; i9 < size; i9++) {
                        if (g7.c0.a(get(i9), list.get(i9))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = ~(~(get(i10).hashCode() + (i9 * 31)));
        }
        return i9;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            if (obj.equals(get(i9))) {
                return i9;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // o8.u
    public int n(int i9, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i9 + i10] = get(i10);
        }
        return i9 + size;
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final x listIterator(int i9) {
        g7.d0.c(i9, size());
        return isEmpty() ? b : new x(this, i9);
    }

    @Override // java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public z subList(int i9, int i10) {
        g7.d0.d(i9, i10, size());
        int i11 = i10 - i9;
        return i11 == size() ? this : i11 == 0 ? l0.e : new y(this, i9, i11);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // o8.u
    public final z i() {
        return this;
    }
}
