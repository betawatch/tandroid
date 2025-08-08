package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.LongFunction;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    boolean C(j$.util.function.b0 b0Var);

    boolean E(j$.util.function.b0 b0Var);

    LongStream K(j$.util.function.b0 b0Var);

    void T(j$.util.function.Y y);

    Object W(Supplier supplier, j$.util.function.t0 t0Var, BiConsumer biConsumer);

    D asDoubleStream();

    j$.util.j average();

    Stream boxed();

    void c(j$.util.function.Y y);

    long count();

    LongStream distinct();

    j$.util.l findAny();

    j$.util.l findFirst();

    j$.util.l g(j$.util.function.U u);

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    j$.util.x iterator();

    LongStream limit(long j);

    LongStream m(j$.util.function.Y y);

    <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction);

    j$.util.l max();

    j$.util.l min();

    LongStream n(LongFunction longFunction);

    D p(j$.util.function.d0 d0Var);

    @Override // j$.util.stream.BaseStream
    LongStream parallel();

    boolean s(j$.util.function.b0 b0Var);

    @Override // j$.util.stream.BaseStream
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    j$.util.J spliterator();

    long sum();

    j$.util.i summaryStatistics();

    LongStream t(j$.util.function.k0 k0Var);

    long[] toArray();

    long v(long j, j$.util.function.U u);

    IntStream y(j$.util.function.f0 f0Var);
}
