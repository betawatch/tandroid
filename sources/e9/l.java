package e9;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l extends d implements ListIterator {
    public final /* synthetic */ m e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar) {
        super(mVar);
        this.e = mVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m mVar = this.e;
        boolean isEmpty = mVar.isEmpty();
        c().add(obj);
        ((p1) mVar.h).f++;
        if (isEmpty) {
            mVar.l();
        }
    }

    public final ListIterator c() {
        a();
        return (ListIterator) this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, int i10) {
        super(mVar, ((List) mVar.c).listIterator(i10));
        this.e = mVar;
    }
}
