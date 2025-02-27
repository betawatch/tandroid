package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class T extends CountedCompleter {
    private Spliterator a;
    private final e2 b;
    private final b c;
    private long d;

    T(T t, Spliterator spliterator) {
        super(t);
        this.a = spliterator;
        this.b = t.b;
        this.d = t.d;
        this.c = t.c;
    }

    T(b bVar, Spliterator spliterator, e2 e2Var) {
        super(null);
        this.b = e2Var;
        this.c = bVar;
        this.a = spliterator;
        this.d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = e.f(estimateSize);
            this.d = j;
        }
        boolean d = R2.SHORT_CIRCUIT.d(this.c.r0());
        e2 e2Var = this.b;
        boolean z = false;
        T t = this;
        while (true) {
            if (d && e2Var.q()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            T t2 = new T(t, trySplit);
            t.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                T t3 = t;
                t = t2;
                t2 = t3;
            }
            z = !z;
            t.fork();
            t = t2;
            estimateSize = spliterator.estimateSize();
        }
        t.c.h0(spliterator, e2Var);
        t.a = null;
        t.propagateCompletion();
    }
}
