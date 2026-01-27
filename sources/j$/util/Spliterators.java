package j$.util;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Spliterators {
    private static final Spliterator a = new q0();
    private static final Z b = new o0();
    private static final c0 c = new p0();
    private static final W d = new n0();

    public static Spliterator e() {
        return a;
    }

    public static Z c() {
        return b;
    }

    public static c0 d() {
        return c;
    }

    public static W b() {
        return d;
    }

    public static Spliterator m(Object[] objArr, int i, int i2) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new l0(objArr, i, i2, 1040);
    }

    public static Z k(int[] iArr, int i, int i2) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i, i2);
        return new r0(iArr, i, i2, 1040);
    }

    public static c0 l(long[] jArr, int i, int i2) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i, i2);
        return new t0(jArr, i, i2, 1040);
    }

    public static W j(double[] dArr, int i, int i2) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i, i2);
        return new m0(dArr, i, i2, 1040);
    }

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        return new s0((java.util.Collection) Objects.requireNonNull(collection), i);
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new h0(spliterator);
    }

    public static L g(Z z) {
        Objects.requireNonNull(z);
        return new i0(z);
    }

    public static P h(c0 c0Var) {
        Objects.requireNonNull(c0Var);
        return new j0(c0Var);
    }

    public static H f(W w) {
        Objects.requireNonNull(w);
        return new k0(w);
    }
}
