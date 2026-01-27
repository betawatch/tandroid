package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class j0 extends b implements LongStream {
    @Override // j$.util.stream.LongStream
    public final j$.util.D findAny() {
        return (j$.util.D) C(H.d);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.D findFirst() {
        return (j$.util.D) C(H.c);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new G2(this, a3.q | a3.o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new N(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new N(longConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.c0 Y(Spliterator spliterator) {
        if (spliterator instanceof j$.util.c0) {
            return (j$.util.c0) spliterator;
        }
        if (J3.a) {
            J3.a(b.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.b
    final b3 H() {
        return b3.LONG_VALUE;
    }

    @Override // j$.util.stream.b
    final I0 E(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return w0.H(bVar, spliterator, z);
    }

    @Override // j$.util.stream.b
    final Spliterator T(b bVar, Supplier supplier, boolean z) {
        return new p3(bVar, supplier, z);
    }

    @Override // j$.util.stream.b
    final boolean G(Spliterator spliterator, m2 m2Var) {
        LongConsumer c0Var;
        boolean n;
        j$.util.c0 Y = Y(spliterator);
        if (m2Var instanceof LongConsumer) {
            c0Var = (LongConsumer) m2Var;
        } else {
            if (J3.a) {
                J3.a(b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(m2Var);
            c0Var = new c0(m2Var);
        }
        do {
            n = m2Var.n();
            if (n) {
                break;
            }
        } while (Y.tryAdvance(c0Var));
        return n;
    }

    @Override // j$.util.stream.b
    final A0 M(long j, IntFunction intFunction) {
        return w0.U(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.P iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.c0 spliterator() {
        return Y(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final D asDoubleStream() {
        return new t(this, a3.n, 5);
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new s(this, 0, new b0(4), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d() {
        Objects.requireNonNull(null);
        return new v(this, a3.p | a3.n, 3);
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new s(this, a3.p | a3.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final IntStream w() {
        Objects.requireNonNull(null);
        return new u(this, a3.p | a3.n, 4);
    }

    @Override // j$.util.stream.LongStream
    public final D k() {
        Objects.requireNonNull(null);
        return new t(this, a3.p | a3.n, 6);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream e(a aVar) {
        Objects.requireNonNull(aVar);
        return new g0(this, a3.p | a3.n | a3.t, aVar, 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b() {
        Objects.requireNonNull(null);
        return new v(this, a3.t, 5);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new g0(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return w0.a0(this, 0L, j);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w0.a0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        int i = i4.a;
        Objects.requireNonNull(null);
        return new S3(this, i4.a, 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        int i = i4.a;
        Objects.requireNonNull(null);
        return new U3(this, i4.b, 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((e2) boxed()).distinct().mapToLong(new b0(1));
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new b0(9));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.D min() {
        return reduce(new b0(0));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.D max() {
        return reduce(new b0(8));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B average() {
        long j = ((long[]) collect(new b0(5), new b0(6), new b0(7)))[0];
        return j > 0 ? j$.util.B.d(r0[1] / j) : j$.util.B.a();
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) C(new y1(b3.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.z summaryStatistics() {
        return (j$.util.z) collect(new j(27), new k(29), new b0(2));
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        q qVar = new q(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(qVar);
        return C(new C1(b3.LONG_VALUE, qVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean v() {
        return ((Boolean) C(w0.b0(t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean q() {
        return ((Boolean) C(w0.b0(t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.D reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.D) C(new A1(b3.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean m() {
        return ((Boolean) C(w0.b0(t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) w0.Q((G0) D(new b0(3))).d();
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) C(new E1(0))).longValue();
    }
}
