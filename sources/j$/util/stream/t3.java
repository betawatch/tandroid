package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class t3 {
    public static final t3 MAYBE_MORE;
    public static final t3 NO_MORE;
    public static final t3 UNLIMITED;
    public static final /* synthetic */ t3[] a;

    static {
        t3 t3Var = new t3("NO_MORE", 0);
        NO_MORE = t3Var;
        t3 t3Var2 = new t3("MAYBE_MORE", 1);
        MAYBE_MORE = t3Var2;
        t3 t3Var3 = new t3("UNLIMITED", 2);
        UNLIMITED = t3Var3;
        a = new t3[]{t3Var, t3Var2, t3Var3};
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) a.clone();
    }
}
