package bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class u7 {
    public static final u7 a;
    public static final u7 b;
    public static final u7 c;
    public static final /* synthetic */ u7[] d;

    static {
        u7 u7Var = new u7("BY_PRICE", 0);
        a = u7Var;
        u7 u7Var2 = new u7("BY_DATE", 1);
        b = u7Var2;
        u7 u7Var3 = new u7("BY_NUMBER", 2);
        c = u7Var3;
        d = new u7[]{u7Var, u7Var2, u7Var3};
    }

    public static u7 valueOf(String str) {
        return (u7) Enum.valueOf(u7.class, str);
    }

    public static u7[] values() {
        return (u7[]) d.clone();
    }
}
