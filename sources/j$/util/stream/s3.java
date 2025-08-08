package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
abstract class s3 {
    protected final Spliterator a;
    protected final boolean b;
    private final long c;
    private final AtomicLong d;

    protected abstract Spliterator u(Spliterator spliterator);

    s3(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.c = j2 >= 0 ? j2 : 0L;
        this.d = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    s3(Spliterator spliterator, s3 s3Var) {
        this.a = spliterator;
        this.b = s3Var.b;
        this.d = s3Var.d;
        this.c = s3Var.c;
    }

    protected final long t(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long min;
        do {
            atomicLong = this.d;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else {
                if (z) {
                    return j;
                }
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.c;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    protected final r3 v() {
        if (this.d.get() > 0) {
            return r3.MAYBE_MORE;
        }
        return this.b ? r3.UNLIMITED : r3.NO_MORE;
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.d.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return u(trySplit);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public /* bridge */ /* synthetic */ j$.util.M trySplit() {
        return (j$.util.M) trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.G trySplit() {
        return (j$.util.G) trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.J trySplit() {
        return (j$.util.J) trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.D trySplit() {
        return (j$.util.D) trySplit();
    }
}
