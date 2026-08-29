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

    public y(long j10, long j11, long j12, long j13) {
        this.a = j10;
        this.b = j11;
        this.c = j12;
        this.d = j13;
    }

    @Override // j$.util.d1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y trySplit() {
        long j10 = this.a;
        long j11 = (this.b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.a = j11;
        return new y(j10, j11, this.c, this.d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.a;
        if (j10 >= this.b) {
            return false;
        }
        longConsumer.accept(ThreadLocalRandom.current().c(this.c, this.d));
        this.a = j10 + 1;
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        long j10 = this.a;
        long j11 = this.b;
        if (j10 < j11) {
            this.a = j11;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                longConsumer.accept(current.c(this.c, this.d));
                j10++;
            } while (j10 < j11);
        }
    }
}
