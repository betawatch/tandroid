package f7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class z6 {
    public static int a(int i9) {
        if (i9 == 0) {
            return 0;
        }
        if (i9 == 90) {
            return 1;
        }
        if (i9 == 180) {
            return 2;
        }
        if (i9 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(j3.r0.l(i9, "Invalid rotation: "));
    }
}
