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
public abstract class z extends a implements c0 {
    @Override // j$.util.stream.c0
    public final j$.util.b0 findAny() {
        return (j$.util.b0) I0(e0.d);
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) I0(e0.c);
    }

    @Override // j$.util.stream.c0
    public final c0 sorted() {
        return new b6(this, v6.q | v6.o, 0);
    }

    public static j$.util.u0 U0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.u0) {
            return (j$.util.u0) spliterator;
        }
        if (d8.a) {
            d8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        I0(new l0(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        I0(new l0(doubleConsumer, true));
    }

    @Override // j$.util.stream.a
    public final w6 M0() {
        return w6.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.a
    public final e2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return t3.b0(aVar, spliterator, z10);
    }

    @Override // j$.util.stream.a
    public final Spliterator T0(a aVar, Supplier supplier, boolean z10) {
        return new g7(aVar, supplier, z10);
    }

    @Override // j$.util.stream.a
    public final boolean L0(Spliterator spliterator, j5 j5Var) {
        DoubleConsumer e0Var;
        boolean q10;
        j$.util.u0 U0 = U0(spliterator);
        if (j5Var instanceof DoubleConsumer) {
            e0Var = (DoubleConsumer) j5Var;
        } else {
            if (d8.a) {
                d8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(j5Var);
            e0Var = new j$.util.e0(j5Var, 1);
        }
        do {
            q10 = j5Var.q();
            if (q10) {
                break;
            }
        } while (U0.tryAdvance(e0Var));
        return q10;
    }

    @Override // j$.util.stream.t3
    public final w1 A0(long j10, IntFunction intFunction) {
        return t3.h0(j10);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.h0 iterator() {
        j$.util.u0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.i1(spliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.u0 spliterator() {
        return U0(super.spliterator());
    }

    @Override // j$.util.stream.c0
    public final Stream boxed() {
        return new q(this, 0, new n(4), 0);
    }

    @Override // j$.util.stream.c0
    public final c0 e() {
        Objects.requireNonNull(null);
        return new r(this, v6.p | v6.n, 0);
    }

    @Override // j$.util.stream.c0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new q(this, v6.p | v6.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.c0
    public final IntStream z() {
        Objects.requireNonNull(null);
        return new s(this, v6.p | v6.n, 0);
    }

    @Override // j$.util.stream.c0
    public final LongStream t() {
        Objects.requireNonNull(null);
        return new t(this, v6.p | v6.n, 0);
    }

    @Override // j$.util.stream.c0
    public final c0 d(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new v(this, v6.p | v6.n | v6.t, tVar, 0);
    }

    @Override // j$.util.stream.c0
    public final c0 b() {
        Objects.requireNonNull(null);
        return new r(this, v6.t, 2);
    }

    @Override // j$.util.stream.c0
    public final c0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new v(this, doubleConsumer);
    }

    @Override // j$.util.stream.c0
    public final c0 limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return t3.v0(this, 0L, j10);
    }

    @Override // j$.util.stream.c0
    public final c0 skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : t3.v0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.c0
    public final c0 a() {
        int i9 = w8.a;
        Objects.requireNonNull(null);
        return new b6(this, w8.a, 1);
    }

    @Override // j$.util.stream.c0
    public final c0 c() {
        int i9 = w8.a;
        Objects.requireNonNull(null);
        return new b6(this, w8.b, 2);
    }

    @Override // j$.util.stream.c0
    public final c0 distinct() {
        return ((b5) boxed()).distinct().mapToDouble(new n(5));
    }

    @Override // j$.util.stream.c0
    public final double sum() {
        double[] dArr = (double[]) collect(new n(8), new n(9), new j$.time.format.a(27));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d9)) ? d9 : d;
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 min() {
        return reduce(new j$.time.format.a(28));
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 max() {
        return reduce(new n(7));
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 average() {
        double[] dArr = (double[]) collect(new j$.time.format.a(29), new n(0), new n(1));
        if (dArr[2] <= 0.0d) {
            return j$.util.b0.c;
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d9 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d9)) {
            d = d9;
        }
        return new j$.util.b0(d / dArr[2]);
    }

    @Override // j$.util.stream.c0
    public final j$.util.w summaryStatistics() {
        return (j$.util.w) collect(new j$.time.format.a(9), new n(2), new n(3));
    }

    @Override // j$.util.stream.c0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(oVar);
        return I0(new y3(w6.DOUBLE_VALUE, oVar, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.c0
    public final boolean m() {
        return ((Boolean) I0(t3.u0(r1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.c0
    public final boolean s() {
        return ((Boolean) I0(t3.u0(r1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.c0
    public final boolean B() {
        return ((Boolean) I0(t3.u0(r1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.c0
    public final double[] toArray() {
        return (double[]) t3.n0((y1) J0(new n(6))).b();
    }

    @Override // j$.util.stream.c0
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) I0(new c4(w6.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.c0
    public final j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.b0) I0(new w3(w6.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.c0
    public final long count() {
        return ((Long) I0(new a4(1))).longValue();
    }
}
