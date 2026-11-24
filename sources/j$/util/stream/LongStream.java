package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public interface LongStream extends BaseStream<Long, LongStream> {
    LongStream a();

    f0 asDoubleStream();

    j$.util.b0 average();

    LongStream b();

    Stream boxed();

    LongStream c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    LongStream d(j$.time.v vVar);

    LongStream distinct();

    LongStream e();

    j$.util.d0 findAny();

    j$.util.d0 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    f0 h();

    @Override // j$.util.stream.BaseStream
    j$.util.p0 iterator();

    boolean j();

    LongStream limit(long j);

    boolean m();

    <U> Stream<U> mapToObj(LongFunction<? extends U> longFunction);

    j$.util.d0 max();

    j$.util.d0 min();

    @Override // j$.util.stream.BaseStream
    LongStream parallel();

    LongStream peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.d0 reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.BaseStream
    LongStream sequential();

    LongStream skip(long j);

    LongStream sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.a1 spliterator();

    long sum();

    j$.util.z summaryStatistics();

    boolean t();

    long[] toArray();

    IntStream x();
}
