package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
