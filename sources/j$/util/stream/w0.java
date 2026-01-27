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
public abstract /* synthetic */ class w0 implements G3 {
    private static final b1 a = new b1();
    private static final E0 b = new Z0();
    private static final G0 c = new a1();
    private static final C0 d = new Y0();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    static long B(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    @Override // j$.util.stream.G3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract S1 e0();

    public static a R(Function function) {
        a aVar = new a(9);
        aVar.b = function;
        return aVar;
    }

    static long A(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static Stream f0(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new c2(spliterator, a3.l(spliterator), z);
    }

    static Spliterator C(b3 b3Var, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = v2.a[b3Var.ordinal()];
        if (i == 1) {
            return new u3(spliterator, j, j4);
        }
        if (i == 2) {
            return new r3((j$.util.Z) spliterator, j, j4);
        }
        if (i == 3) {
            return new s3((j$.util.c0) spliterator, j, j4);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + b3Var);
        }
        return new q3((j$.util.W) spliterator, j, j4);
    }

    public static u0 c0(t0 t0Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(t0Var);
        return new u0(b3.REFERENCE, t0Var, new n0(0, t0Var, predicate));
    }

    static c1 L(b3 b3Var) {
        int i = J0.a[b3Var.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return (c1) b;
        }
        if (i == 3) {
            return (c1) c;
        }
        if (i == 4) {
            return (c1) d;
        }
        throw new IllegalStateException("Unknown shape " + b3Var);
    }

    public static u0 Z(t0 t0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(t0Var);
        return new u0(b3.INT_VALUE, t0Var, new m0(t0Var, 1));
    }

    public static Stream d0(e2 e2Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new o2(e2Var, M(j2), j, j2);
    }

    public static I0 w(I0 i0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == i0.count()) {
            return i0;
        }
        Spliterator spliterator = i0.spliterator();
        long j3 = j2 - j;
        A0 D = D(j3, intFunction);
        D.l(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new b0(10)); i++) {
        }
        if (j2 == i0.count()) {
            spliterator.forEachRemaining(D);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(D); i2++) {
            }
        }
        D.k();
        return D.a();
    }

    static K0 I(b3 b3Var, I0 i0, I0 i02) {
        int i = J0.a[b3Var.ordinal()];
        if (i == 1) {
            return new U0(i0, i02);
        }
        if (i == 2) {
            return new R0((E0) i0, (E0) i02);
        }
        if (i == 3) {
            return new S0((G0) i0, (G0) i02);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + b3Var);
        }
        return new Q0((C0) i0, (C0) i02);
    }

    public static IntStream T(j$.util.Z z) {
        return new Y(z, a3.l(z), false);
    }

    public static u0 b0(t0 t0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(t0Var);
        return new u0(b3.LONG_VALUE, t0Var, new m0(t0Var, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static u0 X(t0 t0Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(t0Var);
        return new u0(b3.DOUBLE_VALUE, t0Var, new m0(t0Var, 2));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    static A0 D(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new d1(j, intFunction);
        }
        return new v1();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(k2 k2Var, Integer num) {
        if (J3.a) {
            J3.a(k2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        k2Var.accept(num.intValue());
    }

    public static LongStream V(j$.util.c0 c0Var) {
        return new h0(c0Var, a3.l(c0Var), false);
    }

    public static void i(l2 l2Var, Long l) {
        if (J3.a) {
            J3.a(l2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        l2Var.accept(l.longValue());
    }

    static y0 S(long j) {
        if (j < 0 || j >= 2147483639) {
            return new g1();
        }
        return new f1(j);
    }

    public static void e(j2 j2Var, Double d2) {
        if (J3.a) {
            J3.a(j2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        j2Var.accept(d2.doubleValue());
    }

    public static IntStream Y(a0 a0Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new q2(a0Var, M(j2), j, j2);
    }

    static z0 U(long j) {
        if (j < 0 || j >= 2147483639) {
            return new p1();
        }
        return new o1(j);
    }

    public static Object[] m(H0 h0, IntFunction intFunction) {
        if (J3.a) {
            J3.a(h0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (h0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) h0.count());
        h0.i(objArr, 0);
        return objArr;
    }

    public static D K(j$.util.W w) {
        return new y(w, a3.l(w), false);
    }

    static x0 J(long j) {
        if (j < 0 || j >= 2147483639) {
            return new X0();
        }
        return new W0(j);
    }

    public static I0 E(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long F = bVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            O0 o0 = new O0();
            o0.a = intFunction;
            I0 i0 = (I0) new N0(bVar, spliterator, o0, new j(18), 3).invoke();
            return z ? N(i0, intFunction) : i0;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) F);
        new t1(spliterator, bVar, objArr).invoke();
        return new L0(objArr);
    }

    public static void r(E0 e0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e0.e((IntConsumer) consumer);
        } else {
            if (J3.a) {
                J3.a(e0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Z) e0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static LongStream a0(j0 j0Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new s2(j0Var, M(j2), j, j2);
    }

    public static void o(E0 e0, Integer[] numArr, int i) {
        if (J3.a) {
            J3.a(e0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) e0.d();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static E0 u(E0 e0, long j, long j2) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        long j3 = j2 - j;
        j$.util.Z z = (j$.util.Z) e0.spliterator();
        y0 S = S(j3);
        S.l(j3);
        for (int i = 0; i < j && z.tryAdvance((IntConsumer) new D0(0)); i++) {
        }
        if (j2 == e0.count()) {
            z.forEachRemaining((IntConsumer) S);
        } else {
            for (int i2 = 0; i2 < j3 && z.tryAdvance((IntConsumer) S); i2++) {
            }
        }
        S.k();
        return S.a();
    }

    public static E0 G(b bVar, Spliterator spliterator, boolean z) {
        long F = bVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e0 = (E0) new N0(bVar, spliterator, new j(14), new j(15), 1).invoke();
            return z ? P(e0) : e0;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) F];
        new r1(spliterator, bVar, iArr).invoke();
        return new e1(iArr);
    }

    public static G0 H(b bVar, Spliterator spliterator, boolean z) {
        long F = bVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            G0 g0 = (G0) new N0(bVar, spliterator, new j(16), new j(17), 2).invoke();
            return z ? Q(g0) : g0;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) F];
        new s1(spliterator, bVar, jArr).invoke();
        return new n1(jArr);
    }

    public static void s(G0 g0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g0.e((LongConsumer) consumer);
        } else {
            if (J3.a) {
                J3.a(g0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.c0) g0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(G0 g0, Long[] lArr, int i) {
        if (J3.a) {
            J3.a(g0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) g0.d();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static G0 v(G0 g0, long j, long j2) {
        if (j == 0 && j2 == g0.count()) {
            return g0;
        }
        long j3 = j2 - j;
        j$.util.c0 c0Var = (j$.util.c0) g0.spliterator();
        z0 U = U(j3);
        U.l(j3);
        for (int i = 0; i < j && c0Var.tryAdvance((LongConsumer) new F0(0)); i++) {
        }
        if (j2 == g0.count()) {
            c0Var.forEachRemaining((LongConsumer) U);
        } else {
            for (int i2 = 0; i2 < j3 && c0Var.tryAdvance((LongConsumer) U); i2++) {
            }
        }
        U.k();
        return U.a();
    }

    public static C0 F(b bVar, Spliterator spliterator, boolean z) {
        long F = bVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(16384)) {
            C0 c0 = (C0) new N0(bVar, spliterator, new j(12), new j(13), 0).invoke();
            return z ? O(c0) : c0;
        }
        if (F >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) F];
        new q1(spliterator, bVar, dArr).invoke();
        return new V0(dArr);
    }

    public static D W(A a2, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new u2(a2, M(j2), j, j2);
    }

    public static I0 N(I0 i0, IntFunction intFunction) {
        if (i0.q() <= 0) {
            return i0;
        }
        long count = i0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new x1(i0, objArr, 1).invoke();
        return new L0(objArr);
    }

    public static void q(C0 c0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            c0.e((DoubleConsumer) consumer);
        } else {
            if (J3.a) {
                J3.a(c0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.W) c0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static E0 P(E0 e0) {
        if (e0.q() <= 0) {
            return e0;
        }
        long count = e0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new w1(e0, iArr, 0).invoke();
        return new e1(iArr);
    }

    public static void n(C0 c0, Double[] dArr, int i) {
        if (J3.a) {
            J3.a(c0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) c0.d();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static C0 t(C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        j$.util.W w = (j$.util.W) c0.spliterator();
        x0 J = J(j3);
        J.l(j3);
        for (int i = 0; i < j && w.tryAdvance((DoubleConsumer) new B0(0)); i++) {
        }
        if (j2 == c0.count()) {
            w.forEachRemaining((DoubleConsumer) J);
        } else {
            for (int i2 = 0; i2 < j3 && w.tryAdvance((DoubleConsumer) J); i2++) {
            }
        }
        J.k();
        return J.a();
    }

    public static G0 Q(G0 g0) {
        if (g0.q() <= 0) {
            return g0;
        }
        long count = g0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new w1(g0, jArr, 0).invoke();
        return new n1(jArr);
    }

    private static int M(long j) {
        return (j != -1 ? a3.u : 0) | a3.t;
    }

    public static C0 O(C0 c0) {
        if (c0.q() <= 0) {
            return c0;
        }
        long count = c0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new w1(c0, dArr, 0).invoke();
        return new V0(dArr);
    }

    @Override // j$.util.stream.G3
    public Object b(b bVar, Spliterator spliterator) {
        S1 e0 = e0();
        bVar.U(spliterator, e0);
        return e0.get();
    }

    @Override // j$.util.stream.G3
    public Object c(b bVar, Spliterator spliterator) {
        return ((S1) new Z1(this, bVar, spliterator).invoke()).get();
    }
}
