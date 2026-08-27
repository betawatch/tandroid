package j$.util;

/* loaded from: classes2.dex */
public final class Spliterators {
    public static final o1 a = new o1();
    public static final m1 b = new m1();
    public static final n1 c = new n1();
    public static final l1 d = new l1();

    public static void a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i10) {
        return new q1((java.util.Collection) Objects.requireNonNull(collection), i10);
    }
}
