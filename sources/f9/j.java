package f9;

import a8.dh;
import a8.ta;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
