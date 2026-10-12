package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface c0 extends BaseStream {
    boolean B();

    c0 a();

    j$.util.b0 average();

    c0 b();

    Stream boxed();

    c0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    c0 d(j$.time.t tVar);

    c0 distinct();

    c0 e();

    j$.util.b0 findAny();

    j$.util.b0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.BaseStream
    j$.util.h0 iterator();

    c0 limit(long j10);

    boolean m();

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.b0 max();

    j$.util.b0 min();

    @Override // j$.util.stream.BaseStream
    c0 parallel();

    c0 peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    boolean s();

    @Override // j$.util.stream.BaseStream
    c0 sequential();

    c0 skip(long j10);

    c0 sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.u0 spliterator();

    double sum();

    j$.util.w summaryStatistics();

    LongStream t();

    double[] toArray();

    IntStream z();
}
