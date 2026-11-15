package c8;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class lb {
    public static int a(long j3) {
        if (j3 > 2147483647L || j3 < -2147483648L) {
            throw new RuntimeException(r.b.j(j3, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j3;
    }
}
