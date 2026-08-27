package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w6 {
    public static final w6 DOUBLE_VALUE;
    public static final w6 INT_VALUE;
    public static final w6 LONG_VALUE;
    public static final w6 REFERENCE;
    public static final /* synthetic */ w6[] a;

    public static w6 valueOf(String str) {
        return (w6) Enum.valueOf(w6.class, str);
    }

    public static w6[] values() {
        return (w6[]) a.clone();
    }

    static {
        w6 w6Var = new w6("REFERENCE", 0);
        REFERENCE = w6Var;
        w6 w6Var2 = new w6("INT_VALUE", 1);
        INT_VALUE = w6Var2;
        w6 w6Var3 = new w6("LONG_VALUE", 2);
        LONG_VALUE = w6Var3;
        w6 w6Var4 = new w6("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = w6Var4;
        a = new w6[]{w6Var, w6Var2, w6Var3, w6Var4};
    }
}
