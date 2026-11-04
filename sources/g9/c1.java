package g9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c1 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final f9.k b;

    public c1(List list, f9.k kVar) {
        list.getClass();
        this.a = list;
        this.b = kVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        return this.b.apply(this.a.get(i3));
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
    public final ListIterator listIterator(int i3) {
        return new b1(this, this.a.listIterator(i3), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i3) {
        return this.b.apply(this.a.remove(i3));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i10) {
        this.a.subList(i3, i10).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
