package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class b0 extends b implements IntStream {
    b0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    b0(b bVar, int i) {
        super(bVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.G G0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.G) {
            return (j$.util.G) spliterator;
        }
        if (!z3.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        z3.a(b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    public void B(j$.util.function.E e) {
        e.getClass();
        k0(new N(e, true));
    }

    @Override // j$.util.stream.b
    final Spliterator B0(b bVar, Supplier supplier, boolean z) {
        return new e3(bVar, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final Stream C(IntFunction intFunction) {
        intFunction.getClass();
        return new u(this, R2.p | R2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream G(j$.util.function.L l) {
        l.getClass();
        return new v(this, R2.p | R2.n, l, 2);
    }

    @Override // j$.util.stream.IntStream
    public final int I(int i, j$.util.function.A a) {
        a.getClass();
        return ((Integer) k0(new G1(S2.INT_VALUE, a, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream J(IntFunction intFunction) {
        return new v(this, R2.p | R2.n | R2.t, intFunction, 3);
    }

    public void K(j$.util.function.E e) {
        e.getClass();
        k0(new N(e, false));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream P(j$.util.function.G g) {
        g.getClass();
        return new v(this, R2.t, g, 4);
    }

    @Override // j$.util.stream.IntStream
    public final boolean S(j$.util.function.G g) {
        return ((Boolean) k0(t0.Y(g, q0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k V(j$.util.function.A a) {
        a.getClass();
        return (j$.util.k) k0(new y1(S2.INT_VALUE, a, 2));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream W(j$.util.function.E e) {
        e.getClass();
        return new v(this, e);
    }

    @Override // j$.util.stream.IntStream
    public final boolean Z(j$.util.function.G g) {
        return ((Boolean) k0(t0.Y(g, q0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean a0(j$.util.function.G g) {
        return ((Boolean) k0(t0.Y(g, q0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final D asDoubleStream() {
        return new x(this, R2.p | R2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new X(this, R2.p | R2.n, 0);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.j average() {
        long[] jArr = (long[]) d0(new E(14), new E(15), new E(16));
        long j = jArr[0];
        if (j <= 0) {
            return j$.util.j.a();
        }
        double d = jArr[1];
        double d2 = j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return j$.util.j.d(d / d2);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return C(new E(8));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((h0) g(new E(7))).sum();
    }

    @Override // j$.util.stream.IntStream
    public final Object d0(Supplier supplier, j$.util.function.i0 i0Var, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 1);
        supplier.getClass();
        i0Var.getClass();
        return k0(new u1(S2.INT_VALUE, rVar, i0Var, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((W1) ((W1) boxed()).distinct()).l(new E(6));
    }

    @Override // j$.util.stream.IntStream
    public final D e(j$.util.function.H h) {
        h.getClass();
        return new t(this, R2.p | R2.n, h, 4);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k findAny() {
        return (j$.util.k) k0(new F(false, S2.INT_VALUE, j$.util.k.a(), new E(3), new l(8)));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k findFirst() {
        return (j$.util.k) k0(new F(true, S2.INT_VALUE, j$.util.k.a(), new E(3), new l(8)));
    }

    @Override // j$.util.stream.IntStream
    public final LongStream g(j$.util.function.K k) {
        k.getClass();
        return new w(this, R2.p | R2.n, k, 1);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.t iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return t0.X(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.b
    final F0 m0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t0.G(bVar, spliterator, z);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k max() {
        return V(new E(13));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k min() {
        return V(new E(9));
    }

    @Override // j$.util.stream.b
    final void o0(Spliterator spliterator, e2 e2Var) {
        j$.util.function.E u;
        j$.util.G G0 = G0(spliterator);
        if (e2Var instanceof j$.util.function.E) {
            u = (j$.util.function.E) e2Var;
        } else {
            if (z3.a) {
                z3.a(b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            e2Var.getClass();
            u = new U(0, e2Var);
        }
        while (!e2Var.q() && G0.p(u)) {
        }
    }

    @Override // j$.util.stream.b
    final S2 p0() {
        return S2.INT_VALUE;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t0.X(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new x2(this);
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.G spliterator() {
        return G0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return I(0, new E(12));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.g summaryStatistics() {
        return (j$.util.g) d0(new l(15), new E(10), new E(11));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) t0.P((B0) l0(new E(5))).e();
    }

    @Override // j$.util.stream.b
    final x0 u0(long j, IntFunction intFunction) {
        return t0.R(j);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !s0() ? this : new Y(this, R2.r);
    }
}
