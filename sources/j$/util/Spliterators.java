package j$.util;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Spliterators {
    private static final Spliterator a = new Y();
    private static final G b = new W();
    private static final J c = new X();
    private static final D d = new V();

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

    public static D b() {
        return d;
    }

    public static G c() {
        return b;
    }

    public static J d() {
        return c;
    }

    public static Spliterator e() {
        return a;
    }

    public static p f(D d2) {
        d2.getClass();
        return new S(d2);
    }

    public static t g(G g) {
        g.getClass();
        return new P(g);
    }

    public static x h(J j) {
        j.getClass();
        return new Q(j);
    }

    public static Iterator i(Spliterator spliterator) {
        spliterator.getClass();
        return new O(spliterator);
    }

    public static D j(double[] dArr, int i, int i2) {
        dArr.getClass();
        a(dArr.length, i, i2);
        return new U(dArr, i, i2, 1040);
    }

    public static G k(int[] iArr, int i, int i2) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new Z(iArr, i, i2, 1040);
    }

    public static J l(long[] jArr, int i, int i2) {
        jArr.getClass();
        a(jArr.length, i, i2);
        return new b0(jArr, i, i2, 1040);
    }

    public static Spliterator m(Object[] objArr, int i, int i2) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new T(objArr, i, i2, 1040);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new a0(collection, i);
    }
}
