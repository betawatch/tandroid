package g9;

import b8.ah;
import b8.ra;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j extends ra implements ListIterator {
    public final /* synthetic */ ah e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ah ahVar) {
        super(ahVar, (byte) 0);
        this.e = ahVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ah ahVar = this.e;
        boolean isEmpty = ahVar.isEmpty();
        c().add(obj);
        ((k1) ahVar.h).f++;
        if (isEmpty) {
            ahVar.h();
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
    public j(ah ahVar, int i3) {
        super(ahVar, ((List) ahVar.c).listIterator(i3), (byte) 0);
        this.e = ahVar;
    }
}
