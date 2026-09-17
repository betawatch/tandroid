package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class a4 {
    public static final a4 a;
    public static final a4 b;
    public static final a4 c;
    public static final /* synthetic */ a4[] d;

    static {
        a4 a4Var = new a4("NONE", 0);
        a = a4Var;
        a4 a4Var2 = new a4("VERTICAL", 1);
        b = a4Var2;
        a4 a4Var3 = new a4("FULL", 2);
        c = a4Var3;
        d = new a4[]{a4Var, a4Var2, a4Var3};
    }

    public static a4 valueOf(String str) {
        return (a4) Enum.valueOf(a4.class, str);
    }

    public static a4[] values() {
        return (a4[]) d.clone();
    }
}
