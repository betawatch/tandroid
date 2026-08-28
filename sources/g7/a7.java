package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a7 {
    public static int a(int i9) {
        if (i9 == 1) {
            return 0;
        }
        if (i9 == 2) {
            return 1;
        }
        if (i9 == 4) {
            return 2;
        }
        if (i9 == 8) {
            return 3;
        }
        if (i9 == 16) {
            return 4;
        }
        if (i9 == 32) {
            return 5;
        }
        if (i9 == 64) {
            return 6;
        }
        if (i9 == 128) {
            return 7;
        }
        if (i9 == 256) {
            return 8;
        }
        if (i9 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(j3.r0.l(i9, "type needs to be >= FIRST and <= LAST, type="));
    }
}
