package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
public final class O extends CountedCompleter {
    public final a a;
    public Spliterator b;
    public final long c;
    public final ConcurrentHashMap d;
    public final N e;
    public final O f;
    public B0 g;

    public O(a aVar, Spliterator spliterator, N n) {
        super(null);
        this.a = aVar;
        this.b = spliterator;
        this.c = d.e(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, d.g << 1));
        this.e = n;
        this.f = null;
    }

    public O(O o, Spliterator spliterator, O o2) {
        super(o);
        this.a = o.a;
        this.b = spliterator;
        this.c = o.c;
        this.d = o.d;
        this.e = o.e;
        this.f = o2;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        O o = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            O o2 = new O(o, trySplit, o.f);
            O o3 = new O(o, spliterator, o2);
            o.addToPendingCount(1);
            o3.addToPendingCount(1);
            o.d.put(o2, o3);
            if (o.f != null) {
                o2.addToPendingCount(1);
                if (o.d.replace(o.f, o, o2)) {
                    o.addToPendingCount(-1);
                } else {
                    o2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                o = o2;
                o2 = o3;
            } else {
                o = o3;
            }
            z = !z;
            o2.fork();
        }
        if (o.getPendingCount() > 0) {
            m mVar = new m(18);
            a aVar = o.a;
            t0 I = aVar.I(aVar.F(spliterator), mVar);
            o.a.Q(spliterator, I);
            o.g = I.a();
            o.b = null;
        }
        o.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        B0 b0 = this.g;
        if (b0 != null) {
            b0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.Q(spliterator, this.e);
                this.b = null;
            }
        }
        O o = (O) this.d.remove(this);
        if (o != null) {
            o.tryComplete();
        }
    }
}
