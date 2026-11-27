package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public final class u0 extends CountedCompleter {
    public Spliterator a;
    public final n5 b;
    public final a c;
    public long d;

    public u0(u0 u0Var, Spliterator spliterator) {
        super(u0Var);
        this.a = spliterator;
        this.b = u0Var.b;
        this.d = u0Var.d;
        this.c = u0Var.c;
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
        boolean n = b7.SHORT_CIRCUIT.n(this.c.f);
        n5 n5Var = this.b;
        boolean z = false;
        while (true) {
            if (n && n5Var.q()) {
                break;
            }
            if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            u0 u0Var = new u0(this, trySplit);
            this.addToPendingCount(1);
            if (z) {
                spliterator = trySplit;
            } else {
                u0Var = this;
                this = u0Var;
            }
            z = !z;
            this.fork();
            this = u0Var;
            estimateSize = spliterator.estimateSize();
        }
        this.c.z(spliterator, n5Var);
        this.a = null;
        this.propagateCompletion();
    }

    public u0(a aVar, Spliterator spliterator, n5 n5Var) {
        super(null);
        this.b = n5Var;
        this.c = aVar;
        this.a = spliterator;
        this.d = 0L;
    }
}
