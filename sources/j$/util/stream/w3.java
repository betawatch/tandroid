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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public abstract class w3 implements h8 {
    public static final z2 a = new z2();
    public static final x2 b = new x2();
    public static final y2 c = new y2();
    public static final w2 d = new w2();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public static h2 A(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(TLObject.FLAG_14)) {
            n0 n0Var = new n0();
            n0Var.a = intFunction;
            h2 h2Var = (h2) new m2(aVar, spliterator, n0Var, new d1((byte) 19), (byte) 3).invoke();
            return z ? I(h2Var, intFunction) : h2Var;
        }
        if (F >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) F);
        new r3(spliterator, aVar, objArr).invoke();
        return new k2(objArr);
    }

    public static b2 B(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(TLObject.FLAG_14)) {
            b2 b2Var = (b2) new m2(aVar, spliterator, new d1((byte) 13), new d1((byte) 14), (byte) 0).invoke();
            return z ? J(b2Var) : b2Var;
        }
        if (F >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) F];
        new o3(spliterator, aVar, dArr).invoke();
        return new t2(dArr);
    }

    public static d2 C(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(TLObject.FLAG_14)) {
            d2 d2Var = (d2) new m2(aVar, spliterator, new d1((byte) 15), new d1((byte) 16), (byte) 1).invoke();
            return z ? K(d2Var) : d2Var;
        }
        if (F >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) F];
        new p3(spliterator, aVar, iArr).invoke();
        return new c3(iArr);
    }

    public static f2 D(a aVar, Spliterator spliterator, boolean z) {
        long F = aVar.F(spliterator);
        if (F < 0 || !spliterator.hasCharacteristics(TLObject.FLAG_14)) {
            f2 f2Var = (f2) new m2(aVar, spliterator, new d1((byte) 17), new d1((byte) 18), (byte) 2).invoke();
            return z ? L(f2Var) : f2Var;
        }
        if (F >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) F];
        new q3(spliterator, aVar, jArr).invoke();
        return new l3(jArr);
    }

    public static j2 E(c7 c7Var, h2 h2Var, h2 h2Var2) {
        int i = i2.a[c7Var.ordinal()];
        if (i == 1) {
            return new s2(h2Var, h2Var2);
        }
        if (i == 2) {
            return new p2((d2) h2Var, (d2) h2Var2);
        }
        if (i == 3) {
            return new q2((f2) h2Var, (f2) h2Var2);
        }
        if (i == 4) {
            return new o2((b2) h2Var, (b2) h2Var2);
        }
        throw new IllegalStateException("Unknown shape " + c7Var);
    }

    public static w1 F(long j) {
        return (j < 0 || j >= 2147483639) ? new v2() : new u2(j);
    }

    public static a3 G(c7 c7Var) {
        int i = i2.a[c7Var.ordinal()];
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
        throw new IllegalStateException("Unknown shape " + c7Var);
    }

    public static int H(long j) {
        return b7.t | (j != -1 ? b7.u : 0);
    }

    public static h2 I(h2 h2Var, IntFunction intFunction) {
        if (h2Var.h() <= 0) {
            return h2Var;
        }
        long count = h2Var.count();
        if (count >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new v3(h2Var, objArr, (byte) 1).invoke();
        return new k2(objArr);
    }

    public static b2 J(b2 b2Var) {
        if (b2Var.h() <= 0) {
            return b2Var;
        }
        long count = b2Var.count();
        if (count >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        double[] dArr = new double[(int) count];
        new u3(b2Var, dArr, (byte) 0).invoke();
        return new t2(dArr);
    }

    public static d2 K(d2 d2Var) {
        if (d2Var.h() <= 0) {
            return d2Var;
        }
        long count = d2Var.count();
        if (count >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        int[] iArr = new int[(int) count];
        new u3(d2Var, iArr, (byte) 0).invoke();
        return new c3(iArr);
    }

    public static f2 L(f2 f2Var) {
        if (f2Var.h() <= 0) {
            return f2Var;
        }
        long count = f2Var.count();
        if (count >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        long[] jArr = new long[(int) count];
        new u3(f2Var, jArr, (byte) 0).invoke();
        return new l3(jArr);
    }

    public static Set M(Set set) {
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
                    j$.util.g.a(e2, "java.util.stream.Collector.Characteristics");
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
                } catch (ClassCastException e3) {
                    j$.util.g.a(e3, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static j$.time.v N(Function function) {
        j$.time.v vVar = new j$.time.v((byte) 6);
        vVar.b = function;
        return vVar;
    }

    public static x1 O(long j) {
        return (j < 0 || j >= 2147483639) ? new e3() : new d3(j);
    }

    public static y1 P(long j) {
        return (j < 0 || j >= 2147483639) ? new n3() : new m3(j);
    }

    public static j$.util.function.a Q(u1 u1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(u1Var);
        return new j$.util.function.a(c7.DOUBLE_VALUE, u1Var, new o1(u1Var, (byte) 2));
    }

    public static v5 R(c0 c0Var, long j, long j2) {
        if (j >= 0) {
            return new v5(c0Var, H(j2), j, j2);
        }
        j$.time.g.a(j);
        return null;
    }

    public static j$.util.function.a S(u1 u1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(u1Var);
        return new j$.util.function.a(c7.INT_VALUE, u1Var, new o1(u1Var, (byte) 1));
    }

    public static r5 T(c1 c1Var, long j, long j2) {
        if (j >= 0) {
            return new r5(c1Var, H(j2), j, j2);
        }
        j$.time.g.a(j);
        return null;
    }

    public static j$.util.function.a U(u1 u1Var) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(u1Var);
        return new j$.util.function.a(c7.LONG_VALUE, u1Var, new o1(u1Var, (byte) 0));
    }

    public static t5 V(l1 l1Var, long j, long j2) {
        if (j >= 0) {
            return new t5(l1Var, H(j2), j, j2);
        }
        j$.time.g.a(j);
        return null;
    }

    public static j$.util.function.a W(u1 u1Var, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(u1Var);
        return new j$.util.function.a(c7.REFERENCE, u1Var, new j$.util.function.a((Object) u1Var, (Object) predicate, (byte) 3));
    }

    public static p5 X(f5 f5Var, long j, long j2) {
        if (j >= 0) {
            return new p5(f5Var, H(j2), j, j2);
        }
        j$.time.g.a(j);
        return null;
    }

    public static Spliterator Z(c7 c7Var, Spliterator spliterator, long j, long j2) {
        long z = z(j, j2);
        int i = w5.a[c7Var.ordinal()];
        if (i == 1) {
            return new v7(spliterator, j, z);
        }
        if (i == 2) {
            return new s7((j$.util.x0) spliterator, j, z);
        }
        if (i == 3) {
            return new t7((j$.util.a1) spliterator, j, z);
        }
        if (i == 4) {
            return new r7((j$.util.u0) spliterator, j, z);
        }
        throw new IllegalStateException("Unknown shape " + c7Var);
    }

    public static c5 a0(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new c5(spliterator, b7.l(spliterator), z);
    }

    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(k5 k5Var, Double d2) {
        if (j8.a) {
            j8.a(k5Var.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        k5Var.accept(d2.doubleValue());
    }

    public static void g(l5 l5Var, Integer num) {
        if (j8.a) {
            j8.a(l5Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        l5Var.accept(num.intValue());
    }

    public static void i(m5 m5Var, Long l) {
        if (j8.a) {
            j8.a(m5Var.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        m5Var.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(g2 g2Var, IntFunction intFunction) {
        if (j8.a) {
            j8.a(g2Var.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (g2Var.count() >= 2147483639) {
            j$.time.g.c("Stream size exceeds max array size");
            return null;
        }
        Object[] objArr = (Object[]) intFunction.apply((int) g2Var.count());
        g2Var.f(objArr, 0);
        return objArr;
    }

    public static void n(b2 b2Var, Double[] dArr, int i) {
        if (j8.a) {
            j8.a(b2Var.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) b2Var.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(d2 d2Var, Integer[] numArr, int i) {
        if (j8.a) {
            j8.a(d2Var.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) d2Var.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(f2 f2Var, Long[] lArr, int i) {
        if (j8.a) {
            j8.a(f2Var.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) f2Var.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(b2 b2Var, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            b2Var.d((DoubleConsumer) consumer);
        } else {
            if (j8.a) {
                j8.a(b2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.u0) b2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(d2 d2Var, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            d2Var.d((IntConsumer) consumer);
        } else {
            if (j8.a) {
                j8.a(d2Var.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.x0) d2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(f2 f2Var, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            f2Var.d((LongConsumer) consumer);
        } else {
            if (j8.a) {
                j8.a(f2Var.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.a1) f2Var.spliterator()).forEachRemaining(consumer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b2 t(b2 b2Var, long j, long j2) {
        if (j == 0 && j2 == b2Var.count()) {
            return b2Var;
        }
        long j3 = j2 - j;
        j$.util.u0 u0Var = (j$.util.u0) b2Var.spliterator();
        w1 F = F(j3);
        F.n(j3);
        Object[] objArr = 0;
        for (int i = 0; i < j && u0Var.tryAdvance(new a2(objArr == true ? 1 : 0)); i++) {
        }
        if (j2 == b2Var.count()) {
            u0Var.forEachRemaining((DoubleConsumer) F);
        } else {
            for (int i2 = 0; i2 < j3 && u0Var.tryAdvance((DoubleConsumer) F); i2++) {
            }
        }
        F.end();
        return F.build();
    }

    public static d2 u(d2 d2Var, long j, long j2) {
        if (j == 0 && j2 == d2Var.count()) {
            return d2Var;
        }
        long j3 = j2 - j;
        j$.util.x0 x0Var = (j$.util.x0) d2Var.spliterator();
        x1 O = O(j3);
        O.n(j3);
        for (int i = 0; i < j && x0Var.tryAdvance((IntConsumer) new c2((byte) 0)); i++) {
        }
        if (j2 == d2Var.count()) {
            x0Var.forEachRemaining((IntConsumer) O);
        } else {
            for (int i2 = 0; i2 < j3 && x0Var.tryAdvance((IntConsumer) O); i2++) {
            }
        }
        O.end();
        return O.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f2 v(f2 f2Var, long j, long j2) {
        if (j == 0 && j2 == f2Var.count()) {
            return f2Var;
        }
        long j3 = j2 - j;
        j$.util.a1 a1Var = (j$.util.a1) f2Var.spliterator();
        y1 P = P(j3);
        P.n(j3);
        Object[] objArr = 0;
        for (int i = 0; i < j && a1Var.tryAdvance(new e2(objArr == true ? 1 : 0)); i++) {
        }
        if (j2 == f2Var.count()) {
            a1Var.forEachRemaining((LongConsumer) P);
        } else {
            for (int i2 = 0; i2 < j3 && a1Var.tryAdvance((LongConsumer) P); i2++) {
            }
        }
        P.end();
        return P.build();
    }

    public static h2 w(h2 h2Var, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == h2Var.count()) {
            return h2Var;
        }
        Spliterator spliterator = h2Var.spliterator();
        long j3 = j2 - j;
        z1 x = x(j3, intFunction);
        x.n(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new d1((byte) 11)); i++) {
        }
        if (j2 == h2Var.count()) {
            spliterator.forEachRemaining(x);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(x); i2++) {
            }
        }
        x.end();
        return x.build();
    }

    public static z1 x(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new t3() : new b3(j, intFunction);
    }

    public static long y(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static long z(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public abstract r4 Y();

    @Override // j$.util.stream.h8
    public Object a(a aVar, Spliterator spliterator) {
        r4 Y = Y();
        aVar.Q(spliterator, Y);
        return Y.get();
    }

    @Override // j$.util.stream.h8
    public Object b(a aVar, Spliterator spliterator) {
        return ((r4) new y4(this, aVar, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.h8
    public int c() {
        return 0;
    }
}
