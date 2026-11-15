package bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n5 {
    public static final n5 a;
    public static final n5 b;
    public static final n5 c;
    public static final /* synthetic */ n5[] d;

    static {
        n5 n5Var = new n5("BY_PRICE", 0);
        a = n5Var;
        n5 n5Var2 = new n5("BY_DATE", 1);
        b = n5Var2;
        n5 n5Var3 = new n5("BY_NUMBER", 2);
        c = n5Var3;
        d = new n5[]{n5Var, n5Var2, n5Var3};
    }

    public static n5 valueOf(String str) {
        return (n5) Enum.valueOf(n5.class, str);
    }

    public static n5[] values() {
        return (n5[]) d.clone();
    }
}
