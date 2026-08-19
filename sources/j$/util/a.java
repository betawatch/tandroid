package j$.util;

import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class a implements Spliterator {
    public final java.util.List a;
    public int b;
    public int c;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.p(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public a(java.util.List list) {
        this.a = list;
        this.b = 0;
        this.c = -1;
    }

    public a(a aVar, int i, int i2) {
        this.a = aVar.a;
        this.b = i;
        this.c = i2;
    }

    public final int a() {
        int i = this.c;
        if (i >= 0) {
            return i;
        }
        int size = this.a.size();
        this.c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a = a();
        int i = this.b;
        int i2 = (a + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new a(this, i, i2);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int a = a();
        int i = this.b;
        if (i >= a) {
            return false;
        }
        this.b = i + 1;
        try {
            consumer.s(this.a.get(i));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int a = a();
        this.b = a;
        for (int i = this.b; i < a; i++) {
            try {
                consumer.s(this.a.get(i));
            } catch (IndexOutOfBoundsException unused) {
                throw new ConcurrentModificationException();
            }
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return a() - this.b;
    }
}
