package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiConsumer;
import j$.util.function.IntFunction;
import j$.util.function.LongFunction;
import j$.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class h0 extends b implements LongStream {
    h0(Spliterator spliterator, int i) {
        super(spliterator, i, false);
    }

    h0(b bVar, int i) {
        super(bVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.J F0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.J) {
            return (j$.util.J) spliterator;
        }
        if (!z3.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        z3.a(b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.b
    final Spliterator A0(b bVar, Supplier supplier, boolean z) {
        return new g3(bVar, supplier, z);
    }

    @Override // j$.util.stream.LongStream
    public final boolean C(j$.util.function.W w) {
        return ((Boolean) j0(t0.a0(w, q0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean E(j$.util.function.W w) {
        return ((Boolean) j0(t0.a0(w, q0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream K(j$.util.function.W w) {
        w.getClass();
        return new w(this, R2.t, w, 4);
    }

    public void T(j$.util.function.T t) {
        t.getClass();
        j0(new O(t, true));
    }

    @Override // j$.util.stream.LongStream
    public final Object X(Supplier supplier, j$.util.function.l0 l0Var, BiConsumer biConsumer) {
        r rVar = new r(biConsumer, 2);
        supplier.getClass();
        l0Var.getClass();
        return j0(new u1(S2.LONG_VALUE, rVar, l0Var, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final D asDoubleStream() {
        return new x(this, R2.p | R2.n, 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.j average() {
        long[] jArr = (long[]) X(new E(25), new E(26), new E(27));
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

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return mapToObj(new E(23));
    }

    public void c(j$.util.function.T t) {
        t.getClass();
        j0(new O(t, false));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((h0) t(new E(24))).sum();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((W1) boxed()).distinct().mapToLong(new E(20));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l findAny() {
        return (j$.util.l) j0(new F(false, S2.LONG_VALUE, j$.util.l.a(), new E(2), new l(7)));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l findFirst() {
        return (j$.util.l) j0(new F(true, S2.LONG_VALUE, j$.util.l.a(), new E(2), new l(7)));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l g(j$.util.function.O o) {
        o.getClass();
        return (j$.util.l) j0(new y1(S2.LONG_VALUE, o, 3));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.x iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.b
    final F0 l0(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return t0.H(bVar, spliterator, z);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j >= 0) {
            return t0.Z(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream m(j$.util.function.T t) {
        t.getClass();
        return new w(this, t);
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        longFunction.getClass();
        return new u(this, R2.p | R2.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l max() {
        return g(new E(28));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.l min() {
        return g(new E(19));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream n(LongFunction longFunction) {
        return new w(this, R2.p | R2.n | R2.t, longFunction, 3);
    }

    @Override // j$.util.stream.b
    final void n0(Spliterator spliterator, e2 e2Var) {
        j$.util.function.T c0Var;
        j$.util.J F0 = F0(spliterator);
        if (e2Var instanceof j$.util.function.T) {
            c0Var = (j$.util.function.T) e2Var;
        } else {
            if (z3.a) {
                z3.a(b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            e2Var.getClass();
            c0Var = new c0(0, e2Var);
        }
        while (!e2Var.q() && F0.p(c0Var)) {
        }
    }

    @Override // j$.util.stream.b
    final S2 o0() {
        return S2.LONG_VALUE;
    }

    @Override // j$.util.stream.LongStream
    public final D p(j$.util.function.X x) {
        x.getClass();
        return new t(this, R2.p | R2.n, x, 5);
    }

    @Override // j$.util.stream.LongStream
    public final boolean s(j$.util.function.W w) {
        return ((Boolean) j0(t0.a0(w, q0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : t0.Z(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new y2(this);
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.J spliterator() {
        return F0(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return v(0L, new E(18));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.i summaryStatistics() {
        return (j$.util.i) X(new l(16), new E(17), new E(21));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream t(j$.util.function.c0 c0Var) {
        c0Var.getClass();
        return new w(this, R2.p | R2.n, c0Var, 2);
    }

    @Override // j$.util.stream.b
    final x0 t0(long j, IntFunction intFunction) {
        return t0.T(j);
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) t0.Q((D0) k0(new E(22))).e();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !r0() ? this : new X(this, R2.r, 1);
    }

    @Override // j$.util.stream.LongStream
    public final long v(long j, j$.util.function.O o) {
        o.getClass();
        return ((Long) j0(new K1(S2.LONG_VALUE, o, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final IntStream y(j$.util.function.Y y) {
        y.getClass();
        return new v(this, R2.p | R2.n, y, 5);
    }
}
