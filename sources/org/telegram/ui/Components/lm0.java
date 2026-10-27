package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lm0 {
    public static final lm0 a;
    public static final lm0 b;
    public static final /* synthetic */ lm0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    lm0 EF0;

    static {
        lm0 lm0Var = new lm0("FULL_BACKGROUND", 0);
        lm0 lm0Var2 = new lm0("SECTION_COLOR_BACKGROUND", 1);
        lm0 lm0Var3 = new lm0("OPTIMIZED_BACKGROUND", 2);
        a = lm0Var3;
        lm0 lm0Var4 = new lm0("DRAW_VERTICES", 3);
        b = lm0Var4;
        c = new lm0[]{lm0Var, lm0Var2, lm0Var3, lm0Var4};
    }

    public static lm0 valueOf(String str) {
        return (lm0) Enum.valueOf(lm0.class, str);
    }

    public static lm0[] values() {
        return (lm0[]) c.clone();
    }
}
