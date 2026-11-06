package c8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class jb {
    public static int a(long j3) {
        if (j3 > 2147483647L || j3 < -2147483648L) {
            throw new RuntimeException(rf.b.h(j3, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        }
        return (int) j3;
    }
}
