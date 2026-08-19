package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class P extends CountedCompleter {
    public Spliterator a;
    public final f2 b;
    public final a c;
    public long d;

    public P(a aVar, Spliterator spliterator, f2 f2Var) {
        super(null);
        this.b = f2Var;
        this.c = aVar;
        this.a = spliterator;
        this.d = 0L;
    }

    public P(P p, Spliterator spliterator) {
        super(p);
        this.a = spliterator;
        this.b = p.b;
        this.d = p.d;
        this.c = p.c;
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
        f2 f2Var = this.b;
        boolean z = false;
        P p = this;
        while (true) {
            if (q && f2Var.C()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            P p2 = new P(p, trySplit);
            p.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                P p3 = p;
                p = p2;
                p2 = p3;
            }
            z = !z;
            p.fork();
            p = p2;
            estimateSize = spliterator.estimateSize();
        }
        p.c.z(spliterator, f2Var);
        p.a = null;
        p.propagateCompletion();
    }
}
