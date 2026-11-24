// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dr9 {
    public static final dr9 a;
    public static final dr9 b;
    public static final /* synthetic */ dr9[] c;

    static {
        dr9 dr9Var = new dr9("LINE", 0);
        a = dr9Var;
        dr9 dr9Var2 = new dr9("TAB", 1);
        b = dr9Var2;
        c = new dr9[]{dr9Var, dr9Var2};
    }

    public static dr9 valueOf(String str) {
        return (dr9) Enum.valueOf(dr9.class, str);
    }

    public static dr9[] values() {
        return (dr9[]) c.clone();
    }
}
