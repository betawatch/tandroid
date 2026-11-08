package c8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class vb {
    public static int a(int i7) {
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 4) {
            return 2;
        }
        if (i7 == 8) {
            return 3;
        }
        if (i7 == 16) {
            return 4;
        }
        if (i7 == 32) {
            return 5;
        }
        if (i7 == 64) {
            return 6;
        }
        if (i7 == 128) {
            return 7;
        }
        if (i7 == 256) {
            return 8;
        }
        if (i7 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(jg.g.j(i7, "type needs to be >= FIRST and <= LAST, type="));
    }
}
