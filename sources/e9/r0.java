package e9;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class r0 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final d9.e b;

    public r0(List list, d9.e eVar) {
        list.getClass();
        this.a = list;
        this.b = eVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.b.apply(this.a.get(i10));
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
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.a.listIterator(i10), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return this.b.apply(this.a.remove(i10));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
