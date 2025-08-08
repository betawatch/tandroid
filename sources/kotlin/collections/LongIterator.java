package kotlin.collections;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class LongIterator implements Iterator {
    public abstract long nextLong();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(nextLong());
    }
}
