// default package

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class k3 extends c3 implements ListIterator {
    public final /* synthetic */ l3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(l3 l3Var, int i) {
        super(l3Var, ((List) l3Var.c).listIterator(i));
        this.e = l3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l3 l3Var = this.e;
        boolean isEmpty = l3Var.isEmpty();
        c().add(obj);
        ((zi7) l3Var.h).f++;
        if (isEmpty) {
            l3Var.h();
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
    public k3(l3 l3Var) {
        super(l3Var);
        this.e = l3Var;
    }
}
