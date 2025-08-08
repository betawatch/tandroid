package j$.util;

import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class b0 implements J {
    private final long[] a;
    private int b;
    private final int c;
    private final int d;

    @Override // j$.util.Spliterator
    public final /* synthetic */ void a(Consumer consumer) {
        A.h(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return A.k(this, i);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean s(Consumer consumer) {
        return A.n(this, consumer);
    }

    public b0(long[] jArr, int i, int i2, int i3) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
        this.d = i3 | 16448;
    }

    @Override // j$.util.Spliterator
    public final J trySplit() {
        int i = this.b;
        int i2 = (this.c + i) >>> 1;
        if (i >= i2) {
            return null;
        }
        this.b = i2;
        return new b0(this.a, i, i2, this.d);
    }

    @Override // j$.util.M
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void e(j$.util.function.Y y) {
        int i;
        y.getClass();
        long[] jArr = this.a;
        int length = jArr.length;
        int i2 = this.c;
        if (length < i2 || (i = this.b) < 0) {
            return;
        }
        this.b = i2;
        if (i < i2) {
            do {
                y.accept(jArr[i]);
                i++;
            } while (i < i2);
        }
    }

    @Override // j$.util.M
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean p(j$.util.function.Y y) {
        y.getClass();
        int i = this.b;
        if (i < 0 || i >= this.c) {
            return false;
        }
        this.b = i + 1;
        y.accept(this.a[i]);
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
        if (A.k(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }
}
