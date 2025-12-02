package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class IntIterator implements Iterator {
    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }
}
