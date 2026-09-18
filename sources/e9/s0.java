package e9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class s0 extends AbstractSequentialList implements Serializable {
    public final List a;
    public final d9.e b;

    public s0(List list, d9.e eVar) {
        list.getClass();
        this.a = list;
        this.b = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new q0(this, this.a.listIterator(i10), 1);
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
