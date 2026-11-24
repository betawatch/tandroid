// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class dx2 {
    public static final dx2 a;
    public static final dx2 b;
    public static final /* synthetic */ dx2[] c;

    static {
        dx2 dx2Var = new dx2("DEFAULT", 0);
        a = dx2Var;
        dx2 dx2Var2 = new dx2("LAZY", 1);
        dx2 dx2Var3 = new dx2("ATOMIC", 2);
        b = dx2Var3;
        c = new dx2[]{dx2Var, dx2Var2, dx2Var3, new dx2("UNDISPATCHED", 3)};
    }

    public static dx2 valueOf(String str) {
        return (dx2) Enum.valueOf(dx2.class, str);
    }

    public static dx2[] values() {
        return (dx2[]) c.clone();
    }
}
