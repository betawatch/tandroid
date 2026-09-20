package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class z4 {
    public static final z4 a;
    public static final z4 b;
    public static final /* synthetic */ z4[] c;

    static {
        z4 z4Var = new z4("BACK", 0);
        a = z4Var;
        z4 z4Var2 = new z4("MENU", 1);
        b = z4Var2;
        c = new z4[]{z4Var, z4Var2};
    }

    public static z4 valueOf(String str) {
        return (z4) Enum.valueOf(z4.class, str);
    }

    public static z4[] values() {
        return (z4[]) c.clone();
    }
}
