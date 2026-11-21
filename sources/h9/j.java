package h9;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class j extends a8.d implements ListIterator {
    public final /* synthetic */ a8.f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a8.f fVar) {
        super(fVar, (char) 0);
        this.e = fVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a8.f fVar = this.e;
        boolean isEmpty = fVar.isEmpty();
        c().add(obj);
        ((l1) fVar.h).f++;
        if (isEmpty) {
            fVar.f();
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
    public j(a8.f fVar, int i7) {
        super(fVar, ((List) fVar.c).listIterator(i7), (char) 0);
        this.e = fVar;
    }
}
