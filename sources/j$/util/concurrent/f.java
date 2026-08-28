package j$.util.concurrent;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class f extends p implements Spliterator {
    public final ConcurrentHashMap i;
    public long j;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 4353;
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

    public f(l[] lVarArr, int i9, int i10, int i11, long j10, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i9, i10, i11);
        this.i = concurrentHashMap;
        this.j = j10;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        int i9 = this.f;
        int i10 = this.g;
        int i11 = (i9 + i10) >>> 1;
        if (i11 <= i9) {
            return null;
        }
        l[] lVarArr = this.a;
        this.g = i11;
        long j10 = this.j >>> 1;
        this.j = j10;
        return new f(lVarArr, this.h, i11, i10, j10, this.i);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        while (true) {
            l a2 = a();
            if (a2 == null) {
                return;
            } else {
                consumer.x(new k(a2.b, a2.c, this.i));
            }
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        l a2 = a();
        if (a2 == null) {
            return false;
        }
        consumer.x(new k(a2.b, a2.c, this.i));
        return true;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.j;
    }
}
