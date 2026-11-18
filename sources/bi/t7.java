package bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class t7 {
    public static final t7 a;
    public static final t7 b;
    public static final t7 c;
    public static final /* synthetic */ t7[] d;

    static {
        t7 t7Var = new t7("BY_PRICE", 0);
        a = t7Var;
        t7 t7Var2 = new t7("BY_DATE", 1);
        b = t7Var2;
        t7 t7Var3 = new t7("BY_NUMBER", 2);
        c = t7Var3;
        d = new t7[]{t7Var, t7Var2, t7Var3};
    }

    public static t7 valueOf(String str) {
        return (t7) Enum.valueOf(t7.class, str);
    }

    public static t7[] values() {
        return (t7[]) d.clone();
    }
}
