// default package

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class c66 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final aq4 b;

    public c66(List list, aq4 aq4Var) {
        list.getClass();
        this.a = list;
        this.b = aq4Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.apply(this.a.get(i));
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
    public final ListIterator listIterator(int i) {
        return new b66(this, this.a.listIterator(i), (byte) 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.b.apply(this.a.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
