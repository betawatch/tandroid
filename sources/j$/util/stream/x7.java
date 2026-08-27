package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class x7 {
    public final Spliterator a;
    public final boolean b;
    public final int c;
    public final long d;
    public final AtomicLong e;

    public abstract Spliterator b(Spliterator spliterator);

    public x7(Spliterator spliterator, long j10, long j11) {
        this.a = spliterator;
        this.b = j11 < 0;
        this.d = j11 >= 0 ? j11 : 0L;
        this.c = 128;
        this.e = new AtomicLong(j11 >= 0 ? j10 + j11 : j10);
    }

    public x7(Spliterator spliterator, x7 x7Var) {
        this.a = spliterator;
        this.b = x7Var.b;
        this.e = x7Var.e;
        this.d = x7Var.d;
        this.c = x7Var.c;
    }

    public final long a(long j10) {
        long j11;
        boolean z10;
        long min;
        do {
            j11 = this.e.get();
            z10 = this.b;
            if (j11 != 0) {
                min = Math.min(j11, j10);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z10) {
                    return j10;
                }
                return 0L;
            }
        } while (!this.e.compareAndSet(j11, j11 - min));
        if (z10) {
            return Math.max(j10 - min, 0L);
        }
        long j12 = this.d;
        return j11 > j12 ? Math.max(min - (j11 - j12), 0L) : min;
    }

    public final w7 c() {
        if (this.e.get() > 0) {
            return w7.MAYBE_MORE;
        }
        return this.b ? w7.UNLIMITED : w7.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.e.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(trySplit);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
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
