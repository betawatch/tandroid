package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class S extends CountedCompleter {
    private final b a;
    private Spliterator b;
    private final long c;
    private final ConcurrentHashMap d;
    private final e2 e;
    private final S f;
    private F0 g;

    S(S s, Spliterator spliterator, S s2) {
        super(s);
        this.a = s.a;
        this.b = spliterator;
        this.c = s.c;
        this.d = s.d;
        this.e = s.e;
        this.f = s2;
    }

    protected S(b bVar, Spliterator spliterator, e2 e2Var) {
        super(null);
        this.a = bVar;
        this.b = spliterator;
        this.c = e.f(spliterator.estimateSize());
        this.d = new ConcurrentHashMap(Math.max(16, e.g << 1));
        this.e = e2Var;
        this.f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long j = this.c;
        boolean z = false;
        S s = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            S s2 = new S(s, trySplit, s.f);
            S s3 = new S(s, spliterator, s2);
            s.addToPendingCount(1);
            s3.addToPendingCount(1);
            s.d.put(s2, s3);
            if (s.f != null) {
                s2.addToPendingCount(1);
                if (s.d.replace(s.f, s, s2)) {
                    s.addToPendingCount(-1);
                } else {
                    s2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                s = s2;
                s2 = s3;
            } else {
                s = s3;
            }
            z = !z;
            s2.fork();
        }
        if (s.getPendingCount() > 0) {
            E e = new E(4);
            b bVar = s.a;
            x0 t0 = bVar.t0(bVar.m0(spliterator), e);
            s.a.B0(spliterator, t0);
            s.g = t0.b();
            s.b = null;
        }
        s.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        F0 f0 = this.g;
        if (f0 != null) {
            f0.forEach(this.e);
            this.g = null;
        } else {
            Spliterator spliterator = this.b;
            if (spliterator != null) {
                this.a.B0(spliterator, this.e);
                this.b = null;
            }
        }
        S s = (S) this.d.remove(this);
        if (s != null) {
            s.tryComplete();
        }
    }
}
