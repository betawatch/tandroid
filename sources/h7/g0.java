package h7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g0 {
    public static final g0 a;
    public static final /* synthetic */ g0[] b;

    static {
        g0 g0Var = new g0("DEFAULT", 0);
        a = g0Var;
        b = new g0[]{g0Var, new g0("SIGNED", 1), new g0("FIXED", 2)};
    }

    public static g0[] values() {
        return (g0[]) b.clone();
    }
}
