// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nn9 {
    public static final nn9 a;
    public static final nn9 b;
    public static final /* synthetic */ nn9[] c;

    static {
        nn9 nn9Var = new nn9("FRONT", 0);
        a = nn9Var;
        nn9 nn9Var2 = new nn9("BACK", 1);
        b = nn9Var2;
        c = new nn9[]{nn9Var, nn9Var2};
    }

    public static nn9 valueOf(String str) {
        return (nn9) Enum.valueOf(nn9.class, str);
    }

    public static nn9[] values() {
        return (nn9[]) c.clone();
    }
}
