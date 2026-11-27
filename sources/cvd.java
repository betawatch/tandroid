// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
