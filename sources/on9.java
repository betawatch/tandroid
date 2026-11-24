// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class on9 {
    public static final on9 a;
    public static final on9 b;
    public static final on9 c;
    public static final /* synthetic */ on9[] d;

    static {
        on9 on9Var = new on9("HIGH", 0);
        a = on9Var;
        on9 on9Var2 = new on9("MEDIUM", 1);
        b = on9Var2;
        on9 on9Var3 = new on9("LOW", 2);
        c = on9Var3;
        d = new on9[]{on9Var, on9Var2, on9Var3};
    }

    public static on9 valueOf(String str) {
        return (on9) Enum.valueOf(on9.class, str);
    }

    public static on9[] values() {
        return (on9[]) d.clone();
    }
}
