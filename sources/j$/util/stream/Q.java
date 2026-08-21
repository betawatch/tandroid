package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class Q extends CountedCompleter {
    public Spliterator a;
    public final g2 b;
    public final a c;
    public long d;

    public Q(a aVar, Spliterator spliterator, g2 g2Var) {
        super(null);
        this.b = g2Var;
        this.c = aVar;
        this.a = spliterator;
        this.d = 0L;
    }

    public Q(Q q, Spliterator spliterator) {
        super(q);
        this.a = spliterator;
        this.b = q.b;
        this.d = q.d;
        this.c = q.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j = this.d;
        if (j == 0) {
            j = d.e(estimateSize);
            this.d = j;
        }
        boolean q = S2.SHORT_CIRCUIT.q(this.c.f);
        g2 g2Var = this.b;
        boolean z = false;
        Q q2 = this;
        while (true) {
            if (q && g2Var.C()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            Q q3 = new Q(q2, trySplit);
            q2.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                Q q4 = q2;
                q2 = q3;
                q3 = q4;
            }
            z = !z;
            q2.fork();
            q2 = q3;
            estimateSize = spliterator.estimateSize();
        }
        q2.c.z(spliterator, g2Var);
        q2.a = null;
        q2.propagateCompletion();
    }
}
