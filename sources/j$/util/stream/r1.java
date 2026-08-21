package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;

/* loaded from: classes2.dex */
public abstract class r1 implements y3 {
    public static final U0 a = new U0();
    public static final S0 b = new S0();
    public static final T0 c = new T0();
    public static final R0 d = new R0();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract M1 Z();

    @Override // j$.util.stream.y3
    public /* synthetic */ int d() {
        return 0;
    }

    public static j$.time.t O(Function function) {
        j$.time.t tVar = new j$.time.t(7);
        tVar.b = function;
        return tVar;
    }

    public static Set N(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof g) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    g gVar = (g) it.next();
                    hashSet.add(gVar == null ? null : gVar == g.CONCURRENT ? Collector.Characteristics.CONCURRENT : gVar == g.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e2) {
                    j$.util.e.a("java.util.stream.Collector.Characteristics", e2);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                j$.util.e.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it2.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? g.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? g.UNORDERED : g.IDENTITY_FINISH);
                } catch (ClassCastException e3) {
                    j$.util.e.a("java.util.stream.Collector.Characteristics", e3);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static long x(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static long A(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static W1 a0(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new W1(spliterator, S2.p(spliterator), z);
    }

    public static Spliterator y(T2 t2, Spliterator spliterator, long j, long j2) {
        long A = A(j, j2);
        int i = p2.a[t2.ordinal()];
        if (i == 1) {
            return new m3(spliterator, j, A);
        }
        if (i == 2) {
            return new j3((j$.util.W) spliterator, j, A);
        }
        if (i == 3) {
            return new k3((j$.util.Z) spliterator, j, A);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + t2);
        }
        return new i3((j$.util.T) spliterator, j, A);
    }

    public static j$.util.concurrent.t X(p0 p0Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(p0Var);
        return new j$.util.concurrent.t(T2.REFERENCE, p0Var, new j$.util.concurrent.t(5, p0Var, predicate));
    }

    public static V0 H(T2 t2) {
        int i = D0.a[t2.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + t2);
    }

    public static j$.util.concurrent.t T(p0 p0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(p0Var);
        return new j$.util.concurrent.t(T2.INT_VALUE, p0Var, new j0(p0Var, 1));
    }

    public static i2 Y(Y1 y1, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new i2(y1, I(j2), j, j2);
    }

    public static C0 w(C0 c0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        Spliterator spliterator = c0.spliterator();
        long j3 = j2 - j;
        u0 z = z(j3, intFunction);
        z.y(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new Z(11)); i++) {
        }
        if (j2 == c0.count()) {
            spliterator.forEachRemaining(z);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(z); i2++) {
            }
        }
        z.x();
        return z.a();
    }

    public static E0 F(T2 t2, C0 c0, C0 c02) {
        int i = D0.a[t2.ordinal()];
        if (i == 1) {
            return new N0(c0, c02);
        }
        if (i == 2) {
            return new K0((y0) c0, (y0) c02);
        }
        if (i == 3) {
            return new L0((A0) c0, (A0) c02);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + t2);
        }
        return new J0((w0) c0, (w0) c02);
    }

    public static j$.util.concurrent.t V(p0 p0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(p0Var);
        return new j$.util.concurrent.t(T2.LONG_VALUE, p0Var, new j0(p0Var, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.t R(p0 p0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(p0Var);
        return new j$.util.concurrent.t(T2.DOUBLE_VALUE, p0Var, new j0(p0Var, 2));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static u0 z(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new W0(j, intFunction);
        }
        return new o1();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(e2 e2Var, Integer num) {
        if (A3.a) {
            A3.a(e2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        e2Var.accept(num.intValue());
    }

    public static void i(f2 f2Var, Long l) {
        if (A3.a) {
            A3.a(f2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        f2Var.accept(l.longValue());
    }

    public static s0 P(long j) {
        if (j < 0 || j >= 2147483639) {
            return new Z0();
        }
        return new Y0(j);
    }

    public static void e(d2 d2Var, Double d2) {
        if (A3.a) {
            A3.a(d2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        d2Var.accept(d2.doubleValue());
    }

    public static k2 U(Y y, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new k2(y, I(j2), j, j2);
    }

    public static t0 Q(long j) {
        if (j < 0 || j >= 2147483639) {
            return new i1();
        }
        return new h1(j);
    }

    public static Object[] m(B0 b0, IntFunction intFunction) {
        if (A3.a) {
            A3.a(b0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (b0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) b0.count());
        b0.g(objArr, 0);
        return objArr;
    }

    public static r0 G(long j) {
        if (j < 0 || j >= 2147483639) {
            return new Q0();
        }
        return new P0(j);
    }

    public static C0 B(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            J j = new J();
            j.a = intFunction;
            C0 c0 = (C0) new H0(aVar, spliterator, j, new Z(19), 3).invoke();
            return z ? J(c0, intFunction) : c0;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) F);
        new m1(spliterator, aVar, objArr).invoke();
        return new F0(objArr);
    }

    public static void r(y0 y0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            y0Var.e((IntConsumer) consumer);
        } else {
            if (A3.a) {
                A3.a(y0Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.W) y0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static m2 W(g0 g0Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new m2(g0Var, I(j2), j, j2);
    }

    public static void o(y0 y0Var, Integer[] numArr, int i) {
        if (A3.a) {
            A3.a(y0Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) y0Var.d();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static y0 u(y0 y0Var, long j, long j2) {
        if (j == 0 && j2 == y0Var.count()) {
            return y0Var;
        }
        long j3 = j2 - j;
        j$.util.W w = (j$.util.W) y0Var.spliterator();
        s0 P = P(j3);
        P.y(j3);
        for (int i = 0; i < j && w.tryAdvance((IntConsumer) new x0(0)); i++) {
        }
        if (j2 == y0Var.count()) {
            w.forEachRemaining((IntConsumer) P);
        } else {
            for (int i2 = 0; i2 < j3 && w.tryAdvance((IntConsumer) P); i2++) {
            }
        }
        P.x();
        return P.a();
    }

    public static y0 D(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            y0 y0Var = (y0) new H0(aVar, spliterator, new Z(15), new Z(16), 1).invoke();
            return z ? L(y0Var) : y0Var;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) F];
        new k1(spliterator, aVar, iArr).invoke();
        return new X0(iArr);
    }

    public static A0 E(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            A0 a0 = (A0) new H0(aVar, spliterator, new Z(17), new Z(18), 2).invoke();
            return z ? M(a0) : a0;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) F];
        new l1(spliterator, aVar, jArr).invoke();
        return new g1(jArr);
    }

    public static void s(A0 a0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            a0.e((LongConsumer) consumer);
        } else {
            if (A3.a) {
                A3.a(a0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Z) a0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(A0 a0, Long[] lArr, int i) {
        if (A3.a) {
            A3.a(a0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) a0.d();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static A0 v(A0 a0, long j, long j2) {
        if (j == 0 && j2 == a0.count()) {
            return a0;
        }
        long j3 = j2 - j;
        j$.util.Z z = (j$.util.Z) a0.spliterator();
        t0 Q = Q(j3);
        Q.y(j3);
        for (int i = 0; i < j && z.tryAdvance((LongConsumer) new z0(0)); i++) {
        }
        if (j2 == a0.count()) {
            z.forEachRemaining((LongConsumer) Q);
        } else {
            for (int i2 = 0; i2 < j3 && z.tryAdvance((LongConsumer) Q); i2++) {
            }
        }
        Q.x();
        return Q.a();
    }

    public static w0 C(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            w0 w0Var = (w0) new H0(aVar, spliterator, new Z(13), new Z(14), 0).invoke();
            return z ? K(w0Var) : w0Var;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) F];
        new j1(spliterator, aVar, dArr).invoke();
        return new O0(dArr);
    }

    public static o2 S(y yVar, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new o2(yVar, I(j2), j, j2);
    }

    public static C0 J(C0 c0, IntFunction intFunction) {
        if (c0.i() <= 0) {
            return c0;
        }
        long count = c0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new q1(c0, objArr, 1).invoke();
        return new F0(objArr);
    }

    public static void q(w0 w0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            w0Var.e((DoubleConsumer) consumer);
        } else {
            if (A3.a) {
                A3.a(w0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.T) w0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static y0 L(y0 y0Var) {
        if (y0Var.i() <= 0) {
            return y0Var;
        }
        long count = y0Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new p1(y0Var, iArr, 0).invoke();
        return new X0(iArr);
    }

    public static void n(w0 w0Var, Double[] dArr, int i) {
        if (A3.a) {
            A3.a(w0Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) w0Var.d();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static w0 t(w0 w0Var, long j, long j2) {
        if (j == 0 && j2 == w0Var.count()) {
            return w0Var;
        }
        long j3 = j2 - j;
        j$.util.T t = (j$.util.T) w0Var.spliterator();
        r0 G = G(j3);
        G.y(j3);
        for (int i = 0; i < j && t.tryAdvance((DoubleConsumer) new v0(0)); i++) {
        }
        if (j2 == w0Var.count()) {
            t.forEachRemaining((DoubleConsumer) G);
        } else {
            for (int i2 = 0; i2 < j3 && t.tryAdvance((DoubleConsumer) G); i2++) {
            }
        }
        G.x();
        return G.a();
    }

    public static A0 M(A0 a0) {
        if (a0.i() <= 0) {
            return a0;
        }
        long count = a0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new p1(a0, jArr, 0).invoke();
        return new g1(jArr);
    }

    public static int I(long j) {
        return (j != -1 ? S2.u : 0) | S2.t;
    }

    public static w0 K(w0 w0Var) {
        if (w0Var.i() <= 0) {
            return w0Var;
        }
        long count = w0Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new p1(w0Var, dArr, 0).invoke();
        return new O0(dArr);
    }

    @Override // j$.util.stream.y3
    public Object b(a aVar, Spliterator spliterator) {
        M1 Z = Z();
        aVar.Q(spliterator, Z);
        return Z.get();
    }

    @Override // j$.util.stream.y3
    public Object c(a aVar, Spliterator spliterator) {
        return ((M1) new T1(this, aVar, spliterator).invoke()).get();
    }
}
