package ki;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class l0 {
    public static final l0 a;
    public static final l0 b;
    public static final l0 c;
    public static final /* synthetic */ l0[] d;

    static {
        l0 l0Var = new l0("HIGH", 0);
        a = l0Var;
        l0 l0Var2 = new l0("MEDIUM", 1);
        b = l0Var2;
        l0 l0Var3 = new l0("LOW", 2);
        c = l0Var3;
        d = new l0[]{l0Var, l0Var2, l0Var3};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) d.clone();
    }
}
