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
    public static j$.util.G E0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.G) {
            return (j$.util.G) spliterator;
        }
        if (!z3.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        z3.a(b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    public void A(j$.util.function.E e) {
        e.getClass();
        i0(new N(e, true));
    }

    @Override // j$.util.stream.IntStream
    public final Stream B(IntFunction intFunction) {
        intFunction.getClass();
        return new v(this, R2.p | R2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream F(j$.util.function.L l) {
        l.getClass();
        return new w(this, R2.p | R2.n, l, 2);
    }

    @Override // j$.util.stream.IntStream
    public final int H(int i, j$.util.function.A a) {
        a.getClass();
        return ((Integer) i0(new H1(S2.INT_VALUE, a, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream I(IntFunction intFunction) {
        return new w(this, R2.p | R2.n | R2.t, intFunction, 3);
    }

    public void J(j$.util.function.E e) {
        e.getClass();
        i0(new N(e, false));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream O(j$.util.function.G g) {
        g.getClass();
        return new w(this, R2.t, g, 4);
    }

    @Override // j$.util.stream.IntStream
    public final boolean R(j$.util.function.G g) {
        return ((Boolean) i0(u0.Y(g, r0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k U(j$.util.function.A a) {
        a.getClass();
        return (j$.util.k) i0(new z1(S2.INT_VALUE, a, 2));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream V(j$.util.function.E e) {
        e.getClass();
        return new w(this, e);
    }

    @Override // j$.util.stream.IntStream
    public final boolean X(j$.util.function.G g) {
        return ((Boolean) i0(u0.Y(g, r0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean Y(j$.util.function.G g) {
        return ((Boolean) i0(u0.Y(g, r0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final E asDoubleStream() {
        return new y(this, R2.p | R2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new X(this, R2.p | R2.n, 0);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.j average() {
        long[] jArr = (long[]) b0(new r(18), new r(19), new r(20));
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
    public final Object b0(Supplier supplier, j$.util.function.i0 i0Var, BiConsumer biConsumer) {
        s sVar = new s(biConsumer, 1);
        supplier.getClass();
        i0Var.getClass();
        return i0(new v1(S2.INT_VALUE, sVar, i0Var, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return B(new r(12));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((i0) f(new r(11))).sum();
    }

    @Override // j$.util.stream.IntStream
    public final E d(j$.util.function.H h) {
        h.getClass();
        return new u(this, R2.p | R2.n, h, 4);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((W1) ((W1) boxed()).distinct()).k(new r(10));
    }

    @Override // j$.util.stream.IntStream
    public final LongStream f(j$.util.function.K k) {
        k.getClass();
        return new x(this, R2.p | R2.n, k, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k findAny() {
        return (j$.util.k) i0(new F(false, S2.INT_VALUE, j$.util.k.a(), new r(7), new l(8)));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k findFirst() {
        return (j$.util.k) i0(new F(true, S2.INT_VALUE, j$.util.k.a(), new r(7), new l(8)));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.E
    public final j$.util.t iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.b
    final G0 k0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return u0.G(bVar, spliterator, z);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return u0.X(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.b
    final void m0(Spliterator spliterator, e2 e2Var) {
        j$.util.function.E u;
        j$.util.G E0 = E0(spliterator);
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
        while (!e2Var.q() && E0.p(u)) {
        }
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k max() {
        return U(new r(17));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.k min() {
        return U(new r(13));
    }

    @Override // j$.util.stream.b
    final S2 n0() {
        return S2.INT_VALUE;
    }

    @Override // j$.util.stream.b
    final y0 s0(long j, IntFunction intFunction) {
        return u0.R(j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : u0.X(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new x2(this);
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.E
    public final j$.util.G spliterator() {
        return E0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return H(0, new r(16));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.g summaryStatistics() {
        return (j$.util.g) b0(new l(15), new r(14), new r(15));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) u0.P((C0) j0(new r(9))).e();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !q0() ? this : new Y(this, R2.r);
    }

    @Override // j$.util.stream.b
    final Spliterator z0(b bVar, Supplier supplier, boolean z) {
        return new e3(bVar, supplier, z);
    }
}
