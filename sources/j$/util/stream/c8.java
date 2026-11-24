package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class c8 {
    public static final c8 MAYBE_MORE;
    public static final c8 NO_MORE;
    public static final c8 UNLIMITED;
    public static final /* synthetic */ c8[] a;

    static {
        c8 c8Var = new c8("NO_MORE", 0);
        NO_MORE = c8Var;
        c8 c8Var2 = new c8("MAYBE_MORE", 1);
        MAYBE_MORE = c8Var2;
        c8 c8Var3 = new c8("UNLIMITED", 2);
        UNLIMITED = c8Var3;
        a = new c8[]{c8Var, c8Var2, c8Var3};
    }

    public static c8 valueOf(String str) {
        return (c8) Enum.valueOf(c8.class, str);
    }

    public static c8[] values() {
        return (c8[]) a.clone();
    }
}
