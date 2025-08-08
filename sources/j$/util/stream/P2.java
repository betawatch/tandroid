package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class P2 {
    public static final P2 OP;
    public static final P2 SPLITERATOR;
    public static final P2 STREAM;
    public static final P2 TERMINAL_OP;
    public static final P2 UPSTREAM_TERMINAL_OP;
    private static final /* synthetic */ P2[] a;

    public static P2 valueOf(String str) {
        return (P2) Enum.valueOf(P2.class, str);
    }

    public static P2[] values() {
        return (P2[]) a.clone();
    }

    static {
        P2 p2 = new P2("SPLITERATOR", 0);
        SPLITERATOR = p2;
        P2 p22 = new P2("STREAM", 1);
        STREAM = p22;
        P2 p23 = new P2("OP", 2);
        OP = p23;
        P2 p24 = new P2("TERMINAL_OP", 3);
        TERMINAL_OP = p24;
        P2 p25 = new P2("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = p25;
        a = new P2[]{p2, p22, p23, p24, p25};
    }
}
