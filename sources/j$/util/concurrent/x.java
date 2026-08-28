package j$.util.concurrent;

import j$.util.x0;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public final class x implements x0 {
    public long a;
    public final long b;
    public final int c;
    public final int d;

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 17728;
    }

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

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public x(long j10, long j11, int i9, int i10) {
        this.a = j10;
        this.b = j11;
        this.c = i9;
        this.d = i10;
    }

    @Override // j$.util.x0, j$.util.d1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x trySplit() {
        long j10 = this.a;
        long j11 = (this.b + j10) >>> 1;
        if (j11 <= j10) {
            return null;
        }
        this.a = j11;
        return new x(j10, j11, this.c, this.d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.a;
        if (j10 >= this.b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.c, this.d));
        this.a = j10 + 1;
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j10 = this.a;
        long j11 = this.b;
        if (j10 < j11) {
            this.a = j11;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.b(this.c, this.d));
                j10++;
            } while (j10 < j11);
        }
    }
}
