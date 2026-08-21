package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class y extends a implements B {
    @Override // j$.util.stream.B
    public final j$.util.z findAny() {
        return (j$.util.z) C(D.d);
    }

    @Override // j$.util.stream.B
    public final j$.util.z findFirst() {
        return (j$.util.z) C(D.c);
    }

    @Override // j$.util.stream.B
    public final B sorted() {
        return new y2(this, S2.q | S2.o, 0);
    }

    public static j$.util.T T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.T) {
            return (j$.util.T) spliterator;
        }
        if (A3.a) {
            A3.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new K(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new K(doubleConsumer, true));
    }

    @Override // j$.util.stream.a
    public final T2 H() {
        return T2.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final C0 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return r1.C(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new d3(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, g2 g2Var) {
        DoubleConsumer c;
        boolean C;
        j$.util.T T = T(spliterator);
        if (g2Var instanceof DoubleConsumer) {
            c = (DoubleConsumer) g2Var;
        } else {
            if (A3.a) {
                A3.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(g2Var);
            c = new j$.util.C(g2Var, 1);
        }
        do {
            C = g2Var.C();
            if (C) {
                break;
            }
        } while (T.tryAdvance(c));
        return C;
    }

    @Override // j$.util.stream.a
    public final u0 I(long j, IntFunction intFunction) {
        return r1.G(j);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.F iterator() {
        j$.util.T spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h0(spliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.T spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.B
    public final Stream boxed() {
        return new q(this, 0, new n(4), 0);
    }

    @Override // j$.util.stream.B
    public final B e() {
        Objects.requireNonNull(null);
        return new r(this, S2.p | S2.n, 0);
    }

    @Override // j$.util.stream.B
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new q(this, S2.p | S2.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.B
    public final IntStream s() {
        Objects.requireNonNull(null);
        return new s(this, S2.p | S2.n, 0);
    }

    @Override // j$.util.stream.B
    public final LongStream i() {
        Objects.requireNonNull(null);
        return new t(this, S2.p | S2.n, 0);
    }

    @Override // j$.util.stream.B
    public final B d(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new v(this, S2.p | S2.n | S2.t, tVar, 0);
    }

    @Override // j$.util.stream.B
    public final B b() {
        Objects.requireNonNull(null);
        return new r(this, S2.t, 2);
    }

    @Override // j$.util.stream.B
    public final B peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new v(this, doubleConsumer);
    }

    @Override // j$.util.stream.B
    public final B limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return r1.S(this, 0L, j);
    }

    @Override // j$.util.stream.B
    public final B skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : r1.S(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.B
    public final B a() {
        int i = X3.a;
        Objects.requireNonNull(null);
        return new y2(this, X3.a, 1);
    }

    @Override // j$.util.stream.B
    public final B c() {
        int i = X3.a;
        Objects.requireNonNull(null);
        return new N3(this, X3.b, 0);
    }

    @Override // j$.util.stream.B
    public final B distinct() {
        return ((Y1) boxed()).distinct().mapToDouble(new n(5));
    }

    @Override // j$.util.stream.B
    public final double sum() {
        double[] dArr = (double[]) collect(new n(8), new n(9), new j$.time.format.a(27));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.B
    public final j$.util.z min() {
        return reduce(new j$.time.format.a(28));
    }

    @Override // j$.util.stream.B
    public final j$.util.z max() {
        return reduce(new n(7));
    }

    @Override // j$.util.stream.B
    public final j$.util.z average() {
        double[] dArr = (double[]) collect(new j$.time.format.a(29), new n(0), new n(1));
        if (dArr[2] <= 0.0d) {
            return j$.util.z.c;
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.z(d / dArr[2]);
    }

    @Override // j$.util.stream.B
    public final j$.util.u summaryStatistics() {
        return (j$.util.u) collect(new j$.time.format.a(9), new n(2), new n(3));
    }

    @Override // j$.util.stream.B
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(oVar);
        return C(new w1(T2.DOUBLE_VALUE, oVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.B
    public final boolean o() {
        return ((Boolean) C(r1.R(p0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.B
    public final boolean h() {
        return ((Boolean) C(r1.R(p0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.B
    public final boolean y() {
        return ((Boolean) C(r1.R(p0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.B
    public final double[] toArray() {
        return (double[]) r1.K((w0) D(new n(6))).d();
    }

    @Override // j$.util.stream.B
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) C(new A1(T2.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.B
    public final j$.util.z reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.z) C(new u1(T2.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.B
    public final long count() {
        return ((Long) C(new y1(1))).longValue();
    }
}
