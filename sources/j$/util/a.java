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
        return j$.com.android.tools.r8.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i3) {
        return j$.com.android.tools.r8.a.o(this, i3);
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

    public a(a aVar, int i3, int i10) {
        this.a = aVar.a;
        this.b = i3;
        this.c = i10;
    }

    public final int a() {
        java.util.List list = this.a;
        int i3 = this.c;
        if (i3 >= 0) {
            return i3;
        }
        int size = list.size();
        this.c = size;
        return size;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int a10 = a();
        int i3 = this.b;
        int i10 = (a10 + i3) >>> 1;
        if (i3 >= i10) {
            return null;
        }
        this.b = i10;
        return new a(this, i3, i10);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int a10 = a();
        int i3 = this.b;
        if (i3 >= a10) {
            return false;
        }
        this.b = i3 + 1;
        try {
            consumer.x(this.a.get(i3));
            return true;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        java.util.List list = this.a;
        int a10 = a();
        this.b = a10;
        for (int i3 = this.b; i3 < a10; i3++) {
            try {
                consumer.x(list.get(i3));
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
