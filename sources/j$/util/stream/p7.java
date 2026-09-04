package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class p7 extends q7 implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.n(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i10) {
        return j$.com.android.tools.r8.a.p(this, i10);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    public p7(Spliterator spliterator, long j3, long j10) {
        super(spliterator, j3, j10, 0L, Math.min(spliterator.estimateSize(), j10));
    }

    @Override // j$.util.stream.q7
    public final Spliterator a(Spliterator spliterator, long j3, long j10, long j11, long j12) {
        return new p7(spliterator, j3, j10, j11, j12);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        long j3;
        Objects.requireNonNull(consumer);
        long j10 = this.e;
        long j11 = this.a;
        if (j11 >= j10) {
            return false;
        }
        while (true) {
            j3 = this.d;
            if (j11 <= j3) {
                break;
            }
            this.c.tryAdvance(new a1(24));
            this.d++;
        }
        if (j3 >= this.e) {
            return false;
        }
        this.d = j3 + 1;
        return this.c.tryAdvance(consumer);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        long j3 = this.e;
        long j10 = this.a;
        if (j10 >= j3) {
            return;
        }
        long j11 = this.d;
        if (j11 >= j3) {
            return;
        }
        if (j11 >= j10 && this.c.estimateSize() + j11 <= this.b) {
            this.c.forEachRemaining(consumer);
            this.d = this.e;
            return;
        }
        while (j10 > this.d) {
            this.c.tryAdvance(new a1(25));
            this.d++;
        }
        while (this.d < this.e) {
            this.c.tryAdvance(consumer);
            this.d++;
        }
    }
}
