package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u31 {
    public static final u31 a;
    public static final u31 b;
    public static final u31 c;
    public static final /* synthetic */ u31[] d;

    static {
        u31 u31Var = new u31("TOP", 0);
        a = u31Var;
        u31 u31Var2 = new u31("LEFT", 1);
        b = u31Var2;
        u31 u31Var3 = new u31("BOTTOM", 2);
        c = u31Var3;
        d = new u31[]{u31Var, u31Var2, u31Var3};
    }

    public static u31 valueOf(String str) {
        return (u31) Enum.valueOf(u31.class, str);
    }

    public static u31[] values() {
        return (u31[]) d.clone();
    }
}
