// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ok5 {
    public static final ok5 a;
    public static final ok5 b;
    public static final /* synthetic */ ok5[] c;

    static {
        ok5 ok5Var = new ok5("BACK", 0);
        a = ok5Var;
        ok5 ok5Var2 = new ok5("MENU", 1);
        b = ok5Var2;
        c = new ok5[]{ok5Var, ok5Var2};
    }

    public static ok5 valueOf(String str) {
        return (ok5) Enum.valueOf(ok5.class, str);
    }

    public static ok5[] values() {
        return (ok5[]) c.clone();
    }
}
