package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public abstract class d8 {
    public final Spliterator a;
    public final boolean b;
    public final long c;
    public final AtomicLong d;

    public d8(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        this.b = j2 < 0;
        this.c = j2 >= 0 ? j2 : 0L;
        this.d = new AtomicLong(j2 >= 0 ? j + j2 : j);
    }

    public final long a(long j) {
        long j2;
        boolean z;
        long min;
        do {
            j2 = this.d.get();
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
        } while (!this.d.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.c;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    public Spliterator b(Spliterator spliterator) {
        return new z7((j$.util.a1) spliterator, this);
    }

    public final c8 c() {
        return this.d.get() > 0 ? c8.MAYBE_MORE : this.b ? c8.UNLIMITED : c8.NO_MORE;
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final Spliterator trySplit() {
        Spliterator trySplit;
        if (this.d.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return b(trySplit);
    }

    public d8(Spliterator spliterator, d8 d8Var) {
        this.a = spliterator;
        this.b = d8Var.b;
        this.d = d8Var.d;
        this.c = d8Var.c;
    }
}
