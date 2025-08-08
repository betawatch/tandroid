package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class R2 {
    public static final R2 DOUBLE_VALUE;
    public static final R2 INT_VALUE;
    public static final R2 LONG_VALUE;
    public static final R2 REFERENCE;
    private static final /* synthetic */ R2[] a;

    public static R2 valueOf(String str) {
        return (R2) Enum.valueOf(R2.class, str);
    }

    public static R2[] values() {
        return (R2[]) a.clone();
    }

    static {
        R2 r2 = new R2("REFERENCE", 0);
        REFERENCE = r2;
        R2 r22 = new R2("INT_VALUE", 1);
        INT_VALUE = r22;
        R2 r23 = new R2("LONG_VALUE", 2);
        LONG_VALUE = r23;
        R2 r24 = new R2("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = r24;
        a = new R2[]{r2, r22, r23, r24};
    }
}
