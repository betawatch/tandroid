package j7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class k5 {
    public static int a(long j10) {
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new RuntimeException(e2.c.i(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j10;
    }
}
