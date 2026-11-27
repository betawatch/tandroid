// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class b79 {
    public static final b79 a;
    public static final b79 b;
    public static final /* synthetic */ b79[] c;

    /* JADX INFO: Fake field, exist only in values array */
    b79 EF0;

    static {
        b79 b79Var = new b79("FULL_BACKGROUND", 0);
        b79 b79Var2 = new b79("SECTION_COLOR_BACKGROUND", 1);
        b79 b79Var3 = new b79("OPTIMIZED_BACKGROUND", 2);
        a = b79Var3;
        b79 b79Var4 = new b79("DRAW_VERTICES", 3);
        b = b79Var4;
        c = new b79[]{b79Var, b79Var2, b79Var3, b79Var4};
    }

    public static b79 valueOf(String str) {
        return (b79) Enum.valueOf(b79.class, str);
    }

    public static b79[] values() {
        return (b79[]) c.clone();
    }
}
