package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class Z2 {
    public static final Z2 OP;
    public static final Z2 SPLITERATOR;
    public static final Z2 STREAM;
    public static final Z2 TERMINAL_OP;
    public static final Z2 UPSTREAM_TERMINAL_OP;
    private static final /* synthetic */ Z2[] a;

    public static Z2 valueOf(String str) {
        return (Z2) Enum.valueOf(Z2.class, str);
    }

    public static Z2[] values() {
        return (Z2[]) a.clone();
    }

    static {
        Z2 z2 = new Z2("SPLITERATOR", 0);
        SPLITERATOR = z2;
        Z2 z22 = new Z2("STREAM", 1);
        STREAM = z22;
        Z2 z23 = new Z2("OP", 2);
        OP = z23;
        Z2 z24 = new Z2("TERMINAL_OP", 3);
        TERMINAL_OP = z24;
        Z2 z25 = new Z2("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = z25;
        a = new Z2[]{z2, z22, z23, z24, z25};
    }
}
