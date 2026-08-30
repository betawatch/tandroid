package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* loaded from: classes2.dex */
public abstract class d extends CountedCompleter {
    public static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    public final t3 a;
    public Spliterator b;
    public long c;
    public d d;
    public d e;
    public Object f;

    public abstract Object a();

    public abstract d c(Spliterator spliterator);

    public d(t3 t3Var, Spliterator spliterator) {
        super(null);
        this.a = t3Var;
        this.b = spliterator;
        this.c = 0L;
    }

    public d(d dVar, Spliterator spliterator) {
        super(dVar);
        this.b = spliterator;
        this.a = dVar.a;
        this.c = dVar.c;
    }

    public static long e(long j10) {
        long j11 = j10 / g;
        if (j11 > 0) {
            return j11;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public void d(Object obj) {
        this.f = obj;
    }

    public final boolean b() {
        return ((d) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j10 = this.c;
        if (j10 == 0) {
            j10 = e(estimateSize);
            this.c = j10;
        }
        boolean z4 = false;
        d dVar = this;
        while (estimateSize > j10 && (trySplit = spliterator.trySplit()) != null) {
            d c3 = dVar.c(trySplit);
            dVar.d = c3;
            d c10 = dVar.c(spliterator);
            dVar.e = c10;
            dVar.setPendingCount(1);
            if (z4) {
                spliterator = trySplit;
                dVar = c3;
                c3 = c10;
            } else {
                dVar = c10;
            }
            z4 = !z4;
            c3.fork();
            estimateSize = spliterator.estimateSize();
        }
        dVar.d(dVar.a());
        dVar.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
