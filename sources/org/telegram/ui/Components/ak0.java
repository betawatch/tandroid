package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ak0 {
    public static final ak0 a;
    public static final ak0 b;
    public static final /* synthetic */ ak0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ak0 EF0;

    static {
        ak0 ak0Var = new ak0("FULL_BACKGROUND", 0);
        ak0 ak0Var2 = new ak0("SECTION_COLOR_BACKGROUND", 1);
        ak0 ak0Var3 = new ak0("OPTIMIZED_BACKGROUND", 2);
        a = ak0Var3;
        ak0 ak0Var4 = new ak0("DRAW_VERTICES", 3);
        b = ak0Var4;
        c = new ak0[]{ak0Var, ak0Var2, ak0Var3, ak0Var4};
    }

    public static ak0 valueOf(String str) {
        return (ak0) Enum.valueOf(ak0.class, str);
    }

    public static ak0[] values() {
        return (ak0[]) c.clone();
    }
}
