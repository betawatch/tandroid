package j$.util;

/* loaded from: classes2.dex */
public final class Spliterators {
    public static final o1 a = new o1();
    public static final m1 b = new m1();
    public static final n1 c = new n1();
    public static final l1 d = new l1();

    public static void a(int i9, int i10, int i11) {
        if (i10 <= i11) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(i10);
            }
            if (i11 > i9) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i10 + ") > fence(" + i11 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i9) {
        return new q1((java.util.Collection) Objects.requireNonNull(collection), i9);
    }
}
