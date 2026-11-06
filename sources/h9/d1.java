package h9;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d1 extends AbstractSequentialList implements Serializable {
    public final List a;
    public final g9.k b;

    public d1(List list, g9.k kVar) {
        list.getClass();
        this.a = list;
        this.b = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new b1(this, this.a.listIterator(i7), 1);
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
