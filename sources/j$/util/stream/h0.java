package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.LongFunction;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class h0 extends b implements LongStream {
    @Override // j$.util.stream.LongStream
    public final j$.util.l findAny() {
        return (j$.util.l) i0(new E(false, R2.LONG_VALUE, j$.util.l.a(), new q(6), new k(7)));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l findFirst() {
        return (j$.util.l) i0(new E(true, R2.LONG_VALUE, j$.util.l.a(), new q(6), new k(7)));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new x2(this, Q2.q | Q2.o, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.J E0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.J) {
            return (j$.util.J) spliterator;
        }
        if (y3.a) {
            y3.a(b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.b
    final R2 n0() {
        return R2.LONG_VALUE;
    }

    @Override // j$.util.stream.b
    final F0 k0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t0.H(bVar, spliterator, z);
    }

    @Override // j$.util.stream.b
    final Spliterator z0(b bVar, Supplier supplier, boolean z) {
        return new f3(bVar, supplier, z);
    }

    @Override // j$.util.stream.b
    final void m0(Spliterator spliterator, d2 d2Var) {
        j$.util.function.Y b0Var;
        j$.util.J E0 = E0(spliterator);
        if (d2Var instanceof j$.util.function.Y) {
            b0Var = (j$.util.function.Y) d2Var;
        } else {
            if (y3.a) {
                y3.a(b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            d2Var.getClass();
            b0Var = new b0(0, d2Var);
        }
        while (!d2Var.q() && E0.p(b0Var)) {
        }
    }

    @Override // j$.util.stream.b
    final x0 s0(long j, IntFunction intFunction) {
        return t0.T(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.x iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.J spliterator() {
        return E0(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final D asDoubleStream() {
        return new x(this, Q2.p | Q2.n, 2);
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return mapToObj(new q(27));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream K(j$.util.function.b0 b0Var) {
        b0Var.getClass();
        return new w(this, Q2.t, b0Var, 4);
    }

    public void T(j$.util.function.Y y) {
        y.getClass();
        i0(new N(y, true));
    }

    public void c(j$.util.function.Y y) {
        y.getClass();
        i0(new N(y, false));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l g(j$.util.function.U u) {
        u.getClass();
        return (j$.util.l) i0(new y1(R2.LONG_VALUE, u, 3));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream m(j$.util.function.Y y) {
        y.getClass();
        return new w(this, y);
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        longFunction.getClass();
        return new u(this, Q2.p | Q2.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final D p(j$.util.function.d0 d0Var) {
        d0Var.getClass();
        return new t(this, Q2.p | Q2.n, d0Var, 5);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream t(j$.util.function.k0 k0Var) {
        k0Var.getClass();
        return new w(this, Q2.p | Q2.n, k0Var, 2);
    }

    @Override // j$.util.stream.LongStream
    public final long v(long j, j$.util.function.U u) {
        u.getClass();
        return ((Long) i0(new K1(R2.LONG_VALUE, u, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final IntStream y(j$.util.function.f0 f0Var) {
        f0Var.getClass();
        return new v(this, Q2.p | Q2.n, f0Var, 5);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream n(LongFunction longFunction) {
        return new w(this, Q2.p | Q2.n | Q2.t, longFunction, 3);
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !q0() ? this : new W(this, Q2.r, 1);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return t0.Z(this, 0L, j);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t0.Z(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((V1) boxed()).distinct().mapToLong(new q(24));
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return v(0L, new q(22));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l min() {
        return g(new q(23));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l max() {
        return g(new c0(2));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.j average() {
        long j = ((long[]) W(new q(29), new c0(0), new c0(1)))[0];
        return j > 0 ? j$.util.j.d(r0[1] / j) : j$.util.j.a();
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((h0) t(new q(28))).sum();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.i summaryStatistics() {
        return (j$.util.i) W(new k(16), new q(21), new q(25));
    }

    @Override // j$.util.stream.LongStream
    public final Object W(Supplier supplier, j$.util.function.t0 t0Var, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 2);
        supplier.getClass();
        t0Var.getClass();
        return i0(new u1(R2.LONG_VALUE, rVar, t0Var, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean C(j$.util.function.b0 b0Var) {
        return ((Boolean) i0(t0.a0(b0Var, q0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean s(j$.util.function.b0 b0Var) {
        return ((Boolean) i0(t0.a0(b0Var, q0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean E(j$.util.function.b0 b0Var) {
        return ((Boolean) i0(t0.a0(b0Var, q0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) t0.Q((D0) j0(new q(26))).e();
    }
}
