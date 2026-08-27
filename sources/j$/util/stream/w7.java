package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w7 {
    public static final w7 MAYBE_MORE;
    public static final w7 NO_MORE;
    public static final w7 UNLIMITED;
    public static final /* synthetic */ w7[] a;

    static {
        w7 w7Var = new w7("NO_MORE", 0);
        NO_MORE = w7Var;
        w7 w7Var2 = new w7("MAYBE_MORE", 1);
        MAYBE_MORE = w7Var2;
        w7 w7Var3 = new w7("UNLIMITED", 2);
        UNLIMITED = w7Var3;
        a = new w7[]{w7Var, w7Var2, w7Var3};
    }

    public static w7 valueOf(String str) {
        return (w7) Enum.valueOf(w7.class, str);
    }

    public static w7[] values() {
        return (w7[]) a.clone();
    }
}
