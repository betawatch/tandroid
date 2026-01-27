package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class A extends b implements D {
    @Override // j$.util.stream.D
    public final j$.util.B findAny() {
        return (j$.util.B) C(F.d);
    }

    @Override // j$.util.stream.D
    public final j$.util.B findFirst() {
        return (j$.util.B) C(F.c);
    }

    @Override // j$.util.stream.D
    public final D sorted() {
        return new E2(this, a3.q | a3.o, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.W Y(Spliterator spliterator) {
        if (spliterator instanceof j$.util.W) {
            return (j$.util.W) spliterator;
        }
        if (J3.a) {
            J3.a(b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.D
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new L(doubleConsumer, false));
    }

    @Override // j$.util.stream.D
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new L(doubleConsumer, true));
    }

    @Override // j$.util.stream.b
    final b3 H() {
        return b3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.b
    final I0 E(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return w0.F(bVar, spliterator, z);
    }

    @Override // j$.util.stream.b
    final Spliterator T(b bVar, Supplier supplier, boolean z) {
        return new l3(bVar, supplier, z);
    }

    @Override // j$.util.stream.b
    final boolean G(Spliterator spliterator, m2 m2Var) {
        DoubleConsumer pVar;
        boolean n;
        j$.util.W Y = Y(spliterator);
        if (m2Var instanceof DoubleConsumer) {
            pVar = (DoubleConsumer) m2Var;
        } else {
            if (J3.a) {
                J3.a(b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(m2Var);
            pVar = new p(m2Var);
        }
        do {
            n = m2Var.n();
            if (n) {
                break;
            }
        } while (Y.tryAdvance(pVar));
        return n;
    }

    @Override // j$.util.stream.b
    final A0 M(long j, IntFunction intFunction) {
        return w0.J(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.H iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.W spliterator() {
        return Y(super.spliterator());
    }

    @Override // j$.util.stream.D
    public final Stream boxed() {
        return new s(this, 0, new k(8), 0);
    }

    @Override // j$.util.stream.D
    public final D d() {
        Objects.requireNonNull(null);
        return new t(this, a3.p | a3.n, 0);
    }

    @Override // j$.util.stream.D
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new s(this, a3.p | a3.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.D
    public final IntStream t() {
        Objects.requireNonNull(null);
        return new u(this, a3.p | a3.n, 0);
    }

    @Override // j$.util.stream.D
    public final LongStream i() {
        Objects.requireNonNull(null);
        return new v(this, a3.p | a3.n, 0);
    }

    @Override // j$.util.stream.D
    public final D e(a aVar) {
        Objects.requireNonNull(aVar);
        return new x(this, a3.p | a3.n | a3.t, aVar, 0);
    }

    @Override // j$.util.stream.D
    public final D b() {
        Objects.requireNonNull(null);
        return new t(this, a3.t, 2);
    }

    @Override // j$.util.stream.D
    public final D peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new x(this, doubleConsumer);
    }

    @Override // j$.util.stream.D
    public final D limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return w0.W(this, 0L, j);
    }

    @Override // j$.util.stream.D
    public final D skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w0.W(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.D
    public final D a() {
        int i = i4.a;
        Objects.requireNonNull(null);
        return new W3(this, i4.a, 0);
    }

    @Override // j$.util.stream.D
    public final D c() {
        int i = i4.a;
        Objects.requireNonNull(null);
        return new Y3(this, i4.b, 0);
    }

    @Override // j$.util.stream.D
    public final D distinct() {
        return ((e2) boxed()).distinct().mapToDouble(new k(9));
    }

    @Override // j$.util.stream.D
    public final double sum() {
        double[] dArr = (double[]) collect(new k(12), new j(7), new j(4));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.D
    public final j$.util.B min() {
        return reduce(new k(4));
    }

    @Override // j$.util.stream.D
    public final j$.util.B max() {
        return reduce(new k(11));
    }

    @Override // j$.util.stream.D
    public final j$.util.B average() {
        double[] dArr = (double[]) collect(new k(5), new j(5), new j(6));
        if (dArr[2] <= 0.0d) {
            return j$.util.B.a();
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return j$.util.B.d(d / dArr[2]);
    }

    @Override // j$.util.stream.D
    public final j$.util.w summaryStatistics() {
        return (j$.util.w) collect(new j(20), new k(6), new k(7));
    }

    @Override // j$.util.stream.D
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        q qVar = new q(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(qVar);
        return C(new C1(b3.DOUBLE_VALUE, qVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.D
    public final boolean o() {
        return ((Boolean) C(w0.X(t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final boolean h() {
        return ((Boolean) C(w0.X(t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final boolean x() {
        return ((Boolean) C(w0.X(t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final double[] toArray() {
        return (double[]) w0.O((C0) D(new k(10))).d();
    }

    @Override // j$.util.stream.D
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) C(new G1(b3.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.D
    public final j$.util.B reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.B) C(new A1(b3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.D
    public final long count() {
        return ((Long) C(new E1(1))).longValue();
    }
}
