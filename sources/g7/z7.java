package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class z7 {
    public static boolean a(int i9, int i10) {
        return (i9 & i10) != 0;
    }

    public static int b(int i9, int i10, boolean z10) {
        return z10 ? i9 | i10 : i9 & (~i10);
    }
}
