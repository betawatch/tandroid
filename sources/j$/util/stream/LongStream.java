package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.LongFunction;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    boolean D(j$.util.function.W w);

    boolean F(j$.util.function.W w);

    LongStream L(j$.util.function.W w);

    void U(j$.util.function.T t);

    Object Y(Supplier supplier, j$.util.function.l0 l0Var, BiConsumer biConsumer);

    D asDoubleStream();

    j$.util.j average();

    Stream boxed();

    long count();

    void d(j$.util.function.T t);

    LongStream distinct();

    j$.util.l findAny();

    j$.util.l findFirst();

    j$.util.l h(j$.util.function.O o);

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    j$.util.x iterator();

    LongStream limit(long j);

    <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction);

    j$.util.l max();

    j$.util.l min();

    LongStream n(j$.util.function.T t);

    LongStream o(LongFunction longFunction);

    @Override // j$.util.stream.BaseStream
    LongStream parallel();

    D q(j$.util.function.X x);

    @Override // j$.util.stream.BaseStream
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    j$.util.J spliterator();

    long sum();

    j$.util.i summaryStatistics();

    boolean t(j$.util.function.W w);

    long[] toArray();

    LongStream u(j$.util.function.c0 c0Var);

    long w(long j, j$.util.function.O o);

    IntStream z(j$.util.function.Y y);
}
