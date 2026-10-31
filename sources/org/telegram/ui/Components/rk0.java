package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rk0 {
    public static final rk0 a;
    public static final rk0 b;
    public static final /* synthetic */ rk0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    rk0 EF0;

    static {
        rk0 rk0Var = new rk0("FULL_BACKGROUND", 0);
        rk0 rk0Var2 = new rk0("SECTION_COLOR_BACKGROUND", 1);
        rk0 rk0Var3 = new rk0("OPTIMIZED_BACKGROUND", 2);
        a = rk0Var3;
        rk0 rk0Var4 = new rk0("DRAW_VERTICES", 3);
        b = rk0Var4;
        c = new rk0[]{rk0Var, rk0Var2, rk0Var3, rk0Var4};
    }

    public static rk0 valueOf(String str) {
        return (rk0) Enum.valueOf(rk0.class, str);
    }

    public static rk0[] values() {
        return (rk0[]) c.clone();
    }
}
