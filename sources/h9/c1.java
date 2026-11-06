package h9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class c1 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final g9.k b;

    public c1(List list, g9.k kVar) {
        list.getClass();
        this.a = list;
        this.b = kVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.b.apply(this.a.get(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new b1(this, this.a.listIterator(i7), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        return this.b.apply(this.a.remove(i7));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        this.a.subList(i7, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
