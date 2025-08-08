package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class S extends CountedCompleter {
    private Spliterator a;
    private final d2 b;
    private final b c;
    private long d;

    S(b bVar, Spliterator spliterator, d2 d2Var) {
        super(null);
        this.b = d2Var;
        this.c = bVar;
        this.a = spliterator;
        this.d = 0L;
    }

    S(S s, Spliterator spliterator) {
        super(s);
        this.a = spliterator;
        this.b = s.b;
        this.d = s.d;
        this.c = s.c;
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
        boolean i = Q2.SHORT_CIRCUIT.i(this.c.p0());
        d2 d2Var = this.b;
        boolean z = false;
        S s = this;
        while (true) {
            if (i && d2Var.q()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            S s2 = new S(s, trySplit);
            s.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                S s3 = s;
                s = s2;
                s2 = s3;
            }
            z = !z;
            s.fork();
            s = s2;
            estimateSize = spliterator.estimateSize();
        }
        s.c.f0(spliterator, d2Var);
        s.a = null;
        s.propagateCompletion();
    }
}
