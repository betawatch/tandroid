package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
public interface D extends BaseStream {
    double D(double d, j$.util.function.i iVar);

    Stream G(j$.util.function.p pVar);

    D L(j$.util.function.v vVar);

    IntStream Q(j$.util.function.r rVar);

    D S(j$.util.function.q qVar);

    D a(j$.util.function.m mVar);

    j$.util.j average();

    boolean b0(j$.util.function.q qVar);

    Stream boxed();

    long count();

    void d0(j$.util.function.m mVar);

    D distinct();

    boolean e0(j$.util.function.q qVar);

    j$.util.j findAny();

    j$.util.j findFirst();

    void i(j$.util.function.m mVar);

    j$.util.p iterator();

    boolean j(j$.util.function.q qVar);

    D limit(long j);

    j$.util.j max();

    j$.util.j min();

    @Override // j$.util.stream.BaseStream
    D parallel();

    D q(j$.util.function.p pVar);

    LongStream r(j$.util.function.u uVar);

    @Override // j$.util.stream.BaseStream
    D sequential();

    D skip(long j);

    D sorted();

    j$.util.D spliterator();

    double sum();

    j$.util.f summaryStatistics();

    double[] toArray();

    j$.util.j x(j$.util.function.i iVar);

    Object z(Supplier supplier, j$.util.function.f0 f0Var, BiConsumer biConsumer);
}
