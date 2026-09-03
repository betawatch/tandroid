package l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
