package f7;

import com.google.android.gms.internal.cast.u0;
import j7.l7;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class s extends u0 implements ListIterator {
    public final int b;
    public int c;
    public final u d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, int i10) {
        super(2);
        int size = uVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(l7.c(i10, size, "index"));
        }
        this.b = size;
        this.c = i10;
        this.d = uVar;
    }

    public final Object a(int i10) {
        return this.d.get(i10);
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
        int i10 = this.c;
        this.c = i10 + 1;
        return a(i10);
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
        int i10 = this.c - 1;
        this.c = i10;
        return a(i10);
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
