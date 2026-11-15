package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class q0 extends CountedCompleter {
    public final t3 a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final p0 e;
    public final q0 f;
    public e2 g;

    public q0(t3 t3Var, Spliterator spliterator, p0 p0Var) {
        super(null);
        this.a = t3Var;
        this.b = spliterator;
        this.c = d.e(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.e = p0Var;
        this.f = null;
    }

    public q0(q0 q0Var, Spliterator spliterator, q0 q0Var2) {
        super(q0Var);
        this.a = q0Var.a;
        this.b = spliterator;
        this.c = q0Var.c;
        this.d = q0Var.d;
        this.e = q0Var.e;
        this.f = q0Var2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j3 = this.c;
        boolean z10 = false;
        q0 q0Var = this;
        while (spliterator.estimateSize() > j3 && (trySplit = spliterator.trySplit()) != null) {
            q0 q0Var2 = new q0(q0Var, trySplit, q0Var.f);
            q0 q0Var3 = new q0(q0Var, spliterator, q0Var2);
            q0Var.addToPendingCount(1);
            q0Var3.addToPendingCount(1);
            q0Var.d.put(q0Var2, q0Var3);
            if (q0Var.f != null) {
                q0Var2.addToPendingCount(1);
                if (q0Var.d.replace(q0Var.f, q0Var, q0Var2)) {
                    q0Var.addToPendingCount(-1);
                } else {
                    q0Var2.addToPendingCount(-1);
                }
            }
            if (z10) {
                spliterator = trySplit;
                q0Var = q0Var2;
                q0Var2 = q0Var3;
            } else {
                q0Var = q0Var3;
            }
            z10 = !z10;
            q0Var2.fork();
        }
        if (q0Var.getPendingCount() > 0) {
            n nVar = new n(18);
            t3 t3Var = q0Var.a;
            w1 A0 = t3Var.A0(t3Var.k0(spliterator), nVar);
            q0Var.a.F0(spliterator, A0);
            q0Var.g = A0.build();
            q0Var.b = null;
        }
        q0Var.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        e2 e2Var = this.g;
        if (e2Var != null) {
            e2Var.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.F0(spliterator, this.e);
                this.b = null;
            }
        }
        q0 q0Var = (q0) this.d.remove(this);
        if (q0Var != null) {
            q0Var.tryComplete();
        }
    }
}
