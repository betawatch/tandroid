package bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class w7 {
    public static final w7 a;
    public static final w7 b;
    public static final w7 c;
    public static final /* synthetic */ w7[] d;

    static {
        w7 w7Var = new w7("BY_PRICE", 0);
        a = w7Var;
        w7 w7Var2 = new w7("BY_DATE", 1);
        b = w7Var2;
        w7 w7Var3 = new w7("BY_NUMBER", 2);
        c = w7Var3;
        d = new w7[]{w7Var, w7Var2, w7Var3};
    }

    public static w7 valueOf(String str) {
        return (w7) Enum.valueOf(w7.class, str);
    }

    public static w7[] values() {
        return (w7[]) d.clone();
    }
}
