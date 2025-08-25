package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b3 {
    public static final b3 DOUBLE_VALUE;
    public static final b3 INT_VALUE;
    public static final b3 LONG_VALUE;
    public static final b3 REFERENCE;
    private static final /* synthetic */ b3[] a;

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) a.clone();
    }

    static {
        b3 b3Var = new b3("REFERENCE", 0);
        REFERENCE = b3Var;
        b3 b3Var2 = new b3("INT_VALUE", 1);
        INT_VALUE = b3Var2;
        b3 b3Var3 = new b3("LONG_VALUE", 2);
        LONG_VALUE = b3Var3;
        b3 b3Var4 = new b3("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = b3Var4;
        a = new b3[]{b3Var, b3Var2, b3Var3, b3Var4};
    }
}
