package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.IntFunction;
import j$.util.function.Predicate;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class t0 implements v3 {
    private static final X0 a = new X0();
    private static final B0 b = new V0();
    private static final D0 c = new W0();
    private static final z0 d = new U0();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    @Override // j$.util.stream.v3
    public /* synthetic */ int d() {
        return 0;
    }

    public abstract N1 d0();

    static long x(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    static long z(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    static Spliterator y(R2 r2, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = m2.a[r2.ordinal()];
        if (i == 1) {
            return new k3(spliterator, j, j4);
        }
        if (i == 2) {
            return new h3((j$.util.G) spliterator, j, j4);
        }
        if (i == 3) {
            return new i3((j$.util.J) spliterator, j, j4);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + r2);
        }
        return new g3((j$.util.D) spliterator, j, j4);
    }

    static Y0 L(R2 r2) {
        int i = G0.a[r2.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return (Y0) b;
        }
        if (i == 3) {
            return (Y0) c;
        }
        if (i == 4) {
            return (Y0) d;
        }
        throw new IllegalStateException("Unknown shape " + r2);
    }

    static H0 I(R2 r2, F0 f0, F0 f02) {
        int i = G0.a[r2.ordinal()];
        if (i == 1) {
            return new Q0(f0, f02);
        }
        if (i == 2) {
            return new N0((B0) f0, (B0) f02);
        }
        if (i == 3) {
            return new O0((D0) f0, (D0) f02);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + r2);
        }
        return new M0((z0) f0, (z0) f02);
    }

    public static Stream c0(V1 v1, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new f2(v1, M(j2), j, j2);
    }

    public static F0 w(F0 f0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == f0.count()) {
            return f0;
        }
        Spliterator spliterator = f0.spliterator();
        long j3 = j2 - j;
        x0 D = D(j3, intFunction);
        D.n(j3);
        for (int i = 0; i < j && spliterator.s(new c0(3)); i++) {
        }
        for (int i2 = 0; i2 < j3 && spliterator.s(D); i2++) {
        }
        D.m();
        return D.b();
    }

    public static IntStream S(j$.util.G g2) {
        return new Y(g2, Q2.h(g2), false);
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    static x0 D(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new Z0(j, intFunction);
        }
        return new r1();
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void b() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(b2 b2Var, Integer num) {
        if (y3.a) {
            y3.a(b2Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        b2Var.accept(num.intValue());
    }

    public static r0 W(j$.util.function.p pVar, q0 q0Var) {
        pVar.getClass();
        q0Var.getClass();
        return new r0(R2.DOUBLE_VALUE, q0Var, new k0(2, q0Var, pVar));
    }

    public static r0 Y(j$.util.function.I i, q0 q0Var) {
        i.getClass();
        q0Var.getClass();
        return new r0(R2.INT_VALUE, q0Var, new k0(1, q0Var, i));
    }

    public static r0 a0(j$.util.function.b0 b0Var, q0 q0Var) {
        b0Var.getClass();
        q0Var.getClass();
        return new r0(R2.LONG_VALUE, q0Var, new k0(0, q0Var, b0Var));
    }

    public static r0 b0(Predicate predicate, q0 q0Var) {
        predicate.getClass();
        q0Var.getClass();
        return new r0(R2.REFERENCE, q0Var, new k0(3, q0Var, predicate));
    }

    public static Stream e0(Spliterator spliterator, boolean z) {
        spliterator.getClass();
        return new T1(spliterator, Q2.h(spliterator), z);
    }

    static v0 R(long j) {
        if (j < 0 || j >= 2147483639) {
            return new c1();
        }
        return new b1(j);
    }

    public static LongStream U(j$.util.J j) {
        return new f0(j, Q2.h(j), false);
    }

    public static void i(c2 c2Var, Long l) {
        if (y3.a) {
            y3.a(c2Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        c2Var.accept(l.longValue());
    }

    public static void e(a2 a2Var, Double d2) {
        if (y3.a) {
            y3.a(a2Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        a2Var.accept(d2.doubleValue());
    }

    public static IntStream X(a0 a0Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new h2(a0Var, M(j2), j, j2);
    }

    static w0 T(long j) {
        if (j < 0 || j >= 2147483639) {
            return new l1();
        }
        return new k1(j);
    }

    public static Object[] m(E0 e0, IntFunction intFunction) {
        if (y3.a) {
            y3.a(e0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (e0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) e0.count());
        e0.i(objArr, 0);
        return objArr;
    }

    public static D K(j$.util.D d2) {
        return new y(d2, Q2.h(d2), false);
    }

    static u0 J(long j) {
        if (j < 0 || j >= 2147483639) {
            return new T0();
        }
        return new S0(j);
    }

    public static F0 E(b bVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long l0 = bVar.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(16384)) {
            F0 f0 = (F0) new K0(bVar, spliterator, new a(intFunction, 1), new j(6)).invoke();
            return z ? N(f0, intFunction) : f0;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) l0);
        new p1(spliterator, bVar, objArr).invoke();
        return new I0(objArr);
    }

    public static void r(B0 b0, Consumer consumer) {
        if (consumer instanceof j$.util.function.G) {
            b0.g((j$.util.function.G) consumer);
        } else {
            if (y3.a) {
                y3.a(b0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.G) b0.spliterator()).a(consumer);
        }
    }

    public static LongStream Z(h0 h0Var, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new j2(h0Var, M(j2), j, j2);
    }

    public static void o(B0 b0, Integer[] numArr, int i) {
        if (y3.a) {
            y3.a(b0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) b0.e();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static B0 u(B0 b0, long j, long j2) {
        if (j == 0 && j2 == b0.count()) {
            return b0;
        }
        long j3 = j2 - j;
        j$.util.G g2 = (j$.util.G) b0.spliterator();
        v0 R = R(j3);
        R.n(j3);
        for (int i = 0; i < j && g2.p(new A0(0)); i++) {
        }
        for (int i2 = 0; i2 < j3 && g2.p(R); i2++) {
        }
        R.m();
        return R.b();
    }

    public static B0 G(b bVar, Spliterator spliterator, boolean z) {
        long l0 = bVar.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(16384)) {
            B0 b0 = (B0) new K0(bVar, spliterator, new k(10), new j(4)).invoke();
            return z ? P(b0) : b0;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) l0];
        new n1(spliterator, bVar, iArr).invoke();
        return new a1(iArr);
    }

    public static D0 H(b bVar, Spliterator spliterator, boolean z) {
        long l0 = bVar.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(16384)) {
            D0 d0 = (D0) new K0(bVar, spliterator, new k(11), new j(5)).invoke();
            return z ? Q(d0) : d0;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) l0];
        new o1(spliterator, bVar, jArr).invoke();
        return new j1(jArr);
    }

    public static void s(D0 d0, Consumer consumer) {
        if (consumer instanceof j$.util.function.Y) {
            d0.g((j$.util.function.Y) consumer);
        } else {
            if (y3.a) {
                y3.a(d0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.J) d0.spliterator()).a(consumer);
        }
    }

    public static void p(D0 d0, Long[] lArr, int i) {
        if (y3.a) {
            y3.a(d0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) d0.e();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static D0 v(D0 d0, long j, long j2) {
        if (j == 0 && j2 == d0.count()) {
            return d0;
        }
        long j3 = j2 - j;
        j$.util.J j4 = (j$.util.J) d0.spliterator();
        w0 T = T(j3);
        T.n(j3);
        for (int i = 0; i < j && j4.p(new C0(0)); i++) {
        }
        for (int i2 = 0; i2 < j3 && j4.p(T); i2++) {
        }
        T.m();
        return T.b();
    }

    public static z0 F(b bVar, Spliterator spliterator, boolean z) {
        long l0 = bVar.l0(spliterator);
        if (l0 < 0 || !spliterator.hasCharacteristics(16384)) {
            z0 z0Var = (z0) new K0(bVar, spliterator, new k(9), new j(3)).invoke();
            return z ? O(z0Var) : z0Var;
        }
        if (l0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) l0];
        new m1(spliterator, bVar, dArr).invoke();
        return new R0(dArr);
    }

    public static D V(A a2, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new l2(a2, M(j2), j, j2);
    }

    public static F0 N(F0 f0, IntFunction intFunction) {
        if (f0.p() <= 0) {
            return f0;
        }
        long count = f0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new t1(f0, objArr, 1).invoke();
        return new I0(objArr);
    }

    public static void q(z0 z0Var, Consumer consumer) {
        if (consumer instanceof j$.util.function.l) {
            z0Var.g((j$.util.function.l) consumer);
        } else {
            if (y3.a) {
                y3.a(z0Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.D) z0Var.spliterator()).a(consumer);
        }
    }

    public static B0 P(B0 b0) {
        if (b0.p() <= 0) {
            return b0;
        }
        long count = b0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new s1(b0, iArr, 0).invoke();
        return new a1(iArr);
    }

    public static void n(z0 z0Var, Double[] dArr, int i) {
        if (y3.a) {
            y3.a(z0Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) z0Var.e();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static z0 t(z0 z0Var, long j, long j2) {
        if (j == 0 && j2 == z0Var.count()) {
            return z0Var;
        }
        long j3 = j2 - j;
        j$.util.D d2 = (j$.util.D) z0Var.spliterator();
        u0 J = J(j3);
        J.n(j3);
        for (int i = 0; i < j && d2.p(new y0(0)); i++) {
        }
        for (int i2 = 0; i2 < j3 && d2.p(J); i2++) {
        }
        J.m();
        return J.b();
    }

    public static D0 Q(D0 d0) {
        if (d0.p() <= 0) {
            return d0;
        }
        long count = d0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new s1(d0, jArr, 0).invoke();
        return new j1(jArr);
    }

    public static z0 O(z0 z0Var) {
        if (z0Var.p() <= 0) {
            return z0Var;
        }
        long count = z0Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new s1(z0Var, dArr, 0).invoke();
        return new R0(dArr);
    }

    private static int M(long j) {
        return (j != -1 ? Q2.u : 0) | Q2.t;
    }

    @Override // j$.util.stream.v3
    public Object a(b bVar, Spliterator spliterator) {
        N1 d0 = d0();
        bVar.f0(spliterator, bVar.B0(d0));
        return d0.get();
    }

    @Override // j$.util.stream.v3
    public Object c(b bVar, Spliterator spliterator) {
        return ((N1) new P1(this, bVar, spliterator).invoke()).get();
    }
}
