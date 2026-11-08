package c8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class xc {
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
        throw new IllegalArgumentException(jg.g.j(i7, "Invalid rotation: "));
    }
}
