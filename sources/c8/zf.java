package c8;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class zf extends a8.d implements ListIterator {
    public final /* synthetic */ a8.f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(a8.f fVar) {
        super(fVar, (byte) 0);
        this.e = fVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        a8.f fVar = this.e;
        boolean isEmpty = fVar.isEmpty();
        b();
        ((ListIterator) this.b).add(obj);
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
    public zf(a8.f fVar, int i7) {
        super(fVar, ((List) fVar.c).listIterator(i7), (byte) 0);
        this.e = fVar;
    }
}
