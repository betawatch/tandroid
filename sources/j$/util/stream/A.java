package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class A extends b implements D {
    @Override // j$.util.stream.D
    public final D sorted() {
        return new v2(this, Q2.q | Q2.o, 0);
    }

    @Override // j$.util.stream.D
    public final j$.util.j findAny() {
        return (j$.util.j) i0(new E(false, R2.DOUBLE_VALUE, j$.util.j.a(), new q(5), new k(6)));
    }

    @Override // j$.util.stream.D
    public final j$.util.j findFirst() {
        return (j$.util.j) i0(new E(true, R2.DOUBLE_VALUE, j$.util.j.a(), new q(5), new k(6)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.D E0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.D) {
            return (j$.util.D) spliterator;
        }
        if (y3.a) {
            y3.a(b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    @Override // j$.util.stream.b
    final R2 n0() {
        return R2.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.b
    final F0 k0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t0.F(bVar, spliterator, z);
    }

    @Override // j$.util.stream.b
    final Spliterator z0(b bVar, Supplier supplier, boolean z) {
        return new b3(bVar, supplier, z);
    }

    @Override // j$.util.stream.b
    final void m0(Spliterator spliterator, d2 d2Var) {
        j$.util.function.l pVar;
        j$.util.D E0 = E0(spliterator);
        if (d2Var instanceof j$.util.function.l) {
            pVar = (j$.util.function.l) d2Var;
        } else {
            if (y3.a) {
                y3.a(b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            d2Var.getClass();
            pVar = new p(0, d2Var);
        }
        while (!d2Var.q() && E0.p(pVar)) {
        }
    }

    @Override // j$.util.stream.b
    final x0 s0(long j, IntFunction intFunction) {
        return t0.J(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.p iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.D spliterator() {
        return E0(super.spliterator());
    }

    @Override // j$.util.stream.D
    public final Stream boxed() {
        return G(new k(28));
    }

    @Override // j$.util.stream.D
    public final double D(double d, j$.util.function.h hVar) {
        hVar.getClass();
        return ((Double) i0(new w1(R2.DOUBLE_VALUE, hVar, d))).doubleValue();
    }

    @Override // j$.util.stream.D
    public final Stream G(j$.util.function.o oVar) {
        oVar.getClass();
        return new u(this, Q2.p | Q2.n, oVar, 0);
    }

    @Override // j$.util.stream.D
    public final D L(j$.util.function.w wVar) {
        wVar.getClass();
        return new t(this, Q2.p | Q2.n, wVar, 0);
    }

    @Override // j$.util.stream.D
    public final IntStream Q(j$.util.function.r rVar) {
        rVar.getClass();
        return new v(this, Q2.p | Q2.n, rVar, 0);
    }

    @Override // j$.util.stream.D
    public final D S(j$.util.function.p pVar) {
        pVar.getClass();
        return new t(this, Q2.t, pVar, 2);
    }

    @Override // j$.util.stream.D
    public final D a(j$.util.function.l lVar) {
        lVar.getClass();
        return new t(this, lVar);
    }

    @Override // j$.util.stream.D
    public void c0(j$.util.function.l lVar) {
        lVar.getClass();
        i0(new L(lVar, true));
    }

    @Override // j$.util.stream.D
    public void i(j$.util.function.l lVar) {
        lVar.getClass();
        i0(new L(lVar, false));
    }

    @Override // j$.util.stream.D
    public final LongStream r(j$.util.function.v vVar) {
        vVar.getClass();
        return new w(this, Q2.p | Q2.n, vVar, 0);
    }

    @Override // j$.util.stream.D
    public final j$.util.j x(j$.util.function.h hVar) {
        hVar.getClass();
        return (j$.util.j) i0(new y1(R2.DOUBLE_VALUE, hVar, 0));
    }

    @Override // j$.util.stream.D
    public final D q(j$.util.function.o oVar) {
        return new t(this, Q2.p | Q2.n | Q2.t, oVar, 1);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !q0() ? this : new x(this, Q2.r, 0);
    }

    @Override // j$.util.stream.D
    public final D limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return t0.V(this, 0L, j);
    }

    @Override // j$.util.stream.D
    public final D skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t0.V(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.D
    public final D distinct() {
        return ((V1) boxed()).distinct().Z(new q(0));
    }

    @Override // j$.util.stream.D
    public final double sum() {
        double[] dArr = (double[]) z(new q(3), new k(1), new k(2));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.D
    public final j$.util.j min() {
        return x(new k(24));
    }

    @Override // j$.util.stream.D
    public final j$.util.j max() {
        return x(new q(2));
    }

    @Override // j$.util.stream.D
    public final j$.util.j average() {
        double[] dArr = (double[]) z(new k(25), new k(3), new k(4));
        if (dArr[2] <= 0.0d) {
            return j$.util.j.a();
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return j$.util.j.d(d / dArr[2]);
    }

    @Override // j$.util.stream.D
    public final long count() {
        return ((h0) r(new k(29))).sum();
    }

    @Override // j$.util.stream.D
    public final j$.util.f summaryStatistics() {
        return (j$.util.f) z(new k(13), new k(26), new k(27));
    }

    @Override // j$.util.stream.D
    public final Object z(Supplier supplier, j$.util.function.n0 n0Var, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 0);
        supplier.getClass();
        n0Var.getClass();
        return i0(new u1(R2.DOUBLE_VALUE, rVar, n0Var, supplier, 1));
    }

    @Override // j$.util.stream.D
    public final boolean a0(j$.util.function.p pVar) {
        return ((Boolean) i0(t0.W(pVar, q0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final boolean d0(j$.util.function.p pVar) {
        return ((Boolean) i0(t0.W(pVar, q0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final boolean j(j$.util.function.p pVar) {
        return ((Boolean) i0(t0.W(pVar, q0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final double[] toArray() {
        return (double[]) t0.O((z0) j0(new q(1))).e();
    }
}
