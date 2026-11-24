// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class bx2 {
    public static final bx2 a;
    public static final /* synthetic */ bx2[] b;

    static {
        bx2 bx2Var = new bx2("COROUTINE_SUSPENDED", 0);
        a = bx2Var;
        b = new bx2[]{bx2Var, new bx2("UNDECIDED", 1), new bx2("RESUMED", 2)};
    }

    public static bx2 valueOf(String str) {
        return (bx2) Enum.valueOf(bx2.class, str);
    }

    public static bx2[] values() {
        return (bx2[]) b.clone();
    }
}
