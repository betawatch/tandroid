package l7;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class d extends c implements ListIterator {
    public final /* synthetic */ e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(eVar);
        this.e = eVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        e eVar = this.e;
        boolean isEmpty = eVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((h) eVar.h).d++;
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
    public d(e eVar, int i10) {
        super(eVar, ((List) eVar.c).listIterator(i10));
        this.e = eVar;
    }
}
