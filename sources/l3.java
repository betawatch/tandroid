// default package

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class l3 extends d3 implements ListIterator {
    public final /* synthetic */ m3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(m3 m3Var, int i) {
        super(m3Var, ((List) m3Var.c).listIterator(i));
        this.e = m3Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m3 m3Var = this.e;
        boolean isEmpty = m3Var.isEmpty();
        c().add(obj);
        ((fj7) m3Var.h).f++;
        if (isEmpty) {
            m3Var.h();
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
    public l3(m3 m3Var) {
        super(m3Var);
        this.e = m3Var;
    }
}
