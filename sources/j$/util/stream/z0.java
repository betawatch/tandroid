package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class z0 extends a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.c0 findAny() {
        return (j$.util.c0) I0(f0.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 findFirst() {
        return (j$.util.c0) I0(f0.c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new c6(this, v6.q | v6.o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        I0(new m0(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        I0(new m0(intConsumer, true));
    }

    public static j$.util.x0 U0(Spliterator spliterator) {
        if (spliterator instanceof j$.util.x0) {
            return (j$.util.x0) spliterator;
        }
        if (d8.a) {
            d8.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.a
    public final w6 M0() {
        return w6.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final e2 K0(a aVar, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        return t3.c0(aVar, spliterator, z10);
    }

    @Override // j$.util.stream.a
    public final Spliterator T0(a aVar, Supplier supplier, boolean z10) {
        return new i7(aVar, supplier, z10);
    }

    @Override // j$.util.stream.a
    public final boolean L0(Spliterator spliterator, j5 j5Var) {
        IntConsumer i0Var;
        boolean q6;
        j$.util.x0 U0 = U0(spliterator);
        if (j5Var instanceof IntConsumer) {
            i0Var = (IntConsumer) j5Var;
        } else {
            if (d8.a) {
                d8.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(j5Var);
            i0Var = new j$.util.i0(j5Var, 1);
        }
        do {
            q6 = j5Var.q();
            if (q6) {
                break;
            }
        } while (U0.tryAdvance(i0Var));
        return q6;
    }

    @Override // j$.util.stream.t3
    public final w1 A0(long j10, IntFunction intFunction) {
        return t3.s0(j10);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.l0 iterator() {
        j$.util.x0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g1(spliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.x0 spliterator() {
        return U0(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new t(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final c0 asDoubleStream() {
        return new r(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new q(this, 0, new n(21), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        Objects.requireNonNull(intUnaryOperator);
        return new t0(this, v6.p | v6.n, intUnaryOperator, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new q(this, v6.p | v6.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream k() {
        Objects.requireNonNull(null);
        return new t(this, v6.p | v6.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final c0 g() {
        Objects.requireNonNull(null);
        return new r(this, v6.p | v6.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i10, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) I0(new j4(w6.INT_VALUE, intBinaryOperator, i10))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream q(k0 k0Var) {
        Objects.requireNonNull(k0Var);
        return new t0(this, v6.p | v6.n | v6.t, k0Var, 2);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.c0) I0(new w3(w6.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new s(this, v6.t, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new t0(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(Long.toString(j10));
        }
        return t3.x0(this, 0L, j10);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j10) {
        if (j10 >= 0) {
            return j10 == 0 ? this : t3.x0(this, j10, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j10));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i10 = w8.a;
        Objects.requireNonNull(null);
        return new c6(this, w8.a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i10 = w8.a;
        Objects.requireNonNull(null);
        return new c6(this, w8.b, 2);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) I0(new a4(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((b5) boxed()).distinct().mapToInt(new n(20));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new n(25));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 min() {
        return reduce(new n(22));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 max() {
        return reduce(new n(26));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 average() {
        long j10 = ((long[]) collect(new n(27), new n(28), new n(29)))[0];
        return j10 > 0 ? new j$.util.b0(r0[1] / j10) : j$.util.b0.c;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new j$.time.format.a(14), new n(23), new n(24));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(oVar);
        return I0(new y3(w6.INT_VALUE, oVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean y() {
        return ((Boolean) I0(t3.w0(r1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean n() {
        return ((Boolean) I0(t3.w0(r1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) I0(t3.w0(r1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) t3.o0((a2) J0(new n(19))).b();
    }
}
