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
public abstract class Y extends a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.A findAny() {
        return (j$.util.A) C(E.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A findFirst() {
        return (j$.util.A) C(E.c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new z2(this, S2.q | S2.o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new L(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new L(intConsumer, true));
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
    public final C0 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return r1.D(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new f3(aVar, supplier, z);
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, g2 g2Var) {
        IntConsumer g;
        boolean C;
        j$.util.W T = T(spliterator);
        if (g2Var instanceof IntConsumer) {
            g = (IntConsumer) g2Var;
        } else {
            if (A3.a) {
                A3.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(g2Var);
            g = new j$.util.G(g2Var, 1);
        }
        do {
            C = g2Var.C();
            if (C) {
                break;
            }
        } while (T.tryAdvance(g));
        return C;
    }

    @Override // j$.util.stream.a
    public final u0 I(long j, IntFunction intFunction) {
        return r1.P(j);
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
        return new t(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final B asDoubleStream() {
        return new r(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new q(this, 0, new n(21), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream e() {
        Objects.requireNonNull(null);
        return new s(this, S2.p | S2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new q(this, S2.p | S2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream l() {
        Objects.requireNonNull(null);
        return new t(this, S2.p | S2.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final B f() {
        Objects.requireNonNull(null);
        return new r(this, S2.p | S2.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) C(new H1(T2.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream x(J j) {
        Objects.requireNonNull(j);
        return new T(this, S2.p | S2.n | S2.t, j, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.A) C(new u1(T2.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new s(this, S2.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new T(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return r1.U(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : r1.U(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = X3.a;
        Objects.requireNonNull(null);
        return new z2(this, X3.a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = X3.a;
        Objects.requireNonNull(null);
        return new G3(this, X3.b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) C(new y1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((Y1) boxed()).distinct().mapToInt(new n(20));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new n(25));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A min() {
        return reduce(new n(22));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A max() {
        return reduce(new n(26));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.z average() {
        long j = ((long[]) collect(new n(27), new n(28), new n(29)))[0];
        return j > 0 ? new j$.util.z(r0[1] / j) : j$.util.z.c;
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.v summaryStatistics() {
        return (j$.util.v) collect(new j$.time.format.a(14), new n(23), new n(24));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        o oVar = new o(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(oVar);
        return C(new w1(T2.INT_VALUE, oVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) C(r1.T(p0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean t() {
        return ((Boolean) C(r1.T(p0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) C(r1.T(p0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) r1.L((y0) D(new n(19))).d();
    }
}
