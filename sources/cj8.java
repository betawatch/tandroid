// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cj8 {
    public static final cj8 a;
    public static final cj8 b;
    public static final cj8 c;
    public static final /* synthetic */ cj8[] d;

    static {
        cj8 cj8Var = new cj8("DEFAULT", 0);
        a = cj8Var;
        cj8 cj8Var2 = new cj8("VERY_LOW", 1);
        b = cj8Var2;
        cj8 cj8Var3 = new cj8("HIGHEST", 2);
        c = cj8Var3;
        d = new cj8[]{cj8Var, cj8Var2, cj8Var3};
    }

    public static cj8 valueOf(String str) {
        return (cj8) Enum.valueOf(cj8.class, str);
    }

    public static cj8[] values() {
        return (cj8[]) d.clone();
    }
}
