// default package

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class i1e implements ListIterator {
    public final /* synthetic */ byte a;
    public ListIterator b;

    public i1e(fjf fjfVar, int i) {
        this.a = (byte) 2;
        this.b = fjfVar.a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
        }
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.a) {
        }
        return (String) this.b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
        }
        return this.b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        switch (this.a) {
        }
        return (String) this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
        }
        return this.b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
