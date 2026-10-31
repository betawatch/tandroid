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
public abstract class i1 extends a implements LongStream {
    @Override // j$.util.stream.LongStream
    public final j$.util.d0 findAny() {
        return (j$.util.d0) I0(g0.d);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 findFirst() {
        return (j$.util.d0) I0(g0.c);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new d6(this, v6.q | v6.o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        I0(new n0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        I0(new n0(longConsumer, true));
    }

    public static j$.util.a1 U0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.a1) {
            return (j$.util.a1) spliterator;
        }
        if (d8.a) {
            d8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.a
    public final w6 M0() {
        return w6.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final e2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return t3.d0(aVar, spliterator, z10);
    }

    @Override // j$.util.stream.a
    public final Spliterator T0(a aVar, Supplier supplier, boolean z10) {
        return new k7(aVar, supplier, z10);
    }

    @Override // j$.util.stream.a
    public final boolean L0(Spliterator spliterator, j5 j5Var) {
        LongConsumer m0Var;
        boolean q6;
        j$.util.a1 U0 = U0(spliterator);
        if (j5Var instanceof LongConsumer) {
            m0Var = (LongConsumer) j5Var;
        } else {
            if (d8.a) {
                d8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(j5Var);
            m0Var = new j$.util.m0(j5Var, 1);
        }
        do {
            q6 = j5Var.q();
            if (q6) {
                break;
            }
        } while (U0.tryAdvance(m0Var));
        return q6;
    }

    @Override // j$.util.stream.t3
    public final w1 A0(long j10, IntFunction intFunction) {
        return t3.t0(j10);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.p0 iterator() {
        j$.util.a1 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h1(spliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.a1 spliterator() {
        return U0(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final c0 asDoubleStream() {
        return new r(this, v6.n, 5);
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new q(this, 0, new a1(5), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream e() {
        Objects.requireNonNull(null);
        return new t(this, v6.p | v6.n, 3);
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new q(this, v6.p | v6.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final IntStream A() {
        Objects.requireNonNull(null);
        return new s(this, v6.p | v6.n, 3);
    }

    @Override // j$.util.stream.LongStream
    public final c0 j() {
        Objects.requireNonNull(null);
        return new r(this, v6.p | v6.n, 6);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d(j$.time.t tVar) {
        Objects.requireNonNull(tVar);
        return new e1(this, v6.p | v6.n | v6.t, tVar, 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b() {
        Objects.requireNonNull(null);
        return new t(this, v6.t, 5);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new e1(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return t3.z0(this, 0L, j10);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : t3.z0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        int i10 = w8.a;
        Objects.requireNonNull(null);
        return new d6(this, w8.a, 1);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        int i10 = w8.a;
        Objects.requireNonNull(null);
        return new d6(this, w8.b, 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((b5) boxed()).distinct().mapToLong(new a1(2));
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new a1(10));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 min() {
        return reduce(new a1(1));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 max() {
        return reduce(new a1(9));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 average() {
        long j10 = ((long[]) collect(new a1(6), new a1(7), new a1(8)))[0];
        return j10 > 0 ? new j$.util.b0(r0[1] / j10) : j$.util.b0.c;
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j10, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) I0(new u3(w6.LONG_VALUE, longBinaryOperator, j10))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.z summaryStatistics() {
        return (j$.util.z) collect(new j$.time.format.a(17), new a1(0), new a1(3));
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(oVar);
        return I0(new y3(w6.LONG_VALUE, oVar, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean o() {
        return ((Boolean) I0(t3.y0(r1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.d0) I0(new w3(w6.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.LongStream
    public final boolean w() {
        return ((Boolean) I0(t3.y0(r1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final boolean l() {
        return ((Boolean) I0(t3.y0(r1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) t3.p0((c2) J0(new a1(4))).b();
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) I0(new a4(0))).longValue();
    }
}
