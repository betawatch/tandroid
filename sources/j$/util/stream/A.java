package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface A extends BaseStream {
    A a();

    j$.util.z average();

    A b();

    Stream boxed();

    A c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    A d(j$.time.t tVar);

    A distinct();

    A e();

    j$.util.z findAny();

    j$.util.z findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    LongStream i();

    @Override // j$.util.stream.BaseStream
    j$.util.F iterator();

    A limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.z max();

    j$.util.z min();

    boolean o();

    @Override // j$.util.stream.BaseStream
    A parallel();

    A peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.z reduce(DoubleBinaryOperator doubleBinaryOperator);

    IntStream s();

    @Override // j$.util.stream.BaseStream
    A sequential();

    A skip(long j);

    A sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.T spliterator();

    double sum();

    j$.util.u summaryStatistics();

    double[] toArray();

    boolean y();
}
