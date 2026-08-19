package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class T2 {
    public static final T2 DOUBLE_VALUE;
    public static final T2 INT_VALUE;
    public static final T2 LONG_VALUE;
    public static final T2 REFERENCE;
    public static final /* synthetic */ T2[] a;

    public static T2 valueOf(String str) {
        return (T2) Enum.valueOf(T2.class, str);
    }

    public static T2[] values() {
        return (T2[]) a.clone();
    }

    static {
        T2 t2 = new T2("REFERENCE", 0);
        REFERENCE = t2;
        T2 t22 = new T2("INT_VALUE", 1);
        INT_VALUE = t22;
        T2 t23 = new T2("LONG_VALUE", 2);
        LONG_VALUE = t23;
        T2 t24 = new T2("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = t24;
        a = new T2[]{t2, t22, t23, t24};
    }
}
