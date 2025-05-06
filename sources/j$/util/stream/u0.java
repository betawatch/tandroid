package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;
import org.telegram.messenger.LiteMode;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class u0 implements w3 {
    private static final Y0 a = new Y0();
    private static final C0 b = new W0();
    private static final E0 c = new X0();
    private static final A0 d = new V0();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    u0(S2 s2) {
    }

    static y0 D(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new s1() : new a1(j, intFunction);
    }

    public static G0 E(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long l0 = bVar.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            G0 g0 = (G0) new L0(spliterator, intFunction, bVar).invoke();
            return z ? N(g0, intFunction) : g0;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) l0);
        new q1(spliterator, bVar, objArr).invoke();
        return new J0(objArr);
    }

    public static A0 F(b bVar, Spliterator spliterator, boolean z) {
        long l0 = bVar.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            A0 a0 = (A0) new L0(0, spliterator, bVar).invoke();
            return z ? O(a0) : a0;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) l0];
        new n1(spliterator, bVar, dArr).invoke();
        return new S0(dArr);
    }

    public static C0 G(b bVar, Spliterator spliterator, boolean z) {
        long l0 = bVar.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            C0 c0 = (C0) new L0(1, spliterator, bVar).invoke();
            return z ? P(c0) : c0;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) l0];
        new o1(spliterator, bVar, iArr).invoke();
        return new b1(iArr);
    }

    public static E0 H(b bVar, Spliterator spliterator, boolean z) {
        long l0 = bVar.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM)) {
            E0 e0 = (E0) new L0(2, spliterator, bVar).invoke();
            return z ? Q(e0) : e0;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) l0];
        new p1(spliterator, bVar, jArr).invoke();
        return new k1(jArr);
    }

    static I0 I(S2 s2, G0 g0, G0 g02) {
        int i = H0.a[s2.ordinal()];
        if (i == 1) {
            return new R0(g0, g02);
        }
        if (i == 2) {
            return new O0((C0) g0, (C0) g02);
        }
        if (i == 3) {
            return new P0((E0) g0, (E0) g02);
        }
        if (i == 4) {
            return new N0((A0) g0, (A0) g02);
        }
        throw new IllegalStateException("Unknown shape " + s2);
    }

    static v0 J(long j) {
        return (j < 0 || j >= 2147483639) ? new U0() : new T0(j);
    }

    public static E K(j$.util.D d2) {
        return new z(d2, R2.c(d2));
    }

    static Z0 L(S2 s2) {
        G0 g0;
        int i = H0.a[s2.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            g0 = b;
        } else if (i == 3) {
            g0 = c;
        } else {
            if (i != 4) {
                throw new IllegalStateException("Unknown shape " + s2);
            }
            g0 = d;
        }
        return (Z0) g0;
    }

    private static int M(long j) {
        return (j != -1 ? R2.u : 0) | R2.t;
    }

    public static G0 N(G0 g0, IntFunction intFunction) {
        if (g0.p() <= 0) {
            return g0;
        }
        long count = g0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new u1(g0, objArr, 1).invoke();
        return new J0(objArr);
    }

    public static A0 O(A0 a0) {
        if (a0.p() <= 0) {
            return a0;
        }
        long count = a0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new t1(a0, dArr).invoke();
        return new S0(dArr);
    }

    public static C0 P(C0 c0) {
        if (c0.p() <= 0) {
            return c0;
        }
        long count = c0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new t1(c0, iArr).invoke();
        return new b1(iArr);
    }

    public static E0 Q(E0 e0) {
        if (e0.p() <= 0) {
            return e0;
        }
        long count = e0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new t1(e0, jArr).invoke();
        return new k1(jArr);
    }

    static w0 R(long j) {
        return (j < 0 || j >= 2147483639) ? new d1() : new c1(j);
    }

    public static IntStream S(j$.util.G g2) {
        return new Z(g2, R2.c(g2));
    }

    static x0 T(long j) {
        return (j < 0 || j >= 2147483639) ? new m1() : new l1(j);
    }

    public static LongStream U(j$.util.J j) {
        return new g0(j, R2.c(j));
    }

    public static E V(b bVar, long j, long j2) {
        if (j >= 0) {
            return new m2(bVar, M(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static s0 W(j$.util.function.q qVar, r0 r0Var) {
        qVar.getClass();
        r0Var.getClass();
        return new s0(S2.DOUBLE_VALUE, r0Var, new l0(2, r0Var, qVar));
    }

    public static IntStream X(b bVar, long j, long j2) {
        if (j >= 0) {
            return new i2(bVar, M(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static s0 Y(j$.util.function.G g2, r0 r0Var) {
        g2.getClass();
        r0Var.getClass();
        return new s0(S2.INT_VALUE, r0Var, new l0(1, r0Var, g2));
    }

    public static LongStream Z(b bVar, long j, long j2) {
        if (j >= 0) {
            return new k2(bVar, M(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static s0 a0(j$.util.function.W w, r0 r0Var) {
        w.getClass();
        r0Var.getClass();
        return new s0(S2.LONG_VALUE, r0Var, new l0(0, r0Var, w));
    }

    public static void b() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static s0 b0(Predicate predicate, r0 r0Var) {
        predicate.getClass();
        r0Var.getClass();
        return new s0(S2.REFERENCE, r0Var, new l0(3, r0Var, predicate));
    }

    public static Stream c0(b bVar, long j, long j2) {
        if (j >= 0) {
            return new g2(bVar, M(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static void e(b2 b2Var, Double d2) {
        if (z3.a) {
            z3.a(b2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        b2Var.accept(d2.doubleValue());
    }

    public static Stream e0(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new U1(spliterator, R2.c(spliterator), z);
    }

    public static void g(c2 c2Var, Integer num) {
        if (z3.a) {
            z3.a(c2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        c2Var.accept(num.intValue());
    }

    public static void i(d2 d2Var, Long l) {
        if (z3.a) {
            z3.a(d2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        d2Var.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(F0 f0, IntFunction intFunction) {
        if (z3.a) {
            z3.a(f0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (f0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) f0.count());
        f0.i(objArr, 0);
        return objArr;
    }

    public static void n(A0 a0, Double[] dArr, int i) {
        if (z3.a) {
            z3.a(a0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) a0.e();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(C0 c0, Integer[] numArr, int i) {
        if (z3.a) {
            z3.a(c0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) c0.e();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(E0 e0, Long[] lArr, int i) {
        if (z3.a) {
            z3.a(e0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) e0.e();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(A0 a0, Consumer consumer) {
        if (consumer instanceof j$.util.function.m) {
            a0.g((j$.util.function.m) consumer);
        } else {
            if (z3.a) {
                z3.a(a0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.D) a0.spliterator()).a(consumer);
        }
    }

    public static void r(C0 c0, Consumer consumer) {
        if (consumer instanceof j$.util.function.E) {
            c0.g((j$.util.function.E) consumer);
        } else {
            if (z3.a) {
                z3.a(c0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.G) c0.spliterator()).a(consumer);
        }
    }

    public static void s(E0 e0, Consumer consumer) {
        if (consumer instanceof j$.util.function.T) {
            e0.g((j$.util.function.T) consumer);
        } else {
            if (z3.a) {
                z3.a(e0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.J) e0.spliterator()).a(consumer);
        }
    }

    public static A0 t(A0 a0, long j, long j2) {
        if (j == 0 && j2 == a0.count()) {
            return a0;
        }
        long j3 = j2 - j;
        j$.util.D d2 = (j$.util.D) a0.spliterator();
        v0 J = J(j3);
        J.n(j3);
        for (int i = 0; i < j && d2.p(new z0(0)); i++) {
        }
        for (int i2 = 0; i2 < j3 && d2.p(J); i2++) {
        }
        J.m();
        return J.b();
    }

    public static C0 u(C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        j$.util.G g2 = (j$.util.G) c0.spliterator();
        w0 R = R(j3);
        R.n(j3);
        for (int i = 0; i < j && g2.p(new B0(0)); i++) {
        }
        for (int i2 = 0; i2 < j3 && g2.p(R); i2++) {
        }
        R.m();
        return R.b();
    }

    public static E0 v(E0 e0, long j, long j2) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        long j3 = j2 - j;
        j$.util.J j4 = (j$.util.J) e0.spliterator();
        x0 T = T(j3);
        T.n(j3);
        for (int i = 0; i < j && j4.p(new D0(0)); i++) {
        }
        for (int i2 = 0; i2 < j3 && j4.p(T); i2++) {
        }
        T.m();
        return T.b();
    }

    public static G0 w(G0 g0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == g0.count()) {
            return g0;
        }
        Spliterator spliterator = g0.spliterator();
        long j3 = j2 - j;
        y0 D = D(j3, intFunction);
        D.n(j3);
        for (int i = 0; i < j && spliterator.s(new d0(3)); i++) {
        }
        for (int i2 = 0; i2 < j3 && spliterator.s(D); i2++) {
        }
        D.m();
        return D.b();
    }

    static long x(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    static Spliterator y(S2 s2, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = n2.a[s2.ordinal()];
        if (i == 1) {
            return new l3(spliterator, j, j4);
        }
        if (i == 2) {
            return new i3((j$.util.G) spliterator, j, j4);
        }
        if (i == 3) {
            return new j3((j$.util.J) spliterator, j, j4);
        }
        if (i == 4) {
            return new h3((j$.util.D) spliterator, j, j4);
        }
        throw new IllegalStateException("Unknown shape " + s2);
    }

    static long z(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    @Override // j$.util.stream.w3
    public Object a(b bVar, Spliterator spliterator) {
        O1 d0 = d0();
        bVar.getClass();
        bVar.f0(spliterator, bVar.B0(d0));
        return d0.get();
    }

    @Override // j$.util.stream.w3
    public Object c(b bVar, Spliterator spliterator) {
        return ((O1) new Q1(this, bVar, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.w3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract O1 d0();
}
