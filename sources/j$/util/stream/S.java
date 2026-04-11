package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class S extends CountedCompleter {
    private Spliterator a;
    private final m2 b;
    private final b c;
    private long d;

    S(b bVar, Spliterator spliterator, m2 m2Var) {
        super(null);
        this.b = m2Var;
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
            j = e.g(estimateSize);
            this.d = j;
        }
        boolean o = a3.SHORT_CIRCUIT.o(this.c.J());
        m2 m2Var = this.b;
        boolean z = false;
        S s = this;
        while (true) {
            if (o && m2Var.n()) {
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
        s.c.z(spliterator, m2Var);
        s.a = null;
        s.propagateCompletion();
    }
}
