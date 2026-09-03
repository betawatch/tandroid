package j7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class l5 {
    public static int a(long j10) {
        if (j10 > 2147483647L || j10 < -2147483648L) {
            throw new RuntimeException(e2.c.i(j10, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j10;
    }
}
