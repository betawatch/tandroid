// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class fod {
    public static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public static int b(int i, int i2, boolean z) {
        return z ? i | i2 : i & (~i2);
    }
}
