package li;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class q0 {
    public static final q0 a;
    public static final q0 b;
    public static final /* synthetic */ q0[] c;

    static {
        q0 q0Var = new q0("FRONT", 0);
        a = q0Var;
        q0 q0Var2 = new q0("BACK", 1);
        b = q0Var2;
        c = new q0[]{q0Var, q0Var2};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) c.clone();
    }
}
