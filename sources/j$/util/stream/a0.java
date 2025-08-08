package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class a0 extends b implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.k findAny() {
        return (j$.util.k) i0(new E(false, R2.INT_VALUE, j$.util.k.a(), new q(7), new k(8)));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k findFirst() {
        return (j$.util.k) i0(new E(true, R2.INT_VALUE, j$.util.k.a(), new q(7), new k(8)));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new w2(this, Q2.q | Q2.o, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.G E0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.G) {
            return (j$.util.G) spliterator;
        }
        if (y3.a) {
            y3.a(b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.b
    final R2 n0() {
        return R2.INT_VALUE;
    }

    @Override // j$.util.stream.b
    final F0 k0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t0.G(bVar, spliterator, z);
    }

    @Override // j$.util.stream.b
    final Spliterator z0(b bVar, Supplier supplier, boolean z) {
        return new d3(bVar, supplier, z);
    }

    @Override // j$.util.stream.b
    final void m0(Spliterator spliterator, d2 d2Var) {
        j$.util.function.G t;
        j$.util.G E0 = E0(spliterator);
        if (d2Var instanceof j$.util.function.G) {
            t = (j$.util.function.G) d2Var;
        } else {
            if (y3.a) {
                y3.a(b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            d2Var.getClass();
            t = new T(0, d2Var);
        }
        while (!d2Var.q() && E0.p(t)) {
        }
    }

    @Override // j$.util.stream.b
    final x0 s0(long j, IntFunction intFunction) {
        return t0.R(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.t iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.G spliterator() {
        return E0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new W(this, Q2.p | Q2.n, 0);
    }

    public void A(j$.util.function.G g) {
        g.getClass();
        i0(new M(g, true));
    }

    @Override // j$.util.stream.IntStream
    public final Stream B(IntFunction intFunction) {
        intFunction.getClass();
        return new u(this, Q2.p | Q2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream F(j$.util.function.P p) {
        p.getClass();
        return new v(this, Q2.p | Q2.n, p, 2);
    }

    @Override // j$.util.stream.IntStream
    public final int H(int i, j$.util.function.C c) {
        c.getClass();
        return ((Integer) i0(new G1(R2.INT_VALUE, c, i))).intValue();
    }

    public void J(j$.util.function.G g) {
        g.getClass();
        i0(new M(g, false));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream O(j$.util.function.I i) {
        i.getClass();
        return new v(this, Q2.t, i, 4);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k U(j$.util.function.C c) {
        c.getClass();
        return (j$.util.k) i0(new y1(R2.INT_VALUE, c, 2));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream V(j$.util.function.G g) {
        g.getClass();
        return new v(this, g);
    }

    @Override // j$.util.stream.IntStream
    public final D d(j$.util.function.K k) {
        k.getClass();
        return new t(this, Q2.p | Q2.n, k, 4);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream f(j$.util.function.O o) {
        o.getClass();
        return new w(this, Q2.p | Q2.n, o, 1);
    }

    @Override // j$.util.stream.IntStream
    public final D asDoubleStream() {
        return new x(this, Q2.p | Q2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return B(new q(12));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream I(IntFunction intFunction) {
        return new v(this, Q2.p | Q2.n | Q2.t, intFunction, 3);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !q0() ? this : new X(this, Q2.r, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return t0.X(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t0.X(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((V1) boxed()).distinct().k(new q(10));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return H(0, new q(16));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k min() {
        return U(new q(13));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k max() {
        return U(new q(17));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((h0) f(new q(11))).sum();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.j average() {
        long j = ((long[]) b0(new q(18), new q(19), new q(20)))[0];
        return j > 0 ? j$.util.j.d(r0[1] / j) : j$.util.j.a();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.g summaryStatistics() {
        return (j$.util.g) b0(new k(15), new q(14), new q(15));
    }

    @Override // j$.util.stream.IntStream
    public final Object b0(Supplier supplier, j$.util.function.q0 q0Var, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 1);
        supplier.getClass();
        q0Var.getClass();
        return i0(new u1(R2.INT_VALUE, rVar, q0Var, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean X(j$.util.function.I i) {
        return ((Boolean) i0(t0.Y(i, q0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean R(j$.util.function.I i) {
        return ((Boolean) i0(t0.Y(i, q0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean Y(j$.util.function.I i) {
        return ((Boolean) i0(t0.Y(i, q0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) t0.P((B0) j0(new q(9))).e();
    }
}
