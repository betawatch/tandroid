package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public abstract class q1 implements y3 {
    public static final T0 a = new T0();
    public static final R0 b = new R0();
    public static final S0 c = new S0();
    public static final Q0 d = new Q0();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract L1 Y();

    @Override // j$.util.stream.y3
    public /* synthetic */ int d() {
        return 0;
    }

    public static j$.time.t N(Function function) {
        j$.time.t tVar = new j$.time.t(7);
        tVar.b = function;
        return tVar;
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

    public static V1 Z(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new V1(spliterator, S2.p(spliterator), z);
    }

    public static Spliterator y(T2 t2, Spliterator spliterator, long j, long j2) {
        long A = A(j, j2);
        int i = o2.a[t2.ordinal()];
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

    public static j$.util.concurrent.t W(o0 o0Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(o0Var);
        return new j$.util.concurrent.t(T2.REFERENCE, o0Var, new j$.util.concurrent.t(5, o0Var, predicate));
    }

    public static U0 H(T2 t2) {
        int i = C0.a[t2.ordinal()];
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

    public static j$.util.concurrent.t S(o0 o0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(o0Var);
        return new j$.util.concurrent.t(T2.INT_VALUE, o0Var, new i0(o0Var, 1));
    }

    public static h2 X(X1 x1, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new h2(x1, I(j2), j, j2);
    }

    public static B0 w(B0 b0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == b0.count()) {
            return b0;
        }
        Spliterator spliterator = b0.spliterator();
        long j3 = j2 - j;
        t0 z = z(j3, intFunction);
        z.y(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new Y(11)); i++) {
        }
        if (j2 == b0.count()) {
            spliterator.forEachRemaining(z);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(z); i2++) {
            }
        }
        z.x();
        return z.a();
    }

    public static D0 F(T2 t2, B0 b0, B0 b02) {
        int i = C0.a[t2.ordinal()];
        if (i == 1) {
            return new M0(b0, b02);
        }
        if (i == 2) {
            return new J0((x0) b0, (x0) b02);
        }
        if (i == 3) {
            return new K0((z0) b0, (z0) b02);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + t2);
        }
        return new I0((v0) b0, (v0) b02);
    }

    public static j$.util.concurrent.t U(o0 o0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(o0Var);
        return new j$.util.concurrent.t(T2.LONG_VALUE, o0Var, new i0(o0Var, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.t Q(o0 o0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(o0Var);
        return new j$.util.concurrent.t(T2.DOUBLE_VALUE, o0Var, new i0(o0Var, 2));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static t0 z(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new V0(j, intFunction);
        }
        return new n1();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(d2 d2Var, Integer num) {
        if (A3.a) {
            A3.a(d2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        d2Var.accept(num.intValue());
    }

    public static void i(e2 e2Var, Long l) {
        if (A3.a) {
            A3.a(e2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        e2Var.accept(l.longValue());
    }

    public static r0 O(long j) {
        if (j < 0 || j >= 2147483639) {
            return new Y0();
        }
        return new X0(j);
    }

    public static void e(c2 c2Var, Double d2) {
        if (A3.a) {
            A3.a(c2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        c2Var.accept(d2.doubleValue());
    }

    public static j2 T(X x, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new j2(x, I(j2), j, j2);
    }

    public static s0 P(long j) {
        if (j < 0 || j >= 2147483639) {
            return new h1();
        }
        return new g1(j);
    }

    public static Object[] m(A0 a0, IntFunction intFunction) {
        if (A3.a) {
            A3.a(a0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (a0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) a0.count());
        a0.g(objArr, 0);
        return objArr;
    }

    public static q0 G(long j) {
        if (j < 0 || j >= 2147483639) {
            return new P0();
        }
        return new O0(j);
    }

    public static B0 B(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            I i = new I();
            i.a = intFunction;
            B0 b0 = (B0) new G0(aVar, spliterator, i, new Y(19), 3).invoke();
            return z ? J(b0, intFunction) : b0;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) F);
        new l1(spliterator, aVar, objArr).invoke();
        return new E0(objArr);
    }

    public static void r(x0 x0Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            x0Var.e((IntConsumer) consumer);
        } else {
            if (A3.a) {
                A3.a(x0Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.W) x0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static l2 V(f0 f0Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new l2(f0Var, I(j2), j, j2);
    }

    public static void o(x0 x0Var, Integer[] numArr, int i) {
        if (A3.a) {
            A3.a(x0Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) x0Var.d();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static x0 u(x0 x0Var, long j, long j2) {
        if (j == 0 && j2 == x0Var.count()) {
            return x0Var;
        }
        long j3 = j2 - j;
        j$.util.W w = (j$.util.W) x0Var.spliterator();
        r0 O = O(j3);
        O.y(j3);
        for (int i = 0; i < j && w.tryAdvance((IntConsumer) new w0(0)); i++) {
        }
        if (j2 == x0Var.count()) {
            w.forEachRemaining((IntConsumer) O);
        } else {
            for (int i2 = 0; i2 < j3 && w.tryAdvance((IntConsumer) O); i2++) {
            }
        }
        O.x();
        return O.a();
    }

    public static x0 D(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            x0 x0Var = (x0) new G0(aVar, spliterator, new Y(15), new Y(16), 1).invoke();
            return z ? L(x0Var) : x0Var;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) F];
        new j1(spliterator, aVar, iArr).invoke();
        return new W0(iArr);
    }

    public static z0 E(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            z0 z0Var = (z0) new G0(aVar, spliterator, new Y(17), new Y(18), 2).invoke();
            return z ? M(z0Var) : z0Var;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) F];
        new k1(spliterator, aVar, jArr).invoke();
        return new f1(jArr);
    }

    public static void s(z0 z0Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            z0Var.e((LongConsumer) consumer);
        } else {
            if (A3.a) {
                A3.a(z0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Z) z0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(z0 z0Var, Long[] lArr, int i) {
        if (A3.a) {
            A3.a(z0Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) z0Var.d();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static z0 v(z0 z0Var, long j, long j2) {
        if (j == 0 && j2 == z0Var.count()) {
            return z0Var;
        }
        long j3 = j2 - j;
        j$.util.Z z = (j$.util.Z) z0Var.spliterator();
        s0 P = P(j3);
        P.y(j3);
        for (int i = 0; i < j && z.tryAdvance((LongConsumer) new y0(0)); i++) {
        }
        if (j2 == z0Var.count()) {
            z.forEachRemaining((LongConsumer) P);
        } else {
            for (int i2 = 0; i2 < j3 && z.tryAdvance((LongConsumer) P); i2++) {
            }
        }
        P.x();
        return P.a();
    }

    public static v0 C(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            v0 v0Var = (v0) new G0(aVar, spliterator, new Y(13), new Y(14), 0).invoke();
            return z ? K(v0Var) : v0Var;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) F];
        new i1(spliterator, aVar, dArr).invoke();
        return new N0(dArr);
    }

    public static n2 R(x xVar, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new n2(xVar, I(j2), j, j2);
    }

    public static B0 J(B0 b0, IntFunction intFunction) {
        if (b0.i() <= 0) {
            return b0;
        }
        long count = b0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new p1(b0, objArr, 1).invoke();
        return new E0(objArr);
    }

    public static void q(v0 v0Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            v0Var.e((DoubleConsumer) consumer);
        } else {
            if (A3.a) {
                A3.a(v0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.T) v0Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static x0 L(x0 x0Var) {
        if (x0Var.i() <= 0) {
            return x0Var;
        }
        long count = x0Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new o1(x0Var, iArr, 0).invoke();
        return new W0(iArr);
    }

    public static void n(v0 v0Var, Double[] dArr, int i) {
        if (A3.a) {
            A3.a(v0Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) v0Var.d();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static v0 t(v0 v0Var, long j, long j2) {
        if (j == 0 && j2 == v0Var.count()) {
            return v0Var;
        }
        long j3 = j2 - j;
        j$.util.T t = (j$.util.T) v0Var.spliterator();
        q0 G = G(j3);
        G.y(j3);
        for (int i = 0; i < j && t.tryAdvance((DoubleConsumer) new u0(0)); i++) {
        }
        if (j2 == v0Var.count()) {
            t.forEachRemaining((DoubleConsumer) G);
        } else {
            for (int i2 = 0; i2 < j3 && t.tryAdvance((DoubleConsumer) G); i2++) {
            }
        }
        G.x();
        return G.a();
    }

    public static z0 M(z0 z0Var) {
        if (z0Var.i() <= 0) {
            return z0Var;
        }
        long count = z0Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new o1(z0Var, jArr, 0).invoke();
        return new f1(jArr);
    }

    public static int I(long j) {
        return (j != -1 ? S2.u : 0) | S2.t;
    }

    public static v0 K(v0 v0Var) {
        if (v0Var.i() <= 0) {
            return v0Var;
        }
        long count = v0Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new o1(v0Var, dArr, 0).invoke();
        return new N0(dArr);
    }

    @Override // j$.util.stream.y3
    public Object b(a aVar, Spliterator spliterator) {
        L1 Y = Y();
        aVar.Q(spliterator, Y);
        return Y.get();
    }

    @Override // j$.util.stream.y3
    public Object c(a aVar, Spliterator spliterator) {
        return ((L1) new S1(this, aVar, spliterator).invoke()).get();
    }
}
