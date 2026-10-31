package li;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class r0 {
    public static final r0 a;
    public static final r0 b;
    public static final r0 c;
    public static final /* synthetic */ r0[] d;

    static {
        r0 r0Var = new r0("HIGH", 0);
        a = r0Var;
        r0 r0Var2 = new r0("MEDIUM", 1);
        b = r0Var2;
        r0 r0Var3 = new r0("LOW", 2);
        c = r0Var3;
        d = new r0[]{r0Var, r0Var2, r0Var3};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) d.clone();
    }
}
