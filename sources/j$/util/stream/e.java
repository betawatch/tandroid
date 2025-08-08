package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;

/* loaded from: classes2.dex */
abstract class e extends CountedCompleter {
    static final int g = ForkJoinPool.getCommonPoolParallelism() << 2;
    protected final b a;
    protected Spliterator b;
    protected long c;
    protected e d;
    protected e e;
    private Object f;

    protected abstract Object a();

    protected abstract e d(Spliterator spliterator);

    protected e(b bVar, Spliterator spliterator) {
        super(null);
        this.a = bVar;
        this.b = spliterator;
        this.c = 0L;
    }

    protected e(e eVar, Spliterator spliterator) {
        super(eVar);
        this.b = spliterator;
        this.a = eVar.a;
        this.c = eVar.c;
    }

    public static long f(long j) {
        long j2 = j / g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    protected Object b() {
        return this.f;
    }

    protected void e(Object obj) {
        this.f = obj;
    }

    protected final boolean c() {
        return ((e) getCompleter()) == null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.b;
        long estimateSize = spliterator.estimateSize();
        long j = this.c;
        if (j == 0) {
            j = f(estimateSize);
            this.c = j;
        }
        boolean z = false;
        e eVar = this;
        while (estimateSize > j && (trySplit = spliterator.trySplit()) != null) {
            e d = eVar.d(trySplit);
            eVar.d = d;
            e d2 = eVar.d(spliterator);
            eVar.e = d2;
            eVar.setPendingCount(1);
            if (z) {
                spliterator = trySplit;
                eVar = d;
                d = d2;
            } else {
                eVar = d2;
            }
            z = !z;
            d.fork();
            estimateSize = spliterator.estimateSize();
        }
        eVar.e(eVar.a());
        eVar.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.b = null;
        this.e = null;
        this.d = null;
    }
}
