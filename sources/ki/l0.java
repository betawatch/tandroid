package ki;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class l0 {
    public static final l0 a;
    public static final l0 b;
    public static final /* synthetic */ l0[] c;

    static {
        l0 l0Var = new l0("FRONT", 0);
        a = l0Var;
        l0 l0Var2 = new l0("BACK", 1);
        b = l0Var2;
        c = new l0[]{l0Var, l0Var2};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) c.clone();
    }
}
