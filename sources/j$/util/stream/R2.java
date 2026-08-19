package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class R2 {
    public static final R2 OP;
    public static final R2 SPLITERATOR;
    public static final R2 STREAM;
    public static final R2 TERMINAL_OP;
    public static final R2 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ R2[] a;

    public static R2 valueOf(String str) {
        return (R2) Enum.valueOf(R2.class, str);
    }

    public static R2[] values() {
        return (R2[]) a.clone();
    }

    static {
        R2 r2 = new R2("SPLITERATOR", 0);
        SPLITERATOR = r2;
        R2 r22 = new R2("STREAM", 1);
        STREAM = r22;
        R2 r23 = new R2("OP", 2);
        OP = r23;
        R2 r24 = new R2("TERMINAL_OP", 3);
        TERMINAL_OP = r24;
        R2 r25 = new R2("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = r25;
        a = new R2[]{r2, r22, r23, r24, r25};
    }
}
