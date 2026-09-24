package ki;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class k0 {
    public static final k0 a;
    public static final k0 b;
    public static final /* synthetic */ k0[] c;

    static {
        k0 k0Var = new k0("FRONT", 0);
        a = k0Var;
        k0 k0Var2 = new k0("BACK", 1);
        b = k0Var2;
        c = new k0[]{k0Var, k0Var2};
    }

    public static k0 valueOf(String str) {
        return (k0) Enum.valueOf(k0.class, str);
    }

    public static k0[] values() {
        return (k0[]) c.clone();
    }
}
