package hd;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a extends cd.b implements ListIterator {
    public final /* synthetic */ c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i10) {
        super(cVar);
        this.d = cVar;
        int i11 = cVar.i();
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "index: ", ", size: "));
        }
        this.b = i10;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.b - 1;
        this.b = i10;
        return this.d.get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
