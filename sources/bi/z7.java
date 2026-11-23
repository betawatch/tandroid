package bi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z7 {
    public static final z7 a;
    public static final z7 b;
    public static final z7 c;
    public static final /* synthetic */ z7[] d;

    static {
        z7 z7Var = new z7("BY_PRICE", 0);
        a = z7Var;
        z7 z7Var2 = new z7("BY_DATE", 1);
        b = z7Var2;
        z7 z7Var3 = new z7("BY_NUMBER", 2);
        c = z7Var3;
        d = new z7[]{z7Var, z7Var2, z7Var3};
    }

    public static z7 valueOf(String str) {
        return (z7) Enum.valueOf(z7.class, str);
    }

    public static z7[] values() {
        return (z7[]) d.clone();
    }
}
