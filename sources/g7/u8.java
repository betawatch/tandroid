package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class u8 {
    public static int a(long j10) {
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new RuntimeException(aa.d.n(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j10;
    }
}
