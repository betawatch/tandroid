// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class cvd {
    public static int a(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        xi4.l(ik8.n(j, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        return 0;
    }
}
