package h9;

import a8.ha;
import a8.ia;
import j$.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class i0 extends d0 implements List, RandomAccess, j$.util.List {
    public static final g0 b = new g0(t1.e, 0);

    public static t1 o(int i7, Object[] objArr) {
        return i7 == 0 ? t1.e : new t1(i7, objArr);
    }

    public static f0 p() {
        return new f0(4);
    }

    public static i0 q(Collection collection) {
        if (!(collection instanceof d0)) {
            Object[] array = collection.toArray();
            o.e(array.length, array);
            return o(array.length, array);
        }
        i0 f10 = ((d0) collection).f();
        if (!f10.m()) {
            return f10;
        }
        Object[] array2 = f10.toArray(d0.a);
        return o(array2.length, array2);
    }

    public static t1 r(Object[] objArr) {
        if (objArr.length == 0) {
            return t1.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        o.e(objArr2.length, objArr2);
        return o(objArr2.length, objArr2);
    }

    public static t1 t(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        o.e(5, objArr);
        return o(5, objArr);
    }

    public static t1 u(Object obj) {
        Object[] objArr = {obj};
        o.e(1, objArr);
        return o(1, objArr);
    }

    public static t1 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        o.e(2, objArr);
        return o(2, objArr);
    }

    public static t1 w(Comparator comparator, List list) {
        List list2;
        comparator.getClass();
        if (list instanceof Collection) {
            list2 = list;
        } else {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list2 = arrayList;
        }
        Object[] array = list2.toArray();
        o.e(array.length, array);
        Arrays.sort(array, comparator);
        return o(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                            if (it2.hasNext() && ha.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i7 = 0; i7 < size; i7++) {
                        if (ha.a(get(i7), list.get(i7))) {
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
        int i7 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i7 = ~(~(get(i10).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // h9.d0
    public int i(int i7, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i7 + i10] = get(i10);
        }
        return i7 + size;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // h9.d0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
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

    @Override // h9.d0
    /* renamed from: n */
    public final h2 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.-CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final g0 listIterator(int i7) {
        ia.m(i7, size());
        return isEmpty() ? b : new g0(this, i7);
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.-CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public i0 subList(int i7, int i10) {
        ia.n(i7, i10, size());
        int i11 = i10 - i7;
        return i11 == size() ? this : i11 == 0 ? t1.e : new h0(this, i7, i11);
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // h9.d0
    public final i0 f() {
        return this;
    }
}
