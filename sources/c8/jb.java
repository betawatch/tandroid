package c8;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class jb {
    public static int a(long j3) {
        if (j3 > 2147483647L || j3 < -2147483648L) {
            throw new RuntimeException(rf.b.h(j3, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j3;
    }
}
