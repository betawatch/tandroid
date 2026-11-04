package ai;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v5 {
    public static final v5 a;
    public static final v5 b;
    public static final v5 c;
    public static final /* synthetic */ v5[] d;

    static {
        v5 v5Var = new v5("BY_PRICE", 0);
        a = v5Var;
        v5 v5Var2 = new v5("BY_DATE", 1);
        b = v5Var2;
        v5 v5Var3 = new v5("BY_NUMBER", 2);
        c = v5Var3;
        d = new v5[]{v5Var, v5Var2, v5Var3};
    }

    public static v5 valueOf(String str) {
        return (v5) Enum.valueOf(v5.class, str);
    }

    public static v5[] values() {
        return (v5[]) d.clone();
    }
}
