package j$.util.concurrent;

import j$.util.a1;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes2.dex */
public final class y implements a1 {
    public long a;
    public final long b;
    public final long c;
    public final long d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.com.android.tools.r8.a.p(this, i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.B(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public y(long j3, long j10, long j11, long j12) {
        this.a = j3;
        this.b = j10;
        this.c = j11;
        this.d = j12;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j3 = this.a;
        long j10 = (this.b + j3) >>> 1;
        if (j10 <= j3) {
            return null;
        }
        this.a = j10;
        return new y(j3, j10, this.c, this.d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j3 = this.a;
        if (j3 >= this.b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().c(this.c, this.d));
        this.a = j3 + 1;
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j3 = this.a;
        long j10 = this.b;
        if (j3 < j10) {
            this.a = j10;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.c(this.c, this.d));
                j3++;
            } while (j3 < j10);
        }
    }
}
