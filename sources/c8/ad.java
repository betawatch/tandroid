package c8;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class ad {
    public static int a(int i7) {
        if (i7 == 0) {
            return 0;
        }
        if (i7 == 90) {
            return 1;
        }
        if (i7 == 180) {
            return 2;
        }
        if (i7 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(i5.c.i(i7, "Invalid rotation: "));
    }
}
