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
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.com.android.tools.r8.a.p(this, i9);
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

    public a(a aVar, int i9, int i10) {
        this.a = aVar.a;
        this.b = i9;
        this.c = i10;
    }

    public final int a() {
        java.util.List list = this.a;
        int i9 = this.c;
        if (i9 >= 0) {
            return i9;
        }
        int size = list.size();
        this.c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a2 = a();
        int i9 = this.b;
        int i10 = (a2 + i9) >>> 1;
        if (i9 >= i10) {
            return null;
        }
        this.b = i10;
        return new a(this, i9, i10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int a2 = a();
        int i9 = this.b;
        if (i9 >= a2) {
            return false;
        }
        this.b = i9 + 1;
        try {
            consumer.x(this.a.get(i9));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.a;
        int a2 = a();
        this.b = a2;
        for (int i9 = this.b; i9 < a2; i9++) {
            try {
                consumer.x(list.get(i9));
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
