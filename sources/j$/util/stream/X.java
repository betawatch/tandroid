package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class X extends a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.A findAny() {
        return (j$.util.A) C(D.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A findFirst() {
        return (j$.util.A) C(D.c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new y2(this, S2.q | S2.o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new K(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new K(intConsumer, true));
    }

    public static j$.util.W T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.W) {
            return (j$.util.W) spliterator;
        }
        if (A3.a) {
            A3.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.a
    public final T2 H() {
        return T2.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final B0 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return q1.D(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new f3(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, f2 f2Var) {
        IntConsumer g;
        boolean C;
        j$.util.W T = T(spliterator);
        if (f2Var instanceof IntConsumer) {
            g = (IntConsumer) f2Var;
        } else {
            if (A3.a) {
                A3.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(f2Var);
            g = new j$.util.G(f2Var, 1);
        }
        do {
            C = f2Var.C();
            if (C) {
                break;
            }
        } while (T.tryAdvance(g));
        return C;
    }

    @Override // j$.util.stream.a
    public final t0 I(long j, IntFunction intFunction) {
        return q1.O(j);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.J iterator() {
        j$.util.W spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f0(spliterator);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.W spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new s(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final A asDoubleStream() {
        return new q(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new p(this, 0, new m(21), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new r(this, S2.p | S2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new p(this, S2.p | S2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream l() {
        Objects.requireNonNull(null);
        return new s(this, S2.p | S2.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final A f() {
        Objects.requireNonNull(null);
        return new q(this, S2.p | S2.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) C(new G1(T2.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream x(I i) {
        Objects.requireNonNull(i);
        return new S(this, S2.p | S2.n | S2.t, i, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.A) C(new t1(T2.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new r(this, S2.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new S(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return q1.T(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : q1.T(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = X3.a;
        Objects.requireNonNull(null);
        return new y2(this, X3.a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = X3.a;
        Objects.requireNonNull(null);
        return new G3(this, X3.b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) C(new x1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((X1) boxed()).distinct().mapToInt(new m(20));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new m(25));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A min() {
        return reduce(new m(22));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A max() {
        return reduce(new m(26));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.z average() {
        long j = ((long[]) collect(new m(27), new m(28), new m(29)))[0];
        return j > 0 ? new j$.util.z(r0[1] / j) : j$.util.z.c;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.v summaryStatistics() {
        return (j$.util.v) collect(new j$.time.format.a(14), new m(23), new m(24));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        n nVar = new n(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(nVar);
        return C(new v1(T2.INT_VALUE, nVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) C(q1.S(o0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean t() {
        return ((Boolean) C(q1.S(o0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) C(q1.S(o0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) q1.L((x0) D(new m(19))).d();
    }
}
