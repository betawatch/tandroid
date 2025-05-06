package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
public interface E extends BaseStream {
    double D(double d, j$.util.function.i iVar);

    Stream G(j$.util.function.p pVar);

    E L(j$.util.function.v vVar);

    IntStream Q(j$.util.function.r rVar);

    E S(j$.util.function.q qVar);

    E a(j$.util.function.m mVar);

    boolean a0(j$.util.function.q qVar);

    j$.util.j average();

    Stream boxed();

    void c0(j$.util.function.m mVar);

    long count();

    boolean d0(j$.util.function.q qVar);

    E distinct();

    j$.util.j findAny();

    j$.util.j findFirst();

    void i(j$.util.function.m mVar);

    j$.util.p iterator();

    boolean j(j$.util.function.q qVar);

    E limit(long j);

    j$.util.j max();

    j$.util.j min();

    E parallel();

    E q(j$.util.function.p pVar);

    LongStream r(j$.util.function.u uVar);

    E sequential();

    E skip(long j);

    E sorted();

    j$.util.D spliterator();

    double sum();

    j$.util.f summaryStatistics();

    double[] toArray();

    j$.util.j x(j$.util.function.i iVar);

    Object z(Supplier supplier, j$.util.function.f0 f0Var, BiConsumer biConsumer);
}
