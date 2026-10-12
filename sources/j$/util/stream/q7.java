package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class q7 {
    public final long a;
    public final long b;
    public Spliterator c;
    public long d;
    public long e;

    public abstract Spliterator a(Spliterator spliterator, long j10, long j11, long j12, long j13);

    public q7(Spliterator spliterator, long j10, long j11, long j12, long j13) {
        this.c = spliterator;
        this.a = j10;
        this.b = j11;
        this.d = j12;
        this.e = j13;
    }

    public final Spliterator trySplit() {
        long j10 = this.e;
        if (this.a >= j10 || this.d >= j10) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.d;
            long min = Math.min(estimateSize, this.b);
            long j11 = this.a;
            if (j11 >= min) {
                this.d = min;
            } else {
                long j12 = this.b;
                if (min >= j12) {
                    this.c = trySplit;
                    this.e = min;
                } else {
                    long j13 = this.d;
                    if (j13 >= j11 && estimateSize <= j12) {
                        this.d = min;
                        return trySplit;
                    }
                    this.d = min;
                    return a(trySplit, j11, j12, j13, min);
                }
            }
        }
    }

    public final long estimateSize() {
        long j10 = this.e;
        long j11 = this.a;
        if (j11 < j10) {
            return j10 - Math.max(j11, this.d);
        }
        return 0L;
    }

    public final int characteristics() {
        return this.c.characteristics();
    }

    public /* bridge */ /* synthetic */ j$.util.d1 trySplit() {
        return (j$.util.d1) trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.x0 trySplit() {
        return (j$.util.x0) trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.a1 trySplit() {
        return (j$.util.a1) trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.u0 trySplit() {
        return (j$.util.u0) trySplit();
    }
}
