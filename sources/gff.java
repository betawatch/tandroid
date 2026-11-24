// default package

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gff extends c3 implements ListIterator {
    public final /* synthetic */ l3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gff(l3 l3Var, int i) {
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
    public gff(l3 l3Var) {
        super(l3Var, (char) 0);
        this.e = l3Var;
    }
}
