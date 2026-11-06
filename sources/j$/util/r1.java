package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class r1 implements a1 {
    public final long[] a;
    public int b;
    public final int c;
    public final int d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.m(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return j$.com.android.tools.r8.a.o(this, i7);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    public r1(long[] jArr, int i7, int i10, int i11) {
        this.a = jArr;
        this.b = i7;
        this.c = i10;
        this.d = i11 | 16448;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final a1 trySplit() {
        int i7 = this.b;
        int i10 = (this.c + i7) >>> 1;
        if (i7 >= i10) {
            return null;
        }
        this.b = i10;
        return new r1(this.a, i7, i10, this.d);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        int i7;
        longConsumer.getClass();
        long[] jArr = this.a;
        int length = jArr.length;
        int i10 = this.c;
        if (length < i10 || (i7 = this.b) < 0) {
            return;
        }
        this.b = i10;
        if (i7 < i10) {
            do {
                longConsumer.accept(jArr[i7]);
                i7++;
            } while (i7 < i10);
        }
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        int i7 = this.b;
        if (i7 < 0 || i7 >= this.c) {
            return false;
        }
        this.b = i7 + 1;
        longConsumer.accept(this.a[i7]);
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.c - this.b;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.d;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.com.android.tools.r8.a.o(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
