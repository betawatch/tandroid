// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class o01 {
    public static final o01 a;
    public static final o01 b;
    public static final o01 c;
    public static final /* synthetic */ o01[] d;

    static {
        o01 o01Var = new o01("SUSPEND", 0);
        a = o01Var;
        o01 o01Var2 = new o01("DROP_OLDEST", 1);
        b = o01Var2;
        o01 o01Var3 = new o01("DROP_LATEST", 2);
        c = o01Var3;
        d = new o01[]{o01Var, o01Var2, o01Var3};
    }

    public static o01 valueOf(String str) {
        return (o01) Enum.valueOf(o01.class, str);
    }

    public static o01[] values() {
        return (o01[]) d.clone();
    }
}
