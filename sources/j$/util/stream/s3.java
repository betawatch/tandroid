package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$-CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public abstract class s3 extends CountedCompleter implements n5 {
    public final Spliterator a;
    public final a b;
    public final long c;
    public final long d;
    public final long e;
    public int f;
    public int g;

    public s3(s3 s3Var, Spliterator spliterator, long j, long j2, int i) {
        super(s3Var);
        this.a = spliterator;
        this.b = s3Var.b;
        this.c = s3Var.c;
        this.d = j;
        this.e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    public abstract s3 a(Spliterator spliterator, long j, long j2);

    public /* synthetic */ void accept(double d) {
        w3.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$-CC.$default$andThen(this, consumer);
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.a;
        s3 s3Var = this;
        while (spliterator.estimateSize() > s3Var.c && (trySplit = spliterator.trySplit()) != null) {
            s3Var.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            s3Var.a(trySplit, s3Var.d, estimateSize).fork();
            s3Var = s3Var.a(spliterator, s3Var.d + estimateSize, s3Var.e - estimateSize);
        }
        s3Var.b.Q(spliterator, s3Var);
        s3Var.propagateCompletion();
    }

    @Override // j$.util.stream.n5
    public final void n(long j) {
        long j2 = this.e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.d;
        this.f = i;
        this.g = i + ((int) j2);
    }

    @Override // j$.util.stream.n5
    public final boolean q() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        w3.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        w3.l();
        throw null;
    }

    public s3(Spliterator spliterator, a aVar, int i) {
        this.a = spliterator;
        this.b = aVar;
        this.c = d.e(spliterator.estimateSize());
        this.d = 0L;
        this.e = i;
    }

    @Override // j$.util.stream.n5
    public final void end() {
    }
}
