// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ki2 {
    public static final ki2 a;
    public static final /* synthetic */ ki2[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ki2 EF0;

    static {
        ki2 ki2Var = new ki2("UNKNOWN", 0);
        ki2 ki2Var2 = new ki2("ANDROID_FIREBASE", 1);
        a = ki2Var2;
        b = new ki2[]{ki2Var, ki2Var2};
    }

    public static ki2 valueOf(String str) {
        return (ki2) Enum.valueOf(ki2.class, str);
    }

    public static ki2[] values() {
        return (ki2[]) b.clone();
    }
}
