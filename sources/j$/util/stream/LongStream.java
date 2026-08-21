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

    B asDoubleStream();

    j$.util.z average();

    LongStream b();

    Stream boxed();

    LongStream c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d(j$.time.t tVar);

    LongStream distinct();

    LongStream e();

    j$.util.B findAny();

    j$.util.B findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.BaseStream
    j$.util.N iterator();

    B k();

    LongStream limit(long j);

    boolean m();

    <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction);

    j$.util.B max();

    j$.util.B min();

    boolean p();

    @Override // j$.util.stream.BaseStream
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.B reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.BaseStream
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.Z spliterator();

    long sum();

    j$.util.x summaryStatistics();

    long[] toArray();

    boolean u();

    IntStream w();
}
