package j$.util;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Spliterators {
    private static final Spliterator a = new p0();
    private static final Y b = new n0();
    private static final b0 c = new o0();
    private static final V d = new m0();

    public static Spliterator e() {
        return a;
    }

    public static Y c() {
        return b;
    }

    public static b0 d() {
        return c;
    }

    public static V b() {
        return d;
    }

    public static Spliterator m(Object[] objArr, int i, int i2) {
        a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new k0(objArr, i, i2, 1040);
    }

    public static Y k(int[] iArr, int i, int i2) {
        a(((int[]) Objects.requireNonNull(iArr)).length, i, i2);
        return new q0(iArr, i, i2, 1040);
    }

    public static b0 l(long[] jArr, int i, int i2) {
        a(((long[]) Objects.requireNonNull(jArr)).length, i, i2);
        return new s0(jArr, i, i2, 1040);
    }

    public static V j(double[] dArr, int i, int i2) {
        a(((double[]) Objects.requireNonNull(dArr)).length, i, i2);
        return new l0(dArr, i, i2, 1040);
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
        return new r0((java.util.Collection) Objects.requireNonNull(collection), i);
    }

    public static Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new g0(spliterator);
    }

    public static K g(Y y) {
        Objects.requireNonNull(y);
        return new h0(y);
    }

    public static O h(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        return new i0(b0Var);
    }

    public static G f(V v) {
        Objects.requireNonNull(v);
        return new j0(v);
    }
}
