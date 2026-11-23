package c8;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
