package gb;

import c8.n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class a1 {
    public static final a1 a;
    public static final a1 b;
    public static final /* synthetic */ a1[] c;

    static {
        a1 a1Var = new a1("GENERAL", 0);
        a = a1Var;
        a1 a1Var2 = new a1("FALLBACK", 1);
        b = a1Var2;
        a1[] a1VarArr = {a1Var, a1Var2};
        c = a1VarArr;
        n1.a(a1VarArr);
    }

    public static a1 valueOf(String str) {
        return (a1) Enum.valueOf(a1.class, str);
    }

    public static a1[] values() {
        return (a1[]) c.clone();
    }
}
