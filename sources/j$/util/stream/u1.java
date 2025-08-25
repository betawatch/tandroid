package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
abstract class u1 extends CountedCompleter implements m2 {
    protected final Spliterator a;
    protected final b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    public /* synthetic */ void accept(double d) {
        w0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        w0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    abstract u1 b(Spliterator spliterator, long j, long j2);

    @Override // j$.util.stream.m2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.m2
    public final /* synthetic */ boolean n() {
        return false;
    }

    u1(Spliterator spliterator, b bVar, int i) {
        this.a = spliterator;
        this.b = bVar;
        this.c = e.g(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    u1(u1 u1Var, Spliterator spliterator, long j, long j2, int i) {
        super(u1Var);
        this.a = spliterator;
        this.b = u1Var.b;
        this.c = u1Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        u1 u1Var = this;
        while (spliterator.estimateSize() > u1Var.c && (trySplit = spliterator.trySplit()) != null) {
            u1Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            u1Var.b(trySplit, u1Var.d, estimateSize).fork();
            u1Var = u1Var.b(spliterator, u1Var.d + estimateSize, u1Var.e - estimateSize);
        }
        u1Var.b.U(spliterator, u1Var);
        u1Var.propagateCompletion();
    }

    @Override // j$.util.stream.m2
    public final void l(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }
}
