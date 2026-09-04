package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
public abstract class q7 {
    public final long a;
    public final long b;
    public Spliterator c;
    public long d;
    public long e;

    public abstract Spliterator a(Spliterator spliterator, long j3, long j10, long j11, long j12);

    public q7(Spliterator spliterator, long j3, long j10, long j11, long j12) {
        this.c = spliterator;
        this.a = j3;
        this.b = j10;
        this.d = j11;
        this.e = j12;
    }

    public final Spliterator trySplit() {
        long j3 = this.e;
        if (this.a >= j3 || this.d >= j3) {
            return null;
        }
        while (true) {
            Spliterator trySplit = this.c.trySplit();
            if (trySplit == null) {
                return null;
            }
            long estimateSize = trySplit.estimateSize() + this.d;
            long min = Math.min(estimateSize, this.b);
            long j10 = this.a;
            if (j10 >= min) {
                this.d = min;
            } else {
                long j11 = this.b;
                if (min >= j11) {
                    this.c = trySplit;
                    this.e = min;
                } else {
                    long j12 = this.d;
                    if (j12 >= j10 && estimateSize <= j11) {
                        this.d = min;
                        return trySplit;
                    }
                    this.d = min;
                    return a(trySplit, j10, j11, j12, min);
                }
            }
        }
    }

    public final long estimateSize() {
        long j3 = this.e;
        long j10 = this.a;
        if (j10 < j3) {
            return j3 - Math.max(j10, this.d);
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
