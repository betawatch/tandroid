// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nh2 {
    public static final nh2 a;
    public static final /* synthetic */ nh2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    nh2 EF0;

    static {
        nh2 nh2Var = new nh2("NONE", 0);
        nh2 nh2Var2 = new nh2("ALL_JSON_OBJECTS", 1);
        nh2 nh2Var3 = new nh2("POLYMORPHIC", 2);
        a = nh2Var3;
        b = new nh2[]{nh2Var, nh2Var2, nh2Var3};
    }

    public static nh2 valueOf(String str) {
        return (nh2) Enum.valueOf(nh2.class, str);
    }

    public static nh2[] values() {
        return (nh2[]) b.clone();
    }
}
