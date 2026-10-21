package e9;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
            mVar.h();
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
