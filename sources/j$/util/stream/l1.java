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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public abstract class l1 extends a implements LongStream {
    public static j$.util.a1 T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.a1) {
            return (j$.util.a1) spliterator;
        }
        if (!j8.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        j8.a(a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.a
    public final h2 E(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return w3.D(aVar, spliterator, z);
    }

    @Override // j$.util.stream.a
    public final boolean G(Spliterator spliterator, n5 n5Var) {
        LongConsumer m0Var;
        boolean q;
        j$.util.a1 T = T(spliterator);
        if (n5Var instanceof LongConsumer) {
            m0Var = (LongConsumer) n5Var;
        } else {
            if (j8.a) {
                j8.a(a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(n5Var);
            m0Var = new j$.util.m0(n5Var, (byte) 1);
        }
        do {
            q = n5Var.q();
            if (q) {
                break;
            }
        } while (T.tryAdvance(m0Var));
        return q;
    }

    @Override // j$.util.stream.a
    public final c7 H() {
        return c7.LONG_VALUE;
    }

    @Override // j$.util.stream.a
    public final z1 I(long j, IntFunction intFunction) {
        return w3.P(j);
    }

    @Override // j$.util.stream.a
    public final Spliterator P(a aVar, Supplier supplier, boolean z) {
        return new q7(aVar, supplier, z);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        int i = z8.a;
        Objects.requireNonNull(null);
        return new h6(this, z8.a, (byte) 1);
    }

    @Override // j$.util.stream.LongStream
    public final f0 asDoubleStream() {
        return new u(this, b7.n, (byte) 5);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.b0 average() {
        long j = ((long[]) collect(new d1((byte) 4), new d1((byte) 5), new d1((byte) 6)))[0];
        return j > 0 ? new j$.util.b0(r4[1] / j) : j$.util.b0.c;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b() {
        Objects.requireNonNull(null);
        return new w(this, b7.t, (byte) 5);
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new s(this, 0, new d1((byte) 3), (byte) 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        int i = z8.a;
        Objects.requireNonNull(null);
        return new h6(this, z8.b, (byte) 2);
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        r rVar = new r(biConsumer, (byte) 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(rVar);
        return C(new b4(c7.LONG_VALUE, rVar, objLongConsumer, supplier, (byte) 0));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) C(new d4((byte) 0))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d(j$.time.v vVar) {
        Objects.requireNonNull(vVar);
        return new h1(this, b7.p | b7.n | b7.t, vVar, (byte) 0);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((f5) boxed()).distinct().mapToLong(new d1((byte) 10));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream e() {
        Objects.requireNonNull(null);
        return new w(this, b7.p | b7.n, (byte) 3);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 findAny() {
        return (j$.util.d0) C(j0.d);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 findFirst() {
        return (j$.util.d0) C(j0.c);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new q0(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new q0(longConsumer, true));
    }

    @Override // j$.util.stream.LongStream
    public final f0 h() {
        Objects.requireNonNull(null);
        return new u(this, b7.p | b7.n, (byte) 6);
    }

    @Override // j$.util.stream.BaseStream
    public final j$.util.p0 iterator() {
        j$.util.a1 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.h1(spliterator);
    }

    @Override // j$.util.stream.LongStream
    public final boolean j() {
        return ((Boolean) C(w3.U(u1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j >= 0) {
            return w3.V(this, 0L, j);
        }
        j$.time.g.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final boolean m() {
        return ((Boolean) C(w3.U(u1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new s(this, b7.p | b7.n, longFunction, (byte) 2);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 max() {
        return reduce(new d1((byte) 7));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 min() {
        return reduce(new d1((byte) 9));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new h1(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) C(new x3(c7.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : w3.V(this, j, -1L);
        }
        j$.time.g.c(Long.toString(j));
        return null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new h6(this, b7.q | b7.o, (byte) 0);
    }

    @Override // j$.util.stream.a, j$.util.stream.BaseStream
    public final j$.util.a1 spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new d1((byte) 8));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.z summaryStatistics() {
        return (j$.util.z) collect(new j$.time.format.a((byte) 17), new d1((byte) 0), new d1((byte) 1));
    }

    @Override // j$.util.stream.LongStream
    public final boolean t() {
        return ((Boolean) C(w3.U(u1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) w3.L((f2) D(new d1((byte) 2))).b();
    }

    @Override // j$.util.stream.LongStream
    public final IntStream x() {
        Objects.requireNonNull(null);
        return new v(this, b7.p | b7.n, (byte) 3);
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.d0 reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.d0) C(new z3(c7.LONG_VALUE, longBinaryOperator, (byte) 0));
    }
}
