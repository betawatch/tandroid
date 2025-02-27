package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
public interface D extends BaseStream {
    Object A(Supplier supplier, j$.util.function.f0 f0Var, BiConsumer biConsumer);

    double E(double d, j$.util.function.i iVar);

    Stream H(j$.util.function.p pVar);

    D M(j$.util.function.v vVar);

    IntStream R(j$.util.function.r rVar);

    D T(j$.util.function.q qVar);

    j$.util.j average();

    D b(j$.util.function.m mVar);

    Stream boxed();

    boolean c0(j$.util.function.q qVar);

    long count();

    D distinct();

    void e0(j$.util.function.m mVar);

    boolean f0(j$.util.function.q qVar);

    j$.util.j findAny();

    j$.util.j findFirst();

    j$.util.p iterator();

    void j(j$.util.function.m mVar);

    boolean k(j$.util.function.q qVar);

    D limit(long j);

    j$.util.j max();

    j$.util.j min();

    @Override // j$.util.stream.BaseStream
    D parallel();

    D r(j$.util.function.p pVar);

    LongStream s(j$.util.function.u uVar);

    @Override // j$.util.stream.BaseStream
    D sequential();

    D skip(long j);

    D sorted();

    j$.util.D spliterator();

    double sum();

    j$.util.f summaryStatistics();

    double[] toArray();

    j$.util.j y(j$.util.function.i iVar);
}
