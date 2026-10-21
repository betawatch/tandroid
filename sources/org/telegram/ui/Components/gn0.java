package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class gn0 {
    public static final gn0 a;
    public static final gn0 b;
    public static final /* synthetic */ gn0[] c;

    static {
        gn0 gn0Var = new gn0("LINE", 0);
        a = gn0Var;
        gn0 gn0Var2 = new gn0("TAB", 1);
        b = gn0Var2;
        c = new gn0[]{gn0Var, gn0Var2};
    }

    public static gn0 valueOf(String str) {
        return (gn0) Enum.valueOf(gn0.class, str);
    }

    public static gn0[] values() {
        return (gn0[]) c.clone();
    }
}
