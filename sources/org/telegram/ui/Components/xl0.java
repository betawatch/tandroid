package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class xl0 {
    public static final xl0 a;
    public static final xl0 b;
    public static final /* synthetic */ xl0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    xl0 EF0;

    static {
        xl0 xl0Var = new xl0("FULL_BACKGROUND", 0);
        xl0 xl0Var2 = new xl0("SECTION_COLOR_BACKGROUND", 1);
        xl0 xl0Var3 = new xl0("OPTIMIZED_BACKGROUND", 2);
        a = xl0Var3;
        xl0 xl0Var4 = new xl0("DRAW_VERTICES", 3);
        b = xl0Var4;
        c = new xl0[]{xl0Var, xl0Var2, xl0Var3, xl0Var4};
    }

    public static xl0 valueOf(String str) {
        return (xl0) Enum.valueOf(xl0.class, str);
    }

    public static xl0[] values() {
        return (xl0[]) c.clone();
    }
}
