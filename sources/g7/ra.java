package g7;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class ra extends j9 implements List, RandomAccess {
    public static final pa b = new pa(ta.e, 0);

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        int i9;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    while (i9 < size) {
                        Object obj2 = get(i9);
                        Object obj3 = list.get(i9);
                        i9 = (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) ? i9 + 1 : 0;
                    }
                    return true;
                }
                pa listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i9 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i9 = (i9 * 31) + get(i10).hashCode();
        }
        return i9;
    }

    @Override // g7.j9
    public int i(Object[] objArr) {
        int size = size();
        for (int i9 = 0; i9 < size; i9++) {
            objArr[i9] = get(i9);
        }
        return size;
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
    public final /* synthetic */ Iterator iterator() {
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

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q */
    public ra subList(int i9, int i10) {
        f7.p7.b(i9, i10, size());
        int i11 = i10 - i9;
        return i11 == size() ? this : i11 == 0 ? ta.e : new qa(this, i9, i11);
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final pa listIterator(int i9) {
        int size = size();
        if (i9 < 0 || i9 > size) {
            throw new IndexOutOfBoundsException(f7.p7.c(i9, size, "index"));
        }
        return isEmpty() ? b : new pa(this, i9);
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }
}
