package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class A extends b implements D {
    A(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    A(b bVar, int i) {
        super(bVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.D G0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.D) {
            return (j$.util.D) spliterator;
        }
        if (!z3.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        z3.a(b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.D
    public final Object A(Supplier supplier, j$.util.function.f0 f0Var, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 0);
        supplier.getClass();
        f0Var.getClass();
        return k0(new u1(S2.DOUBLE_VALUE, rVar, f0Var, supplier, 1));
    }

    @Override // j$.util.stream.b
    final Spliterator B0(b bVar, Supplier supplier, boolean z) {
        return new c3(bVar, supplier, z);
    }

    @Override // j$.util.stream.D
    public final double E(double d, j$.util.function.i iVar) {
        iVar.getClass();
        return ((Double) k0(new w1(S2.DOUBLE_VALUE, iVar, d))).doubleValue();
    }

    @Override // j$.util.stream.D
    public final Stream H(j$.util.function.p pVar) {
        pVar.getClass();
        return new u(this, R2.p | R2.n, pVar, 0);
    }

    @Override // j$.util.stream.D
    public final D M(j$.util.function.v vVar) {
        vVar.getClass();
        return new t(this, R2.p | R2.n, vVar, 0);
    }

    @Override // j$.util.stream.D
    public final IntStream R(j$.util.function.r rVar) {
        rVar.getClass();
        return new v(this, R2.p | R2.n, rVar, 0);
    }

    @Override // j$.util.stream.D
    public final D T(j$.util.function.q qVar) {
        qVar.getClass();
        return new t(this, R2.t, qVar, 2);
    }

    @Override // j$.util.stream.D
    public final j$.util.j average() {
        double[] dArr = (double[]) A(new l(21), new l(3), new l(4));
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
    public final D b(j$.util.function.m mVar) {
        mVar.getClass();
        return new t(this, mVar);
    }

    @Override // j$.util.stream.D
    public final Stream boxed() {
        return H(new l(24));
    }

    @Override // j$.util.stream.D
    public final boolean c0(j$.util.function.q qVar) {
        return ((Boolean) k0(t0.W(qVar, q0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final long count() {
        return ((h0) s(new l(25))).sum();
    }

    @Override // j$.util.stream.D
    public final D distinct() {
        return ((W1) ((W1) boxed()).distinct()).b0(new l(26));
    }

    @Override // j$.util.stream.D
    public void e0(j$.util.function.m mVar) {
        mVar.getClass();
        k0(new M(mVar, true));
    }

    @Override // j$.util.stream.D
    public final boolean f0(j$.util.function.q qVar) {
        return ((Boolean) k0(t0.W(qVar, q0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final j$.util.j findAny() {
        return (j$.util.j) k0(new F(false, S2.DOUBLE_VALUE, j$.util.j.a(), new E(1), new l(6)));
    }

    @Override // j$.util.stream.D
    public final j$.util.j findFirst() {
        return (j$.util.j) k0(new F(true, S2.DOUBLE_VALUE, j$.util.j.a(), new E(1), new l(6)));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.p iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.D
    public void j(j$.util.function.m mVar) {
        mVar.getClass();
        k0(new M(mVar, false));
    }

    @Override // j$.util.stream.D
    public final boolean k(j$.util.function.q qVar) {
        return ((Boolean) k0(t0.W(qVar, q0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.D
    public final D limit(long j) {
        if (j >= 0) {
            return t0.V(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.b
    final F0 m0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t0.F(bVar, spliterator, z);
    }

    @Override // j$.util.stream.D
    public final j$.util.j max() {
        return y(new l(28));
    }

    @Override // j$.util.stream.D
    public final j$.util.j min() {
        return y(new l(20));
    }

    @Override // j$.util.stream.b
    final void o0(Spliterator spliterator, e2 e2Var) {
        j$.util.function.m qVar;
        j$.util.D G0 = G0(spliterator);
        if (e2Var instanceof j$.util.function.m) {
            qVar = (j$.util.function.m) e2Var;
        } else {
            if (z3.a) {
                z3.a(b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            e2Var.getClass();
            qVar = new q(0, e2Var);
        }
        while (!e2Var.q() && G0.p(qVar)) {
        }
    }

    @Override // j$.util.stream.b
    final S2 p0() {
        return S2.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.D
    public final D r(j$.util.function.p pVar) {
        return new t(this, R2.p | R2.n | R2.t, pVar, 1);
    }

    @Override // j$.util.stream.D
    public final LongStream s(j$.util.function.u uVar) {
        uVar.getClass();
        return new w(this, R2.p | R2.n, uVar, 0);
    }

    @Override // j$.util.stream.D
    public final D skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t0.V(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.D
    public final D sorted() {
        return new w2(this);
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.D spliterator() {
        return G0(super.spliterator());
    }

    @Override // j$.util.stream.D
    public final double sum() {
        double[] dArr = (double[]) A(new l(29), new l(1), new l(2));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.D
    public final j$.util.f summaryStatistics() {
        return (j$.util.f) A(new l(13), new l(22), new l(23));
    }

    @Override // j$.util.stream.D
    public final double[] toArray() {
        return (double[]) t0.O((z0) l0(new l(27))).e();
    }

    @Override // j$.util.stream.b
    final x0 u0(long j, IntFunction intFunction) {
        return t0.J(j);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !s0() ? this : new x(this, R2.r, 0);
    }

    @Override // j$.util.stream.D
    public final j$.util.j y(j$.util.function.i iVar) {
        iVar.getClass();
        return (j$.util.j) k0(new y1(S2.DOUBLE_VALUE, iVar, 0));
    }
}
