package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface B extends BaseStream {
    B a();

    j$.util.z average();

    B b();

    Stream boxed();

    B c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    B d(j$.time.t tVar);

    B distinct();

    B e();

    j$.util.z findAny();

    j$.util.z findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    LongStream i();

    @Override // j$.util.stream.BaseStream
    j$.util.F iterator();

    B limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.z max();

    j$.util.z min();

    boolean o();

    @Override // j$.util.stream.BaseStream
    B parallel();

    B peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.z reduce(DoubleBinaryOperator doubleBinaryOperator);

    IntStream s();

    @Override // j$.util.stream.BaseStream
    B sequential();

    B skip(long j);

    B sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.T spliterator();

    double sum();

    j$.util.u summaryStatistics();

    double[] toArray();

    boolean y();
}
