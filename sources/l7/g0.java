package l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
