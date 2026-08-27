package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class u6 {
    public static final u6 OP;
    public static final u6 SPLITERATOR;
    public static final u6 STREAM;
    public static final u6 TERMINAL_OP;
    public static final u6 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ u6[] a;

    public static u6 valueOf(String str) {
        return (u6) Enum.valueOf(u6.class, str);
    }

    public static u6[] values() {
        return (u6[]) a.clone();
    }

    static {
        u6 u6Var = new u6("SPLITERATOR", 0);
        SPLITERATOR = u6Var;
        u6 u6Var2 = new u6("STREAM", 1);
        STREAM = u6Var2;
        u6 u6Var3 = new u6("OP", 2);
        OP = u6Var3;
        u6 u6Var4 = new u6("TERMINAL_OP", 3);
        TERMINAL_OP = u6Var4;
        u6 u6Var5 = new u6("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = u6Var5;
        a = new u6[]{u6Var, u6Var2, u6Var3, u6Var4, u6Var5};
    }
}
