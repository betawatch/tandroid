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
public abstract class t3 implements b8 {
    public static final w2 a = new w2();
    public static final u2 b = new u2();
    public static final v2 c = new v2();
    public static final t2 d = new t2();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract w1 A0(long j10, IntFunction intFunction);

    public abstract o4 D0();

    public abstract j5 F0(Spliterator spliterator, j5 j5Var);

    public abstract j5 G0(j5 j5Var);

    public abstract Spliterator H0(Spliterator spliterator);

    public abstract void f0(Spliterator spliterator, j5 j5Var);

    public abstract boolean g0(Spliterator spliterator, j5 j5Var);

    public abstract e2 j0(Spliterator spliterator, boolean z10, IntFunction intFunction);

    public abstract long k0(Spliterator spliterator);

    @Override // j$.util.stream.b8
    public /* synthetic */ int v() {
        return 0;
    }

    public static j$.time.t r0(Function function) {
        j$.time.t tVar = new j$.time.t(7);
        tVar.b = function;
        return tVar;
    }

    public static Set q0(Set set) {
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
                } catch (ClassCastException e10) {
                    j$.util.g.a(e10, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                j$.util.g.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it2.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? g.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? g.UNORDERED : g.IDENTITY_FINISH);
                } catch (ClassCastException e11) {
                    j$.util.g.a(e11, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static long W(long j10, long j11, long j12) {
        if (j10 >= 0) {
            return Math.max(-1L, Math.min(j10 - j11, j12));
        }
        return -1L;
    }

    public static long Z(long j10, long j11) {
        long j12 = j11 >= 0 ? j10 + j11 : Long.MAX_VALUE;
        if (j12 >= 0) {
            return j12;
        }
        return Long.MAX_VALUE;
    }

    public static y4 E0(Spliterator spliterator, boolean z10) {
        Objects.requireNonNull(spliterator);
        return new y4(spliterator, v6.l(spliterator), z10);
    }

    public static Spliterator X(w6 w6Var, Spliterator spliterator, long j10, long j11) {
        long Z = Z(j10, j11);
        int i9 = s5.a[w6Var.ordinal()];
        if (i9 == 1) {
            return new p7(spliterator, j10, Z);
        }
        if (i9 == 2) {
            return new m7((j$.util.x0) spliterator, j10, Z);
        }
        if (i9 == 3) {
            return new n7((j$.util.a1) spliterator, j10, Z);
        }
        if (i9 != 4) {
            throw new IllegalStateException("Unknown shape " + w6Var);
        }
        return new l7((j$.util.u0) spliterator, j10, Z);
    }

    public static j$.util.concurrent.t B0(r1 r1Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(r1Var);
        return new j$.util.concurrent.t(w6.REFERENCE, r1Var, new j$.util.concurrent.t(5, r1Var, predicate));
    }

    public static x2 i0(w6 w6Var) {
        int i9 = f2.a[w6Var.ordinal()];
        if (i9 == 1) {
            return a;
        }
        if (i9 == 2) {
            return b;
        }
        if (i9 == 3) {
            return c;
        }
        if (i9 == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + w6Var);
    }

    public static j$.util.concurrent.t w0(r1 r1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(r1Var);
        return new j$.util.concurrent.t(w6.INT_VALUE, r1Var, new l1(r1Var, 1));
    }

    public static l5 C0(b5 b5Var, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new l5(b5Var, l0(j11), j10, j11);
    }

    public static e2 V(e2 e2Var, long j10, long j11, IntFunction intFunction) {
        if (j10 == 0 && j11 == e2Var.count()) {
            return e2Var;
        }
        Spliterator spliterator = e2Var.spliterator();
        long j12 = j11 - j10;
        w1 Y = Y(j12, intFunction);
        Y.o(j12);
        for (int i9 = 0; i9 < j10 && spliterator.tryAdvance(new a1(11)); i9++) {
        }
        if (j11 == e2Var.count()) {
            spliterator.forEachRemaining(Y);
        } else {
            for (int i10 = 0; i10 < j12 && spliterator.tryAdvance(Y); i10++) {
            }
        }
        Y.end();
        return Y.build();
    }

    public static g2 e0(w6 w6Var, e2 e2Var, e2 e2Var2) {
        int i9 = f2.a[w6Var.ordinal()];
        if (i9 == 1) {
            return new p2(e2Var, e2Var2);
        }
        if (i9 == 2) {
            return new m2((a2) e2Var, (a2) e2Var2);
        }
        if (i9 == 3) {
            return new n2((c2) e2Var, (c2) e2Var2);
        }
        if (i9 != 4) {
            throw new IllegalStateException("Unknown shape " + w6Var);
        }
        return new l2((y1) e2Var, (y1) e2Var2);
    }

    public static j$.util.concurrent.t y0(r1 r1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(r1Var);
        return new j$.util.concurrent.t(w6.LONG_VALUE, r1Var, new l1(r1Var, 0));
    }

    public static void J() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.util.concurrent.t u0(r1 r1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(r1Var);
        return new j$.util.concurrent.t(w6.DOUBLE_VALUE, r1Var, new l1(r1Var, 2));
    }

    public static void K() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static w1 Y(long j10, IntFunction intFunction) {
        if (j10 >= 0 && j10 < 2147483639) {
            return new y2(j10, intFunction);
        }
        return new q3();
    }

    public static void C() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void F(h5 h5Var, Integer num) {
        if (d8.a) {
            d8.a(h5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        h5Var.accept(num.intValue());
    }

    public static void H(i5 i5Var, Long l10) {
        if (d8.a) {
            d8.a(i5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        i5Var.accept(l10.longValue());
    }

    public static u1 s0(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new b3();
        }
        return new a3(j10);
    }

    public static void D(g5 g5Var, Double d9) {
        if (d8.a) {
            d8.a(g5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        g5Var.accept(d9.doubleValue());
    }

    public static n5 x0(z0 z0Var, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new n5(z0Var, l0(j11), j10, j11);
    }

    public static v1 t0(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new k3();
        }
        return new j3(j10);
    }

    public static Object[] L(d2 d2Var, IntFunction intFunction) {
        if (d8.a) {
            d8.a(d2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (d2Var.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) d2Var.count());
        d2Var.f(objArr, 0);
        return objArr;
    }

    public static t1 h0(long j10) {
        if (j10 < 0 || j10 >= 2147483639) {
            return new s2();
        }
        return new r2(j10);
    }

    public static e2 a0(t3 t3Var, Spliterator spliterator, boolean z10, IntFunction intFunction) {
        long k02 = t3Var.k0(spliterator);
        if (k02 < 0 || !spliterator.hasCharacteristics(16384)) {
            k0 k0Var = new k0();
            k0Var.a = intFunction;
            e2 e2Var = (e2) new j2(t3Var, spliterator, k0Var, new a1(19), 3).invoke();
            return z10 ? m0(e2Var, intFunction) : e2Var;
        }
        if (k02 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) k02);
        new o3(spliterator, t3Var, objArr).invoke();
        return new h2(objArr);
    }

    public static void Q(a2 a2Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            a2Var.d((IntConsumer) consumer);
        } else {
            if (d8.a) {
                d8.a(a2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.x0) a2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static p5 z0(i1 i1Var, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new p5(i1Var, l0(j11), j10, j11);
    }

    public static void N(a2 a2Var, Integer[] numArr, int i9) {
        if (d8.a) {
            d8.a(a2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) a2Var.b();
        for (int i10 = 0; i10 < iArr.length; i10++) {
            numArr[i9 + i10] = Integer.valueOf(iArr[i10]);
        }
    }

    public static a2 T(a2 a2Var, long j10, long j11) {
        if (j10 == 0 && j11 == a2Var.count()) {
            return a2Var;
        }
        long j12 = j11 - j10;
        j$.util.x0 x0Var = (j$.util.x0) a2Var.spliterator();
        u1 s02 = s0(j12);
        s02.o(j12);
        for (int i9 = 0; i9 < j10 && x0Var.tryAdvance((IntConsumer) new z1(0)); i9++) {
        }
        if (j11 == a2Var.count()) {
            x0Var.forEachRemaining((IntConsumer) s02);
        } else {
            for (int i10 = 0; i10 < j12 && x0Var.tryAdvance((IntConsumer) s02); i10++) {
            }
        }
        s02.end();
        return s02.build();
    }

    public static a2 c0(t3 t3Var, Spliterator spliterator, boolean z10) {
        long k02 = t3Var.k0(spliterator);
        if (k02 < 0 || !spliterator.hasCharacteristics(16384)) {
            a2 a2Var = (a2) new j2(t3Var, spliterator, new a1(15), new a1(16), 1).invoke();
            return z10 ? o0(a2Var) : a2Var;
        }
        if (k02 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) k02];
        new m3(spliterator, t3Var, iArr).invoke();
        return new z2(iArr);
    }

    public static c2 d0(t3 t3Var, Spliterator spliterator, boolean z10) {
        long k02 = t3Var.k0(spliterator);
        if (k02 < 0 || !spliterator.hasCharacteristics(16384)) {
            c2 c2Var = (c2) new j2(t3Var, spliterator, new a1(17), new a1(18), 2).invoke();
            return z10 ? p0(c2Var) : c2Var;
        }
        if (k02 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) k02];
        new n3(spliterator, t3Var, jArr).invoke();
        return new i3(jArr);
    }

    public static void R(c2 c2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c2Var.d((LongConsumer) consumer);
        } else {
            if (d8.a) {
                d8.a(c2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.a1) c2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void O(c2 c2Var, Long[] lArr, int i9) {
        if (d8.a) {
            d8.a(c2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) c2Var.b();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            lArr[i9 + i10] = Long.valueOf(jArr[i10]);
        }
    }

    public static c2 U(c2 c2Var, long j10, long j11) {
        if (j10 == 0 && j11 == c2Var.count()) {
            return c2Var;
        }
        long j12 = j11 - j10;
        j$.util.a1 a1Var = (j$.util.a1) c2Var.spliterator();
        v1 t02 = t0(j12);
        t02.o(j12);
        for (int i9 = 0; i9 < j10 && a1Var.tryAdvance((LongConsumer) new b2(0)); i9++) {
        }
        if (j11 == c2Var.count()) {
            a1Var.forEachRemaining((LongConsumer) t02);
        } else {
            for (int i10 = 0; i10 < j12 && a1Var.tryAdvance((LongConsumer) t02); i10++) {
            }
        }
        t02.end();
        return t02.build();
    }

    public static y1 b0(t3 t3Var, Spliterator spliterator, boolean z10) {
        long k02 = t3Var.k0(spliterator);
        if (k02 < 0 || !spliterator.hasCharacteristics(16384)) {
            y1 y1Var = (y1) new j2(t3Var, spliterator, new a1(13), new a1(14), 0).invoke();
            return z10 ? n0(y1Var) : y1Var;
        }
        if (k02 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) k02];
        new l3(spliterator, t3Var, dArr).invoke();
        return new q2(dArr);
    }

    public static r5 v0(z zVar, long j10, long j11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j10);
        }
        return new r5(zVar, l0(j11), j10, j11);
    }

    public static e2 m0(e2 e2Var, IntFunction intFunction) {
        if (e2Var.h() <= 0) {
            return e2Var;
        }
        long count = e2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new s3(e2Var, objArr, 1).invoke();
        return new h2(objArr);
    }

    public static void P(y1 y1Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            y1Var.d((DoubleConsumer) consumer);
        } else {
            if (d8.a) {
                d8.a(y1Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.u0) y1Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static a2 o0(a2 a2Var) {
        if (a2Var.h() <= 0) {
            return a2Var;
        }
        long count = a2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new r3(a2Var, iArr, 0).invoke();
        return new z2(iArr);
    }

    public static void M(y1 y1Var, Double[] dArr, int i9) {
        if (d8.a) {
            d8.a(y1Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) y1Var.b();
        for (int i10 = 0; i10 < dArr2.length; i10++) {
            dArr[i9 + i10] = Double.valueOf(dArr2[i10]);
        }
    }

    public static y1 S(y1 y1Var, long j10, long j11) {
        if (j10 == 0 && j11 == y1Var.count()) {
            return y1Var;
        }
        long j12 = j11 - j10;
        j$.util.u0 u0Var = (j$.util.u0) y1Var.spliterator();
        t1 h02 = h0(j12);
        h02.o(j12);
        for (int i9 = 0; i9 < j10 && u0Var.tryAdvance((DoubleConsumer) new x1(0)); i9++) {
        }
        if (j11 == y1Var.count()) {
            u0Var.forEachRemaining((DoubleConsumer) h02);
        } else {
            for (int i10 = 0; i10 < j12 && u0Var.tryAdvance((DoubleConsumer) h02); i10++) {
            }
        }
        h02.end();
        return h02.build();
    }

    public static c2 p0(c2 c2Var) {
        if (c2Var.h() <= 0) {
            return c2Var;
        }
        long count = c2Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new r3(c2Var, jArr, 0).invoke();
        return new i3(jArr);
    }

    public static int l0(long j10) {
        return (j10 != -1 ? v6.u : 0) | v6.t;
    }

    public static y1 n0(y1 y1Var) {
        if (y1Var.h() <= 0) {
            return y1Var;
        }
        long count = y1Var.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new r3(y1Var, dArr, 0).invoke();
        return new q2(dArr);
    }

    @Override // j$.util.stream.b8
    public Object f(a aVar, Spliterator spliterator) {
        o4 D0 = D0();
        aVar.F0(spliterator, D0);
        return D0.get();
    }

    @Override // j$.util.stream.b8
    public Object i(t3 t3Var, Spliterator spliterator) {
        return ((o4) new v4(this, t3Var, spliterator).invoke()).get();
    }
}
