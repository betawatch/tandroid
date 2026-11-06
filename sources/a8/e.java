package a8;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
