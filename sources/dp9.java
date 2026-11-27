// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dp9 {
    public static final dp9 a;
    public static final dp9 b;
    public static final dp9 c;
    public static final /* synthetic */ dp9[] d;

    static {
        dp9 dp9Var = new dp9("HIGH", 0);
        a = dp9Var;
        dp9 dp9Var2 = new dp9("MEDIUM", 1);
        b = dp9Var2;
        dp9 dp9Var3 = new dp9("LOW", 2);
        c = dp9Var3;
        d = new dp9[]{dp9Var, dp9Var2, dp9Var3};
    }

    public static dp9 valueOf(String str) {
        return (dp9) Enum.valueOf(dp9.class, str);
    }

    public static dp9[] values() {
        return (dp9[]) d.clone();
    }
}
