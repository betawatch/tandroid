package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class l3 extends m3 implements Spliterator {
    l3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0L, Math.min(spliterator.estimateSize(), j2));
    }

    private l3(Spliterator spliterator, long j, long j2, long j3, long j4) {
        super(spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final void a(Consumer consumer) {
        consumer.getClass();
        long j = this.e;
        long j2 = this.a;
        if (j2 >= j) {
            return;
        }
        long j3 = this.d;
        if (j3 >= j) {
            return;
        }
        if (j3 >= j2 && this.c.estimateSize() + j3 <= this.b) {
            this.c.a(consumer);
            this.d = this.e;
            return;
        }
        while (j2 > this.d) {
            this.c.s(new d0(11));
            this.d++;
        }
        while (this.d < this.e) {
            this.c.s(consumer);
            this.d++;
        }
    }

    @Override // j$.util.stream.m3
    protected final Spliterator b(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new l3(spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.A.k(this, i);
    }

    @Override // j$.util.Spliterator
    public final boolean s(Consumer consumer) {
        long j;
        consumer.getClass();
        long j2 = this.e;
        long j3 = this.a;
        if (j3 >= j2) {
            return false;
        }
        while (true) {
            j = this.d;
            if (j3 <= j) {
                break;
            }
            this.c.s(new d0(10));
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return this.c.s(consumer);
    }
}
