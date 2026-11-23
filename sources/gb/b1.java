package gb;

import c8.h9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        h9.a(b1VarArr);
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) c.clone();
    }
}
