// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ol9 {
    public static final ol9 a;
    public static final ol9 b;
    public static final ol9 c;
    public static final /* synthetic */ ol9[] d;

    static {
        ol9 ol9Var = new ol9("HIGH", 0);
        a = ol9Var;
        ol9 ol9Var2 = new ol9("MEDIUM", 1);
        b = ol9Var2;
        ol9 ol9Var3 = new ol9("LOW", 2);
        c = ol9Var3;
        d = new ol9[]{ol9Var, ol9Var2, ol9Var3};
    }

    public static ol9 valueOf(String str) {
        return (ol9) Enum.valueOf(ol9.class, str);
    }

    public static ol9[] values() {
        return (ol9[]) d.clone();
    }
}
