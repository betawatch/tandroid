package n7;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class cg extends l7.c implements ListIterator {
    public final /* synthetic */ l7.e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(l7.e eVar) {
        super(eVar, (byte) 0);
        this.e = eVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        l7.e eVar = this.e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        if (isEmpty) {
            eVar.p();
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
    public cg(l7.e eVar, int i10) {
        super(eVar, ((List) eVar.c).listIterator(i10), (byte) 0);
        this.e = eVar;
    }
}
