package j$.util.concurrent;

import j$.util.A;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class e extends o implements Spliterator {
    final ConcurrentHashMap i;
    long j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    e(k[] kVarArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
        super(kVarArr, i, i2, i3);
        this.i = concurrentHashMap;
        this.j = j;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i = this.f;
        int i2 = this.g;
        int i3 = (i + i2) >>> 1;
        if (i3 <= i) {
            return null;
        }
        k[] kVarArr = this.a;
        this.g = i3;
        long j = this.j >>> 1;
        this.j = j;
        return new e(kVarArr, this.h, i3, i2, j, this.i);
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        consumer.getClass();
        while (true) {
            k b = b();
            if (b == null) {
                return;
            } else {
                consumer.r(new j(b.b, b.c, this.i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean s(Consumer consumer) {
        consumer.getClass();
        k b = b();
        if (b == null) {
            return false;
        }
        consumer.r(new j(b.b, b.c, this.i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }
}
