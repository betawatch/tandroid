package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o3 {
    public static final o3 a;
    public static final o3 b;
    public static final o3 c;
    public static final /* synthetic */ o3[] d;

    static {
        o3 o3Var = new o3("NONE", 0);
        a = o3Var;
        o3 o3Var2 = new o3("VERTICAL", 1);
        b = o3Var2;
        o3 o3Var3 = new o3("FULL", 2);
        c = o3Var3;
        d = new o3[]{o3Var, o3Var2, o3Var3};
    }

    public static o3 valueOf(String str) {
        return (o3) Enum.valueOf(o3.class, str);
    }

    public static o3[] values() {
        return (o3[]) d.clone();
    }
}
