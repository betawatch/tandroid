package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    IntStream A();

    LongStream a();

    c0 asDoubleStream();

    j$.util.b0 average();

    LongStream b();

    Stream boxed();

    LongStream c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d(j$.time.t tVar);

    LongStream distinct();

    LongStream e();

    j$.util.d0 findAny();

    j$.util.d0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.BaseStream
    j$.util.p0 iterator();

    c0 j();

    boolean l();

    LongStream limit(long j3);

    <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction);

    j$.util.d0 max();

    j$.util.d0 min();

    boolean o();

    @Override // j$.util.stream.BaseStream
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    long reduce(long j3, LongBinaryOperator longBinaryOperator);

    j$.util.d0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.BaseStream
    LongStream sequential();

    LongStream skip(long j3);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.a1 spliterator();

    long sum();

    j$.util.z summaryStatistics();

    long[] toArray();

    boolean w();
}
