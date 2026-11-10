package c8;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class t0 {
    public static void a(long j3, String str) {
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j3 + ") must be >= 0");
    }

    public static void b(boolean z9) {
        if (!z9) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
