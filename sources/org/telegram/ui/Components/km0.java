package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class km0 {
    public static final km0 a;
    public static final km0 b;
    public static final /* synthetic */ km0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    km0 EF0;

    static {
        km0 km0Var = new km0("FULL_BACKGROUND", 0);
        km0 km0Var2 = new km0("SECTION_COLOR_BACKGROUND", 1);
        km0 km0Var3 = new km0("OPTIMIZED_BACKGROUND", 2);
        a = km0Var3;
        km0 km0Var4 = new km0("DRAW_VERTICES", 3);
        b = km0Var4;
        c = new km0[]{km0Var, km0Var2, km0Var3, km0Var4};
    }

    public static km0 valueOf(String str) {
        return (km0) Enum.valueOf(km0.class, str);
    }

    public static km0[] values() {
        return (km0[]) c.clone();
    }
}
