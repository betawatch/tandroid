package db;

import b8.zc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b1 {
    public static final b1 a;
    public static final b1 b;
    public static final /* synthetic */ b1[] c;

    static {
        b1 b1Var = new b1("GENERAL", 0);
        a = b1Var;
        b1 b1Var2 = new b1("FALLBACK", 1);
        b = b1Var2;
        b1[] b1VarArr = {b1Var, b1Var2};
        c = b1VarArr;
        zc.a(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) c.clone();
    }
}
