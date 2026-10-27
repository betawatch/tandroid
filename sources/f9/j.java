package f9;

import a8.dh;
import a8.ta;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class j extends ta implements ListIterator {
    public final /* synthetic */ dh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dh dhVar) {
        super(dhVar, (byte) 0);
        this.e = dhVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        dh dhVar = this.e;
        boolean isEmpty = dhVar.isEmpty();
        c().add(obj);
        ((k1) dhVar.h).f++;
        if (isEmpty) {
            dhVar.h();
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
    public j(dh dhVar, int i10) {
        super(dhVar, ((List) dhVar.c).listIterator(i10), (byte) 0);
        this.e = dhVar;
    }
}
