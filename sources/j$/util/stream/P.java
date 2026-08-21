package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class P extends CountedCompleter {
    public final a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final O e;
    public final P f;
    public C0 g;

    public P(a aVar, Spliterator spliterator, O o) {
        super(null);
        this.a = aVar;
        this.b = spliterator;
        this.c = d.e(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.e = o;
        this.f = null;
    }

    public P(P p, Spliterator spliterator, P p2) {
        super(p);
        this.a = p.a;
        this.b = spliterator;
        this.c = p.c;
        this.d = p.d;
        this.e = p.e;
        this.f = p2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        P p = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            P p2 = new P(p, trySplit, p.f);
            P p3 = new P(p, spliterator, p2);
            p.addToPendingCount(1);
            p3.addToPendingCount(1);
            p.d.put(p2, p3);
            if (p.f != null) {
                p2.addToPendingCount(1);
                if (p.d.replace(p.f, p, p2)) {
                    p.addToPendingCount(-1);
                } else {
                    p2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                p = p2;
                p2 = p3;
            } else {
                p = p3;
            }
            z = !z;
            p2.fork();
        }
        if (p.getPendingCount() > 0) {
            n nVar = new n(18);
            a aVar = p.a;
            u0 I = aVar.I(aVar.F(spliterator), nVar);
            p.a.Q(spliterator, I);
            p.g = I.a();
            p.b = null;
        }
        p.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        C0 c0 = this.g;
        if (c0 != null) {
            c0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.Q(spliterator, this.e);
                this.b = null;
            }
        }
        P p = (P) this.d.remove(this);
        if (p != null) {
            p.tryComplete();
        }
    }
}
