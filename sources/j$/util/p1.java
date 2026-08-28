package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class p1 implements x0 {
    public final int[] a;
    public int b;
    public final int c;
    public final int d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.j(this, consumer);
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
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    public p1(int[] iArr, int i9, int i10, int i11) {
        this.a = iArr;
        this.b = i9;
        this.c = i10;
        this.d = i11 | 16448;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    public final x0 trySplit() {
        int i9 = this.b;
        int i10 = (this.c + i9) >>> 1;
        if (i9 >= i10) {
            return null;
        }
        this.b = i10;
        return new p1(this.a, i9, i10, this.d);
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        int i9;
        intConsumer.getClass();
        int[] iArr = this.a;
        int length = iArr.length;
        int i10 = this.c;
        if (length < i10 || (i9 = this.b) < 0) {
            return;
        }
        this.b = i10;
        if (i9 < i10) {
            do {
                intConsumer.accept(iArr[i9]);
                i9++;
            } while (i9 < i10);
        }
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        int i9 = this.b;
        if (i9 < 0 || i9 >= this.c) {
            return false;
        }
        this.b = i9 + 1;
        intConsumer.accept(this.a[i9]);
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
        if (j$.com.android.tools.r8.a.p(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
