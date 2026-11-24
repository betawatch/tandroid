// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nx5 {
    public static final nx5 a;
    public static final nx5 b;
    public static final nx5 c;
    public static final nx5 d;
    public static final /* synthetic */ nx5[] e;

    static {
        nx5 nx5Var = new nx5("STATE_FULLY_HIDDEN", 0);
        a = nx5Var;
        nx5 nx5Var2 = new nx5("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        b = nx5Var2;
        nx5 nx5Var3 = new nx5("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        c = nx5Var3;
        nx5 nx5Var4 = new nx5("STATE_FULLY_VISIBLE", 3);
        d = nx5Var4;
        e = new nx5[]{nx5Var, nx5Var2, nx5Var3, nx5Var4};
    }

    public static nx5 valueOf(String str) {
        return (nx5) Enum.valueOf(nx5.class, str);
    }

    public static nx5[] values() {
        return (nx5[]) e.clone();
    }
}
