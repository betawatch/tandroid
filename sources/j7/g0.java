package j7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
