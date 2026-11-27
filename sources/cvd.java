// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
