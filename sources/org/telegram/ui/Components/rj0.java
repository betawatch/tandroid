package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rj0 {
    public static final rj0 a;
    public static final rj0 b;
    public static final /* synthetic */ rj0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    rj0 EF0;

    static {
        rj0 rj0Var = new rj0("FULL_BACKGROUND", 0);
        rj0 rj0Var2 = new rj0("SECTION_COLOR_BACKGROUND", 1);
        rj0 rj0Var3 = new rj0("OPTIMIZED_BACKGROUND", 2);
        a = rj0Var3;
        rj0 rj0Var4 = new rj0("DRAW_VERTICES", 3);
        b = rj0Var4;
        c = new rj0[]{rj0Var, rj0Var2, rj0Var3, rj0Var4};
    }

    public static rj0 valueOf(String str) {
        return (rj0) Enum.valueOf(rj0.class, str);
    }

    public static rj0[] values() {
        return (rj0[]) c.clone();
    }
}
