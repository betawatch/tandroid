package com.google.android.gms.internal.play_billing;

import f7.v5;
import f7.y5;
import j$.util.List;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class r extends o implements List, RandomAccess, j$.util.List {
    public static final p b = new p(v.e, 0);

    public static v t(int i9, Object[] objArr) {
        return i9 == 0 ? v.e : new v(i9, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r u(List list) {
        if (!(list instanceof o)) {
            Object[] array = list.toArray();
            int length = array.length;
            y5.a(length, array);
            return t(length, array);
        }
        r p6 = ((o) list).p();
        if (!p6.q()) {
            return p6;
        }
        Object[] array2 = p6.toArray(o.a);
        return t(array2.length, array2);
    }

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
                p listIterator = listIterator(0);
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

    @Override // com.google.android.gms.internal.play_billing.o
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
    public final Object remove(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.-CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    /* renamed from: s */
    public r subList(int i9, int i10) {
        v5.c(i9, i10, size());
        int i11 = i10 - i9;
        return i11 == size() ? this : i11 == 0 ? v.e : new q(this, i9, i11);
    }

    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.-CC.$default$sort(this, comparator);
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final p listIterator(int i9) {
        v5.b(i9, size());
        return isEmpty() ? b : new p(this, i9);
    }

    @Override // com.google.android.gms.internal.play_billing.o
    public final r p() {
        return this;
    }
}
