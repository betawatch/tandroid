package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class n1 extends CountedCompleter implements g2 {
    public final Spliterator a;
    public final a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    @Override // j$.util.stream.g2
    public final /* synthetic */ boolean C() {
        return false;
    }

    public /* synthetic */ void accept(double d) {
        r1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        r1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        r1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public abstract n1 b(Spliterator spliterator, long j, long j2);

    @Override // j$.util.stream.g2
    public final /* synthetic */ void x() {
    }

    public n1(Spliterator spliterator, a aVar, int i) {
        this.a = spliterator;
        this.b = aVar;
        this.c = d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public n1(n1 n1Var, Spliterator spliterator, long j, long j2, int i) {
        super(n1Var);
        this.a = spliterator;
        this.b = n1Var.b;
        this.c = n1Var.c;
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
        n1 n1Var = this;
        while (spliterator.estimateSize() > n1Var.c && (trySplit = spliterator.trySplit()) != null) {
            n1Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            n1 n1Var2 = n1Var;
            n1Var2.b(trySplit, n1Var.d, estimateSize).fork();
            n1Var = n1Var2.b(spliterator, n1Var2.d + estimateSize, n1Var2.e - estimateSize);
        }
        n1 n1Var3 = n1Var;
        n1Var3.b.Q(spliterator, n1Var3);
        n1Var3.propagateCompletion();
    }

    @Override // j$.util.stream.g2
    public final void y(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }
}
