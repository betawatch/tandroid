package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public abstract class p3 extends CountedCompleter implements j5 {
    public final Spliterator a;
    public final t3 b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public abstract p3 a(Spliterator spliterator, long j10, long j11);

    public /* synthetic */ void accept(double d) {
        t3.C();
        throw null;
    }

    public /* synthetic */ void accept(int i10) {
        t3.J();
        throw null;
    }

    public /* synthetic */ void accept(long j10) {
        t3.K();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ void end() {
    }

    @Override // j$.util.stream.j5
    public final /* synthetic */ boolean q() {
        return false;
    }

    public p3(Spliterator spliterator, t3 t3Var, int i10) {
        this.a = spliterator;
        this.b = t3Var;
        this.c = d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i10;
    }

    public p3(p3 p3Var, Spliterator spliterator, long j10, long j11, int i10) {
        super(p3Var);
        this.a = spliterator;
        this.b = p3Var.b;
        this.c = p3Var.c;
        this.d = j10;
        this.e = j11;
        if (j10 < 0 || j11 < 0 || (j10 + j11) - 1 >= i10) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j10), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        p3 p3Var = this;
        while (spliterator.estimateSize() > p3Var.c && (trySplit = spliterator.trySplit()) != null) {
            p3Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            p3 p3Var2 = p3Var;
            p3Var2.a(trySplit, p3Var.d, estimateSize).fork();
            p3Var = p3Var2.a(spliterator, p3Var2.d + estimateSize, p3Var2.e - estimateSize);
        }
        p3 p3Var3 = p3Var;
        p3Var3.b.F0(spliterator, p3Var3);
        p3Var3.propagateCompletion();
    }

    @Override // j$.util.stream.j5
    public final void o(long j10) {
        long j11 = this.e;
        if (j10 > j11) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i10 = (int) this.d;
        this.f = i10;
        this.g = i10 + ((int) j11);
    }
}
