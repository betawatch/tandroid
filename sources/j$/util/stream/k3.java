package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.Comparator;

/* loaded from: classes2.dex */
final class k3 extends l3 implements Spliterator {
    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.j(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.util.A.k(this, i);
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
            this.c.s(new c0(11));
            this.d++;
        }
        while (this.d < this.e) {
            this.c.s(consumer);
            this.d++;
        }
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
            this.c.s(new c0(10));
            this.d++;
        }
        if (j >= this.e) {
            return false;
        }
        this.d = j + 1;
        return this.c.s(consumer);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    k3(Spliterator spliterator, long j, long j2) {
        super(spliterator, j, j2, 0L, Math.min(spliterator.estimateSize(), j2));
    }

    @Override // j$.util.stream.l3
    protected final Spliterator b(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new k3(spliterator, j, j2, j3, j4);
    }
}
