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
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.com.android.tools.r8.a.p(this, i10);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public x(long j3, long j10, int i10, int i11) {
        this.a = j3;
        this.b = j10;
        this.c = i10;
        this.d = i11;
    }

    @Override // j$.util.x0, j$.util.d1, j$.util.Spliterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final x trySplit() {
        long j3 = this.a;
        long j10 = (this.b + j3) >>> 1;
        if (j10 <= j3) {
            return null;
        }
        this.a = j10;
        return new x(j3, j10, this.c, this.d);
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.b - this.a;
    }

    @Override // j$.util.d1
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j3 = this.a;
        if (j3 >= this.b) {
            return false;
        }
        intConsumer.accept(ThreadLocalRandom.current().b(this.c, this.d));
        this.a = j3 + 1;
        return true;
    }

    @Override // j$.util.d1
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        long j3 = this.a;
        long j10 = this.b;
        if (j3 < j10) {
            this.a = j10;
            ThreadLocalRandom current = ThreadLocalRandom.current();
            do {
                intConsumer.accept(current.b(this.c, this.d));
                j3++;
            } while (j3 < j10);
        }
    }
}
