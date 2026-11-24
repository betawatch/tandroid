// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ft9 {
    public static final ft9 a;
    public static final ft9 b;
    public static final /* synthetic */ ft9[] c;

    static {
        ft9 ft9Var = new ft9("LINE", 0);
        a = ft9Var;
        ft9 ft9Var2 = new ft9("TAB", 1);
        b = ft9Var2;
        c = new ft9[]{ft9Var, ft9Var2};
    }

    public static ft9 valueOf(String str) {
        return (ft9) Enum.valueOf(ft9.class, str);
    }

    public static ft9[] values() {
        return (ft9[]) c.clone();
    }
}
