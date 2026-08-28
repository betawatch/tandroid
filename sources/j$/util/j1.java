package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class j1 implements Spliterator {
    public final Object[] a;
    public int b;
    public final int c;
    public final int d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.com.android.tools.r8.a.p(this, i9);
    }

    public j1(Object[] objArr, int i9, int i10, int i11) {
        this.a = objArr;
        this.b = i9;
        this.c = i10;
        this.d = i11 | 16448;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i9 = this.b;
        int i10 = (this.c + i9) >>> 1;
        if (i9 >= i10) {
            return null;
        }
        this.b = i10;
        return new j1(this.a, i9, i10, this.d);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        int i9;
        consumer.getClass();
        Object[] objArr = this.a;
        int length = objArr.length;
        int i10 = this.c;
        if (length < i10 || (i9 = this.b) < 0) {
            return;
        }
        this.b = i10;
        if (i9 < i10) {
            do {
                consumer.x(objArr[i9]);
                i9++;
            } while (i9 < i10);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        int i9 = this.b;
        if (i9 < 0 || i9 >= this.c) {
            return false;
        }
        this.b = i9 + 1;
        consumer.x(this.a[i9]);
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
