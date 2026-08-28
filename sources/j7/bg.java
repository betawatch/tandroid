package j7;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class bg extends h7.c implements ListIterator {
    public final /* synthetic */ h7.e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(h7.e eVar) {
        super(eVar, (byte) 0);
        this.e = eVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        h7.e eVar = this.e;
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
    public bg(h7.e eVar, int i9) {
        super(eVar, ((List) eVar.c).listIterator(i9), (byte) 0);
        this.e = eVar;
    }
}
