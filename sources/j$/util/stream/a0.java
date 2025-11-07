package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
abstract class a0 extends b implements IntStream {
    @Override // j$.util.stream.IntStream
    public final j$.util.B findAny() {
        return (j$.util.B) C(G.d);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B findFirst() {
        return (j$.util.B) C(G.c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new F2(this, a3.q | a3.o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new M(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new M(intConsumer, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j$.util.Y Y(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Y) {
            return (j$.util.Y) spliterator;
        }
        if (J3.a) {
            J3.a(b.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.b
    final b3 H() {
        return b3.INT_VALUE;
    }

    @Override // j$.util.stream.b
    final I0 E(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return w0.G(bVar, spliterator, z);
    }

    @Override // j$.util.stream.b
    final Spliterator T(b bVar, Supplier supplier, boolean z) {
        return new n3(bVar, supplier, z);
    }

    @Override // j$.util.stream.b
    final boolean G(Spliterator spliterator, m2 m2Var) {
        IntConsumer t;
        boolean n;
        j$.util.Y Y = Y(spliterator);
        if (m2Var instanceof IntConsumer) {
            t = (IntConsumer) m2Var;
        } else {
            if (J3.a) {
                J3.a(b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(m2Var);
            t = new T(m2Var);
        }
        do {
            n = m2Var.n();
            if (n) {
                break;
            }
        } while (Y.tryAdvance(t));
        return n;
    }

    @Override // j$.util.stream.b
    final A0 M(long j, IntFunction intFunction) {
        return w0.S(j);
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.K iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.b, j$.util.stream.BaseStream, j$.util.stream.D
    public final j$.util.Y spliterator() {
        return Y(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new v(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final D asDoubleStream() {
        return new t(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new s(this, 0, new k(20), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream d() {
        Objects.requireNonNull(null);
        return new u(this, a3.p | a3.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new s(this, a3.p | a3.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream l() {
        Objects.requireNonNull(null);
        return new v(this, a3.p | a3.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final D f() {
        Objects.requireNonNull(null);
        return new t(this, a3.p | a3.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) C(new N1(b3.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream p(O0 o0) {
        Objects.requireNonNull(o0);
        return new V(this, a3.p | a3.n | a3.t, o0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (j$.util.B) C(new A1(b3.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new u(this, a3.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new V(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return w0.Y(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w0.Y(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = i4.a;
        Objects.requireNonNull(null);
        return new O3(this, i4.a, 0);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = i4.a;
        Objects.requireNonNull(null);
        return new Q3(this, i4.b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) C(new E1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((e2) boxed()).distinct().mapToInt(new k(19));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new k(24));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B min() {
        return reduce(new k(21));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.B max() {
        return reduce(new k(25));
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.A average() {
        long j = ((long[]) collect(new k(26), new k(27), new k(28)))[0];
        return j > 0 ? j$.util.A.d(r0[1] / j) : j$.util.A.a();
    }

    @Override // j$.util.stream.IntStream
    public final j$.util.x summaryStatistics() {
        return (j$.util.x) collect(new j(24), new k(22), new k(23));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        q qVar = new q(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(qVar);
        return C(new C1(b3.INT_VALUE, qVar, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) C(w0.Z(t0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean u() {
        return ((Boolean) C(w0.Z(t0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) C(w0.Z(t0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) w0.P((E0) D(new k(18))).d();
    }
}
