package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class B extends b implements E {
    B(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    B(b bVar, int i) {
        super(bVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.D E0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.D) {
            return (j$.util.D) spliterator;
        }
        if (!z3.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        z3.a(b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.E
    public final double D(double d, j$.util.function.i iVar) {
        iVar.getClass();
        return ((Double) i0(new x1(S2.DOUBLE_VALUE, iVar, d))).doubleValue();
    }

    @Override // j$.util.stream.E
    public final Stream G(j$.util.function.p pVar) {
        pVar.getClass();
        return new v(this, R2.p | R2.n, pVar, 0);
    }

    @Override // j$.util.stream.E
    public final E L(j$.util.function.v vVar) {
        vVar.getClass();
        return new u(this, R2.p | R2.n, vVar, 0);
    }

    @Override // j$.util.stream.E
    public final IntStream Q(j$.util.function.r rVar) {
        rVar.getClass();
        return new w(this, R2.p | R2.n, rVar, 0);
    }

    @Override // j$.util.stream.E
    public final E S(j$.util.function.q qVar) {
        qVar.getClass();
        return new u(this, R2.t, qVar, 2);
    }

    @Override // j$.util.stream.E
    public final E a(j$.util.function.m mVar) {
        mVar.getClass();
        return new u(this, mVar);
    }

    @Override // j$.util.stream.E
    public final boolean a0(j$.util.function.q qVar) {
        return ((Boolean) i0(u0.W(qVar, r0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.E
    public final j$.util.j average() {
        double[] dArr = (double[]) z(new l(25), new l(3), new l(4));
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

    @Override // j$.util.stream.E
    public final Stream boxed() {
        return G(new l(28));
    }

    @Override // j$.util.stream.E
    public void c0(j$.util.function.m mVar) {
        mVar.getClass();
        i0(new M(mVar, true));
    }

    @Override // j$.util.stream.E
    public final long count() {
        return ((i0) r(new l(29))).sum();
    }

    @Override // j$.util.stream.E
    public final boolean d0(j$.util.function.q qVar) {
        return ((Boolean) i0(u0.W(qVar, r0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.E
    public final E distinct() {
        return ((W1) ((W1) boxed()).distinct()).Z(new r(0));
    }

    @Override // j$.util.stream.E
    public final j$.util.j findAny() {
        return (j$.util.j) i0(new F(false, S2.DOUBLE_VALUE, j$.util.j.a(), new r(5), new l(6)));
    }

    @Override // j$.util.stream.E
    public final j$.util.j findFirst() {
        return (j$.util.j) i0(new F(true, S2.DOUBLE_VALUE, j$.util.j.a(), new r(5), new l(6)));
    }

    @Override // j$.util.stream.E
    public void i(j$.util.function.m mVar) {
        mVar.getClass();
        i0(new M(mVar, false));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final j$.util.p iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.E
    public final boolean j(j$.util.function.q qVar) {
        return ((Boolean) i0(u0.W(qVar, r0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.b
    final G0 k0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return u0.F(bVar, spliterator, z);
    }

    @Override // j$.util.stream.E
    public final E limit(long j) {
        if (j >= 0) {
            return u0.V(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.b
    final void m0(Spliterator spliterator, e2 e2Var) {
        j$.util.function.m qVar;
        j$.util.D E0 = E0(spliterator);
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
        while (!e2Var.q() && E0.p(qVar)) {
        }
    }

    @Override // j$.util.stream.E
    public final j$.util.j max() {
        return x(new r(2));
    }

    @Override // j$.util.stream.E
    public final j$.util.j min() {
        return x(new l(24));
    }

    @Override // j$.util.stream.b
    final S2 n0() {
        return S2.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.E
    public final E q(j$.util.function.p pVar) {
        return new u(this, R2.p | R2.n | R2.t, pVar, 1);
    }

    @Override // j$.util.stream.E
    public final LongStream r(j$.util.function.u uVar) {
        uVar.getClass();
        return new x(this, R2.p | R2.n, uVar, 0);
    }

    @Override // j$.util.stream.b
    final y0 s0(long j, IntFunction intFunction) {
        return u0.J(j);
    }

    @Override // j$.util.stream.E
    public final E skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : u0.V(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.E
    public final E sorted() {
        return new w2(this);
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final j$.util.D spliterator() {
        return E0(super.spliterator());
    }

    @Override // j$.util.stream.E
    public final double sum() {
        double[] dArr = (double[]) z(new r(3), new l(1), new l(2));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.E
    public final j$.util.f summaryStatistics() {
        return (j$.util.f) z(new l(13), new l(26), new l(27));
    }

    @Override // j$.util.stream.E
    public final double[] toArray() {
        return (double[]) u0.O((A0) j0(new r(1))).e();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !q0() ? this : new y(this, R2.r, 0);
    }

    @Override // j$.util.stream.E
    public final j$.util.j x(j$.util.function.i iVar) {
        iVar.getClass();
        return (j$.util.j) i0(new z1(S2.DOUBLE_VALUE, iVar, 0));
    }

    @Override // j$.util.stream.E
    public final Object z(Supplier supplier, j$.util.function.f0 f0Var, BiConsumer biConsumer) {
        s sVar = new s(biConsumer, 0);
        supplier.getClass();
        f0Var.getClass();
        return i0(new v1(S2.DOUBLE_VALUE, sVar, f0Var, supplier, 1));
    }

    @Override // j$.util.stream.b
    final Spliterator z0(b bVar, Supplier supplier, boolean z) {
        return new c3(bVar, supplier, z);
    }
}
