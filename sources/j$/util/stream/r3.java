package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
final class r3 {
    public static final r3 MAYBE_MORE;
    public static final r3 NO_MORE;
    public static final r3 UNLIMITED;
    private static final /* synthetic */ r3[] a;

    static {
        r3 r3Var = new r3("NO_MORE", 0);
        NO_MORE = r3Var;
        r3 r3Var2 = new r3("MAYBE_MORE", 1);
        MAYBE_MORE = r3Var2;
        r3 r3Var3 = new r3("UNLIMITED", 2);
        UNLIMITED = r3Var3;
        a = new r3[]{r3Var, r3Var2, r3Var3};
    }

    public static r3 valueOf(String str) {
        return (r3) Enum.valueOf(r3.class, str);
    }

    public static r3[] values() {
        return (r3[]) a.clone();
    }
}
