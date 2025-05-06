package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
abstract class r1 extends CountedCompleter implements e2 {
    protected final Spliterator a;
    protected final b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    r1(int i, Spliterator spliterator, b bVar) {
        this.a = spliterator;
        this.b = bVar;
        this.c = e.f(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    r1(r1 r1Var, Spliterator spliterator, long j, long j2, int i) {
        super(r1Var);
        this.a = spliterator;
        this.b = r1Var.b;
        this.c = r1Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    abstract r1 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        u0.b();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        u0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        u0.l();
        throw null;
    }

    @Override // j$.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        r1 r1Var = this;
        while (spliterator.estimateSize() > r1Var.c && (trySplit = spliterator.trySplit()) != null) {
            r1Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            r1Var.a(trySplit, r1Var.d, estimateSize).fork();
            r1Var = r1Var.a(spliterator, r1Var.d + estimateSize, r1Var.e - estimateSize);
        }
        r1Var.b.A0(spliterator, r1Var);
        r1Var.propagateCompletion();
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ void m() {
    }

    @Override // j$.util.stream.e2
    public final void n(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.e2
    public final /* synthetic */ boolean q() {
        return false;
    }
}
