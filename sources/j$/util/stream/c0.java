package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public abstract class c0 extends a implements f0 {
    public static j$.util.u0 T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.u0) {
            return (j$.util.u0) spliterator;
        }
        if (!j8.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        j8.a(a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, n5 n5Var) {
        DoubleConsumer e0Var;
        boolean q;
        j$.util.u0 T = T(spliterator);
        if (n5Var instanceof DoubleConsumer) {
            e0Var = (DoubleConsumer) n5Var;
        } else {
            if (j8.a) {
                j8.a(a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            e0Var = new j$.util.e0(n5Var, (byte) 1);
        }
        do {
            q = n5Var.q();
            if (q) {
                break;
            }
        } while (T.tryAdvance(e0Var));
        return q;
    }

    @Override // j$.util.stream.f0
    public final f0 a() {
        int i = z8.a;
        Objects.requireNonNull(null);
        return new f6(this, z8.a, (byte) 1);
    }

    @Override // j$.util.stream.f0
    public final j$.util.b0 average() {
        double[] dArr = (double[]) collect(new q((byte) 6), new q((byte) 7), new q((byte) 8));
        if (dArr[2] <= 0.0d) {
            return j$.util.b0.c;
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new j$.util.b0(d / dArr[2]);
    }

    @Override // j$.util.stream.f0
    public final f0 b() {
        Objects.requireNonNull(null);
        return new u(this, b7.t, (byte) 2);
    }

    @Override // j$.util.stream.f0
    public final Stream boxed() {
        return new s(this, 0, new j$.time.format.a((byte) 28), (byte) 0);
    }

    @Override // j$.util.stream.f0
    public final f0 c() {
        int i = z8.a;
        Objects.requireNonNull(null);
        return new f6(this, z8.b, (byte) 2);
    }

    @Override // j$.util.stream.f0
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, (byte) 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(rVar);
        return C(new b4(c7.DOUBLE_VALUE, rVar, objDoubleConsumer, supplier, (byte) 1));
    }

    @Override // j$.util.stream.f0
    public final long count() {
        return ((Long) C(new d4((byte) 1))).longValue();
    }

    @Override // j$.util.stream.f0
    public final f0 d(j$.time.v vVar) {
        Objects.requireNonNull(vVar);
        return new y(this, b7.p | b7.n | b7.t, vVar, (byte) 0);
    }

    @Override // j$.util.stream.f0
    public final f0 distinct() {
        return ((f5) boxed()).distinct().mapToDouble(new j$.time.format.a((byte) 29));
    }

    @Override // j$.util.stream.f0
    public final f0 e() {
        Objects.requireNonNull(null);
        return new u(this, b7.p | b7.n, (byte) 0);
    }

    @Override // j$.util.stream.f0
    public final j$.util.b0 findAny() {
        return (j$.util.b0) C(h0.d);
    }

    @Override // j$.util.stream.f0
    public final j$.util.b0 findFirst() {
        return (j$.util.b0) C(h0.c);
    }

    @Override // j$.util.stream.f0
    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new o0(doubleConsumer, false));
    }

    @Override // j$.util.stream.f0
    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new o0(doubleConsumer, true));
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.h0 iterator() {
        j$.util.u0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.i1(spliterator);
    }

    @Override // j$.util.stream.f0
    public final boolean k() {
        return ((Boolean) C(w3.Q(u1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.f0
    public final f0 limit(long j) {
        if (j >= 0) {
            return w3.R(this, 0L, j);
        }
        j$.time.g.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.f0
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new s(this, b7.p | b7.n, doubleFunction, (byte) 0);
    }

    @Override // j$.util.stream.f0
    public final j$.util.b0 max() {
        return reduce(new q((byte) 1));
    }

    @Override // j$.util.stream.f0
    public final j$.util.b0 min() {
        return reduce(new q((byte) 5));
    }

    @Override // j$.util.stream.f0
    public final f0 peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new y(this, doubleConsumer);
    }

    @Override // j$.util.stream.f0
    public final boolean q() {
        return ((Boolean) C(w3.Q(u1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.f0
    public final LongStream r() {
        Objects.requireNonNull(null);
        return new w(this, b7.p | b7.n, (byte) 0);
    }

    @Override // j$.util.stream.f0
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) C(new f4(c7.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.f0
    public final f0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w3.R(this, j, -1L);
        }
        j$.time.g.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.f0
    public final f0 sorted() {
        return new f6(this, b7.q | b7.o, (byte) 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.u0 spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.f0
    public final double sum() {
        double[] dArr = (double[]) collect(new q((byte) 2), new q((byte) 3), new q((byte) 4));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.f0
    public final j$.util.w summaryStatistics() {
        return (j$.util.w) collect(new j$.time.format.a((byte) 9), new q((byte) 9), new j$.time.format.a((byte) 27));
    }

    @Override // j$.util.stream.f0
    public final double[] toArray() {
        return (double[]) w3.J((b2) D(new q((byte) 0))).b();
    }

    @Override // j$.util.stream.f0
    public final IntStream w() {
        Objects.requireNonNull(null);
        return new v(this, b7.p | b7.n, (byte) 0);
    }

    @Override // j$.util.stream.f0
    public final boolean y() {
        return ((Boolean) C(w3.Q(u1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.f0
    public final j$.util.b0 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (j$.util.b0) C(new z3(c7.DOUBLE_VALUE, doubleBinaryOperator, (byte) 1));
    }
}
