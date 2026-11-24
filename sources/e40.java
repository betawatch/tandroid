// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class e40 {
    public static final e40 a;
    public static final e40 b;
    public static final /* synthetic */ e40[] c;

    static {
        e40 e40Var = new e40("DISABLED", 0);
        a = e40Var;
        e40 e40Var2 = new e40("RNNOISE", 1);
        b = e40Var2;
        c = new e40[]{e40Var, e40Var2};
    }

    public static e40 valueOf(String str) {
        return (e40) Enum.valueOf(e40.class, str);
    }

    public static e40[] values() {
        return (e40[]) c.clone();
    }
}
