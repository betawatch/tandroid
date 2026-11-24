// default package

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class hhf extends c3 implements ListIterator {
    public final /* synthetic */ l3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhf(l3 l3Var, int i) {
        super(l3Var, ((List) l3Var.c).listIterator(i), (char) 0);
        this.e = l3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l3 l3Var = this.e;
        boolean isEmpty = l3Var.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        if (isEmpty) {
            l3Var.k();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        b();
        return ((ListIterator) this.b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        b();
        return ((ListIterator) this.b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        b();
        return ((ListIterator) this.b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        b();
        return ((ListIterator) this.b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b();
        ((ListIterator) this.b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhf(l3 l3Var) {
        super(l3Var, (char) 0);
        this.e = l3Var;
    }
}
