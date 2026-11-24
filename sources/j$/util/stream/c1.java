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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public abstract class c1 extends a implements IntStream {
    public static j$.util.x0 T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.x0) {
            return (j$.util.x0) spliterator;
        }
        if (!j8.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        j8.a(a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final h2 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return w3.C(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, n5 n5Var) {
        IntConsumer i0Var;
        boolean q;
        j$.util.x0 T = T(spliterator);
        if (n5Var instanceof IntConsumer) {
            i0Var = (IntConsumer) n5Var;
        } else {
            if (j8.a) {
                j8.a(a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            i0Var = new j$.util.i0(n5Var, (byte) 1);
        }
        do {
            q = n5Var.q();
            if (q) {
                break;
            }
        } while (T.tryAdvance(i0Var));
        return q;
    }

    @Override // j$.util.stream.a
    public final c7 H() {
        return c7.INT_VALUE;
    }

    @Override // j$.util.stream.a
    public final z1 I(long j, IntFunction intFunction) {
        return w3.O(j);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new o7(aVar, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = z8.a;
        Objects.requireNonNull(null);
        return new g6(this, z8.a, (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final f0 asDoubleStream() {
        return new u(this, 0, (byte) 3);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new w(this, 0, (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.b0 average() {
        long j = ((long[]) collect(new q((byte) 25), new q((byte) 26), new q((byte) 27)))[0];
        return j > 0 ? new j$.util.b0(r4[1] / j) : j$.util.b0.c;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new v(this, b7.t, (byte) 2);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new s(this, 0, new q((byte) 29), (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = z8.a;
        Objects.requireNonNull(null);
        return new g6(this, z8.b, (byte) 2);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, (byte) 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(rVar);
        return C(new b4(c7.INT_VALUE, rVar, objIntConsumer, supplier, (byte) 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) C(new d4((byte) 3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((f5) boxed()).distinct().mapToInt(new q((byte) 28));
    }

    @Override // j$.util.stream.IntStream
    public final f0 f() {
        Objects.requireNonNull(null);
        return new u(this, b7.p | b7.n, (byte) 4);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 findAny() {
        return (j$.util.c0) C(i0.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 findFirst() {
        return (j$.util.c0) C(i0.c);
    }

    @Override // j$.util.stream.IntStream
    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new p0(intConsumer, false));
    }

    @Override // j$.util.stream.IntStream
    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new p0(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final LongStream i() {
        Objects.requireNonNull(null);
        return new w(this, b7.p | b7.n, (byte) 2);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.l0 iterator() {
        j$.util.x0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.g1(spliterator);
    }

    @Override // j$.util.stream.IntStream
    public final boolean l() {
        return ((Boolean) C(w3.S(u1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return w3.T(this, 0L, j);
        }
        j$.time.g.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        Objects.requireNonNull(intUnaryOperator);
        return new w0(this, b7.p | b7.n, intUnaryOperator, (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new s(this, b7.p | b7.n, intFunction, (byte) 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 max() {
        return reduce(new q((byte) 24));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 min() {
        return reduce(new q((byte) 20));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream o(n0 n0Var) {
        Objects.requireNonNull(n0Var);
        return new w0(this, b7.p | b7.n | b7.t, n0Var, (byte) 2);
    }

    @Override // j$.util.stream.IntStream
    public final boolean p() {
        return ((Boolean) C(w3.S(u1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new w0(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) C(new m4(c7.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w3.T(this, j, -1L);
        }
        j$.time.g.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new g6(this, b7.q | b7.o, (byte) 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.x0 spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new q((byte) 23));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new j$.time.format.a((byte) 14), new q((byte) 21), new q((byte) 22));
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) w3.K((d2) D(new q((byte) 19))).b();
    }

    @Override // j$.util.stream.IntStream
    public final boolean v() {
        return ((Boolean) C(w3.S(u1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.c0 reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.c0) C(new z3(c7.INT_VALUE, intBinaryOperator, (byte) 3));
    }
}
