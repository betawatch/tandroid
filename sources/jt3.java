// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class jt3 {
    public static final jt3 a;
    public static final jt3 b;
    public static final jt3 c;
    public static final /* synthetic */ jt3[] d;

    static {
        jt3 jt3Var = new jt3("NONE", 0);
        a = jt3Var;
        jt3 jt3Var2 = new jt3("VERTICAL", 1);
        b = jt3Var2;
        jt3 jt3Var3 = new jt3("FULL", 2);
        c = jt3Var3;
        d = new jt3[]{jt3Var, jt3Var2, jt3Var3};
    }

    public static jt3 valueOf(String str) {
        return (jt3) Enum.valueOf(jt3.class, str);
    }

    public static jt3[] values() {
        return (jt3[]) d.clone();
    }
}
