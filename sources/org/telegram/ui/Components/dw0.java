package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dw0 {
    public static final dw0 a;
    public static final dw0 b;
    public static final /* synthetic */ dw0[] c;

    static {
        dw0 dw0Var = new dw0("DEFAULT", 0);
        a = dw0Var;
        dw0 dw0Var2 = new dw0("RECORDING", 1);
        b = dw0Var2;
        c = new dw0[]{dw0Var, dw0Var2};
    }

    public static dw0 valueOf(String str) {
        return (dw0) Enum.valueOf(dw0.class, str);
    }

    public static dw0[] values() {
        return (dw0[]) c.clone();
    }
}
