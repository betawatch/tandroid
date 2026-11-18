package c8;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class ob {
    public static int a(long j3) {
        if (j3 > 2147483647L || j3 < -2147483648L) {
            throw new RuntimeException(p5.c.j(j3, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j3;
    }
}
