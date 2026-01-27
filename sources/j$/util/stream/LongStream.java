package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    LongStream a();

    D asDoubleStream();

    j$.util.B average();

    LongStream b();

    Stream boxed();

    LongStream c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d();

    LongStream distinct();

    LongStream e(a aVar);

    j$.util.D findAny();

    j$.util.D findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    j$.util.P iterator();

    D k();

    LongStream limit(long j);

    boolean m();

    <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction);

    j$.util.D max();

    j$.util.D min();

    @Override // j$.util.stream.BaseStream
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    boolean q();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.D reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.BaseStream
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    j$.util.c0 spliterator();

    long sum();

    j$.util.z summaryStatistics();

    long[] toArray();

    boolean v();

    IntStream w();
}
