// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ly2 {
    public static final ly2 a;
    public static final /* synthetic */ ly2[] b;

    static {
        ly2 ly2Var = new ly2("COROUTINE_SUSPENDED", 0);
        a = ly2Var;
        b = new ly2[]{ly2Var, new ly2("UNDECIDED", 1), new ly2("RESUMED", 2)};
    }

    public static ly2 valueOf(String str) {
        return (ly2) Enum.valueOf(ly2.class, str);
    }

    public static ly2[] values() {
        return (ly2[]) b.clone();
    }
}
