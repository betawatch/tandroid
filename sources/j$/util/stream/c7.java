package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class c7 {
    public static final c7 DOUBLE_VALUE;
    public static final c7 INT_VALUE;
    public static final c7 LONG_VALUE;
    public static final c7 REFERENCE;
    public static final /* synthetic */ c7[] a;

    static {
        c7 c7Var = new c7("REFERENCE", 0);
        REFERENCE = c7Var;
        c7 c7Var2 = new c7("INT_VALUE", 1);
        INT_VALUE = c7Var2;
        c7 c7Var3 = new c7("LONG_VALUE", 2);
        LONG_VALUE = c7Var3;
        c7 c7Var4 = new c7("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = c7Var4;
        a = new c7[]{c7Var, c7Var2, c7Var3, c7Var4};
    }

    public static c7 valueOf(String str) {
        return (c7) Enum.valueOf(c7.class, str);
    }

    public static c7[] values() {
        return (c7[]) a.clone();
    }
}
