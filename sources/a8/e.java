package a8;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class e extends d implements ListIterator {
    public final /* synthetic */ f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(fVar);
        this.e = fVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        f fVar = this.e;
        boolean isEmpty = fVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
        ((i) fVar.h).d++;
        if (isEmpty) {
            fVar.k();
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
    public e(f fVar, int i7) {
        super(fVar, ((List) fVar.c).listIterator(i7));
        this.e = fVar;
    }
}
