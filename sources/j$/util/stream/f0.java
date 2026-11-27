package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public interface f0 extends BaseStream {
    f0 a();

    j$.util.b0 average();

    f0 b();

    Stream boxed();

    f0 c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    f0 d(j$.time.v vVar);

    f0 distinct();

    f0 e();

    j$.util.b0 findAny();

    j$.util.b0 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    @Override // j$.util.stream.BaseStream
    j$.util.h0 iterator();

    boolean k();

    f0 limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    j$.util.b0 max();

    j$.util.b0 min();

    @Override // j$.util.stream.BaseStream
    f0 parallel();

    f0 peek(DoubleConsumer doubleConsumer);

    boolean q();

    LongStream r();

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.BaseStream
    f0 sequential();

    f0 skip(long j);

    f0 sorted();

    @Override // j$.util.stream.BaseStream
    j$.util.u0 spliterator();

    double sum();

    j$.util.w summaryStatistics();

    double[] toArray();

    IntStream w();

    boolean y();
}
