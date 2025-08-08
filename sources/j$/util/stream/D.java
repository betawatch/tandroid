package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
public interface D extends BaseStream {
    double D(double d, j$.util.function.h hVar);

    Stream G(j$.util.function.o oVar);

    D L(j$.util.function.w wVar);

    IntStream Q(j$.util.function.r rVar);

    D S(j$.util.function.p pVar);

    D a(j$.util.function.l lVar);

    boolean a0(j$.util.function.p pVar);

    j$.util.j average();

    Stream boxed();

    void c0(j$.util.function.l lVar);

    long count();

    boolean d0(j$.util.function.p pVar);

    D distinct();

    j$.util.j findAny();

    j$.util.j findFirst();

    void i(j$.util.function.l lVar);

    j$.util.p iterator();

    boolean j(j$.util.function.p pVar);

    D limit(long j);

    j$.util.j max();

    j$.util.j min();

    @Override // j$.util.stream.BaseStream
    D parallel();

    D q(j$.util.function.o oVar);

    LongStream r(j$.util.function.v vVar);

    @Override // j$.util.stream.BaseStream
    D sequential();

    D skip(long j);

    D sorted();

    j$.util.D spliterator();

    double sum();

    j$.util.f summaryStatistics();

    double[] toArray();

    j$.util.j x(j$.util.function.h hVar);

    Object z(Supplier supplier, j$.util.function.n0 n0Var, BiConsumer biConsumer);
}
