package com.google.android.gms.internal.mlkit_language_id_bundled;

import j$.util.List;
import j$.util.function.UnaryOperator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.SequencedCollection;

/* loaded from: classes.dex */
public abstract class zbi extends zbf implements List, RandomAccess, j$.util.List {
    private static final zbl zba = new zbg(zbj.zba, 0);

    zbi() {
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ void addFirst(Object obj) {
        List.-CC.$default$addFirst(this, obj);
    }

    public /* synthetic */ void addLast(Object obj) {
        List.-CC.$default$addLast(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zbb.zba(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zbb.zba(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public /* synthetic */ Object getFirst() {
        return List.-CC.$default$getFirst(this);
    }

    public /* synthetic */ Object getLast() {
        return List.-CC.$default$getLast(this);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
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
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Object removeFirst() {
        return List.-CC.$default$removeFirst(this);
    }

    public /* synthetic */ Object removeLast() {
        return List.-CC.$default$removeLast(this);
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.-CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    public /* synthetic */ java.util.List reversed() {
        return List.-CC.$default$reversed(this);
    }

    public /* bridge */ /* synthetic */ SequencedCollection reversed() {
        return List.-CC.$default$reversed(this);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.-CC.$default$sort(this, comparator);
    }

    @Override // com.google.android.gms.internal.mlkit_language_id_bundled.zbf
    int zba(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // java.util.List
    /* renamed from: zbf, reason: merged with bridge method [inline-methods] */
    public zbi subList(int i, int i2) {
        zbc.zbc(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? zbj.zba : new zbh(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zbh, reason: merged with bridge method [inline-methods] */
    public final zbl listIterator(int i) {
        zbc.zbb(i, size(), "index");
        return isEmpty() ? zba : new zbg(this, i);
    }

    public static zbi zbg(Object obj) {
        Object[] objArr = {obj};
        if (obj != null) {
            return new zbj(objArr, 1);
        }
        throw new NullPointerException("at index 0");
    }
}
