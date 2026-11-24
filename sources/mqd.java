// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class mqd {
    public static int a(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return (int) j;
        }
        wn4.j(ug8.n(j, "A cast to int has gone wrong. Please contact the mp4parser discussion group (", ")"));
        return 0;
    }
}
