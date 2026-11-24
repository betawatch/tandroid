// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class mo5 extends go5 implements List, RandomAccess, j$.util.List {
    public static final ko5 b = new ko5(y79.e, 0);

    public static y79 o(int i, Object[] objArr) {
        return i == 0 ? y79.e : new y79(i, objArr);
    }

    public static jo5 p() {
        return new jo5(4);
    }

    public static mo5 q(Collection collection) {
        if (!(collection instanceof go5)) {
            Object[] array = collection.toArray();
            ase.a(array.length, array);
            return o(array.length, array);
        }
        mo5 h = ((go5) collection).h();
        if (!h.m()) {
            return h;
        }
        Object[] array2 = h.toArray(go5.a);
        return o(array2.length, array2);
    }

    public static y79 r(Object[] objArr) {
        if (objArr.length == 0) {
            return y79.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ase.a(objArr2.length, objArr2);
        return o(objArr2.length, objArr2);
    }

    public static y79 t(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        ase.a(5, objArr);
        return o(5, objArr);
    }

    public static y79 u(Object obj) {
        Object[] objArr = {obj};
        ase.a(1, objArr);
        return o(1, objArr);
    }

    public static y79 v(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        ase.a(2, objArr);
        return o(2, objArr);
    }

    public static y79 w(Comparator comparator, List list) {
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
        ase.a(array.length, array);
        Arrays.sort(array, comparator);
        return o(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // go5, java.util.AbstractCollection, java.util.Collection, java.util.Set
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
                            if (it2.hasNext() && ese.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (ese.a(get(i), list.get(i))) {
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
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // go5
    public int i(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
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

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // go5
    /* renamed from: n */
    public final v7c iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.-CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ko5 listIterator(int i) {
        jte.m(i, size());
        return isEmpty() ? b : new ko5(this, i);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final /* synthetic */ void sort(Comparator comparator) {
        List.-CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public mo5 subList(int i, int i2) {
        jte.n(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? y79.e : new lo5(this, i, i3);
    }

    @Override // go5
    public final mo5 h() {
        return this;
    }
}
