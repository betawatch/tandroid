package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class r0 extends CountedCompleter {
    public Spliterator a;
    public final j5 b;
    public final t3 c;
    public long d;

    public r0(t3 t3Var, Spliterator spliterator, j5 j5Var) {
        super(null);
        this.b = j5Var;
        this.c = t3Var;
        this.a = spliterator;
        this.d = 0L;
    }

    public r0(r0 r0Var, Spliterator spliterator) {
        super(r0Var);
        this.a = spliterator;
        this.b = r0Var.b;
        this.d = r0Var.d;
        this.c = r0Var.c;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        long estimateSize = spliterator.estimateSize();
        long j10 = this.d;
        if (j10 == 0) {
            j10 = d.e(estimateSize);
            this.d = j10;
        }
        boolean m9 = v6.SHORT_CIRCUIT.m(((a) this.c).m);
        j5 j5Var = this.b;
        boolean z4 = false;
        r0 r0Var = this;
        while (true) {
            if (m9 && j5Var.q()) {
                break;
            }
            if (estimateSize <= j10 || (trySplit = spliterator.trySplit()) == null) {
                break;
            }
            r0 r0Var2 = new r0(r0Var, trySplit);
            r0Var.addToPendingCount(1);
            if (z4) {
                spliterator = trySplit;
            } else {
                r0 r0Var3 = r0Var;
                r0Var = r0Var2;
                r0Var2 = r0Var3;
            }
            z4 = !z4;
            r0Var.fork();
            r0Var = r0Var2;
            estimateSize = spliterator.estimateSize();
        }
        r0Var.c.f0(spliterator, j5Var);
        r0Var.a = null;
        r0Var.propagateCompletion();
    }
}
