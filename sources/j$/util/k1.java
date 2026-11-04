package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class k1 implements u0 {
    public final double[] a;
    public int b;
    public final int c;
    public final int d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.h(this, consumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.y(this, consumer);
    }

    public k1(double[] dArr, int i3, int i10, int i11) {
        this.a = dArr;
        this.b = i3;
        this.c = i10;
        this.d = i11 | 16448;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final u0 trySplit() {
        int i3 = this.b;
        int i10 = (this.c + i3) >>> 1;
        if (i3 >= i10) {
            return null;
        }
        this.b = i10;
        return new k1(this.a, i3, i10, this.d);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        int i3;
        doubleConsumer.getClass();
        double[] dArr = this.a;
        int length = dArr.length;
        int i10 = this.c;
        if (length < i10 || (i3 = this.b) < 0) {
            return;
        }
        this.b = i10;
        if (i3 < i10) {
            do {
                doubleConsumer.accept(dArr[i3]);
                i3++;
            } while (i3 < i10);
        }
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        int i3 = this.b;
        if (i3 < 0 || i3 >= this.c) {
            return false;
        }
        this.b = i3 + 1;
        doubleConsumer.accept(this.a[i3]);
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
