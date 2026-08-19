package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class f0 extends a implements LongStream {
    @Override // j$.util.stream.LongStream
    public final j$.util.B findAny() {
        return (j$.util.B) C(E.d);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B findFirst() {
        return (j$.util.B) C(E.c);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new z2(this, S2.q | S2.o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new L(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new L(longConsumer, true));
    }

    public static j$.util.Z T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Z) {
            return (j$.util.Z) spliterator;
        }
        if (A3.a) {
            A3.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.a
    public final T2 H() {
        return T2.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final B0 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return q1.E(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new h3(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, f2 f2Var) {
        LongConsumer k;
        boolean C;
        j$.util.Z T = T(spliterator);
        if (f2Var instanceof LongConsumer) {
            k = (LongConsumer) f2Var;
        } else {
            if (A3.a) {
                A3.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(f2Var);
            k = new j$.util.K(f2Var, 1);
        }
        do {
            C = f2Var.C();
            if (C) {
                break;
            }
        } while (T.tryAdvance(k));
        return C;
    }

    @Override // j$.util.stream.a
    public final t0 I(long j, IntFunction intFunction) {
        return q1.P(j);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.N iterator() {
        j$.util.Z spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g0(spliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.Z spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final A asDoubleStream() {
        return new q(this, S2.n, 5);
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new p(this, 0, new Y(5), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream e() {
        Objects.requireNonNull(null);
        return new s(this, S2.p | S2.n, 3);
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new p(this, S2.p | S2.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final IntStream w() {
        Objects.requireNonNull(null);
        return new r(this, S2.p | S2.n, 4);
    }

    @Override // j$.util.stream.LongStream
    public final A k() {
        Objects.requireNonNull(null);
        return new q(this, S2.p | S2.n, 6);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new c0(this, S2.p | S2.n | S2.t, tVar, 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b() {
        Objects.requireNonNull(null);
        return new s(this, S2.t, 5);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new c0(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return q1.V(this, 0L, j);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : q1.V(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        int i = X3.a;
        Objects.requireNonNull(null);
        return new z2(this, X3.a, 1);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        int i = X3.a;
        Objects.requireNonNull(null);
        return new J3(this, X3.b, 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((X1) boxed()).distinct().mapToLong(new Y(2));
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new Y(10));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B min() {
        return reduce(new Y(1));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B max() {
        return reduce(new Y(9));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.z average() {
        long j = ((long[]) collect(new Y(6), new Y(7), new Y(8)))[0];
        return j > 0 ? new j$.util.z(r0[1] / j) : j$.util.z.c;
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) C(new r1(T2.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new j$.time.format.a(17), new Y(0), new Y(3));
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        n nVar = new n(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(nVar);
        return C(new v1(T2.LONG_VALUE, nVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean u() {
        return ((Boolean) C(q1.U(o0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean p() {
        return ((Boolean) C(q1.U(o0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.B) C(new t1(T2.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean m() {
        return ((Boolean) C(q1.U(o0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) q1.M((z0) D(new Y(4))).d();
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) C(new x1(0))).longValue();
    }
}
