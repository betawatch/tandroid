package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e4 {
    public static final e4 a;
    public static final e4 b;
    public static final e4 c;
    public static final /* synthetic */ e4[] d;

    static {
        e4 e4Var = new e4("NONE", 0);
        a = e4Var;
        e4 e4Var2 = new e4("VERTICAL", 1);
        b = e4Var2;
        e4 e4Var3 = new e4("FULL", 2);
        c = e4Var3;
        d = new e4[]{e4Var, e4Var2, e4Var3};
    }

    public static e4 valueOf(String str) {
        return (e4) Enum.valueOf(e4.class, str);
    }

    public static e4[] values() {
        return (e4[]) d.clone();
    }
}
