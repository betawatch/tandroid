package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class m1 extends CountedCompleter implements f2 {
    public final Spliterator a;
    public final a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    @Override // j$.util.stream.f2
    public final /* synthetic */ boolean C() {
        return false;
    }

    public /* synthetic */ void accept(double d) {
        q1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        q1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        q1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    public abstract m1 b(Spliterator spliterator, long j, long j2);

    @Override // j$.util.stream.f2
    public final /* synthetic */ void x() {
    }

    public m1(Spliterator spliterator, a aVar, int i) {
        this.a = spliterator;
        this.b = aVar;
        this.c = d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    public m1(m1 m1Var, Spliterator spliterator, long j, long j2, int i) {
        super(m1Var);
        this.a = spliterator;
        this.b = m1Var.b;
        this.c = m1Var.c;
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
        m1 m1Var = this;
        while (spliterator.estimateSize() > m1Var.c && (trySplit = spliterator.trySplit()) != null) {
            m1Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            m1 m1Var2 = m1Var;
            m1Var2.b(trySplit, m1Var.d, estimateSize).fork();
            m1Var = m1Var2.b(spliterator, m1Var2.d + estimateSize, m1Var2.e - estimateSize);
        }
        m1 m1Var3 = m1Var;
        m1Var3.b.Q(spliterator, m1Var3);
        m1Var3.propagateCompletion();
    }

    @Override // j$.util.stream.f2
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
