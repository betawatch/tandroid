package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public interface D extends BaseStream {
    D a();

    j$.util.A average();

    D b();

    Stream boxed();

    D c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    D d();

    D distinct();

    D e(a aVar);

    j$.util.A findAny();

    j$.util.A findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    LongStream i();

    j$.util.G iterator();

    D limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.A max();

    j$.util.A min();

    boolean o();

    @Override // j$.util.stream.BaseStream
    D parallel();

    D peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.A reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.BaseStream
    D sequential();

    D skip(long j);

    D sorted();

    j$.util.V spliterator();

    double sum();

    j$.util.w summaryStatistics();

    IntStream t();

    double[] toArray();

    boolean x();
}
