package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public final class t0 extends CountedCompleter {
    public final a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final s0 e;
    public final t0 f;
    public h2 g;

    public t0(a aVar, Spliterator spliterator, s0 s0Var) {
        super(null);
        this.a = aVar;
        this.b = spliterator;
        this.c = d.e(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.e = s0Var;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            t0 t0Var = new t0(this, trySplit, this.f);
            t0 t0Var2 = new t0(this, spliterator, t0Var);
            this.addToPendingCount(1);
            t0Var2.addToPendingCount(1);
            this.d.put(t0Var, t0Var2);
            if (this.f != null) {
                t0Var.addToPendingCount(1);
                if (this.d.replace(this.f, this, t0Var)) {
                    this.addToPendingCount(-1);
                } else {
                    t0Var.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                this = t0Var;
                t0Var = t0Var2;
            } else {
                this = t0Var2;
            }
            z = !z;
            t0Var.fork();
        }
        if (this.getPendingCount() > 0) {
            q qVar = new q((byte) 18);
            a aVar = this.a;
            z1 I = aVar.I(aVar.F(spliterator), qVar);
            this.a.Q(spliterator, I);
            this.g = I.build();
            this.b = null;
        }
        this.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        h2 h2Var = this.g;
        if (h2Var != null) {
            h2Var.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.Q(spliterator, this.e);
                this.b = null;
            }
        }
        t0 t0Var = (t0) this.d.remove(this);
        if (t0Var != null) {
            t0Var.tryComplete();
        }
    }

    public t0(t0 t0Var, Spliterator spliterator, t0 t0Var2) {
        super(t0Var);
        this.a = t0Var.a;
        this.b = spliterator;
        this.c = t0Var.c;
        this.d = t0Var.d;
        this.e = t0Var.e;
        this.f = t0Var2;
    }
}
