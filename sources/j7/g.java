package j7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends b7.x implements ListIterator {
    public final int b;
    public int c;
    public final i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, int i9) {
        super(8);
        int size = iVar.size();
        if (i9 < 0 || i9 > size) {
            throw new IndexOutOfBoundsException(f7.y8.c(i9, size, "index"));
        }
        this.b = size;
        this.c = i9;
        this.d = iVar;
    }

    public final Object a(int i9) {
        return this.d.get(i9);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i9 = this.c;
        this.c = i9 + 1;
        return a(i9);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i9 = this.c - 1;
        this.c = i9;
        return a(i9);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
