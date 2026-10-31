package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u4 {
    public static final u4 a;
    public static final u4 b;
    public static final /* synthetic */ u4[] c;

    static {
        u4 u4Var = new u4("BACK", 0);
        a = u4Var;
        u4 u4Var2 = new u4("MENU", 1);
        b = u4Var2;
        c = new u4[]{u4Var, u4Var2};
    }

    public static u4 valueOf(String str) {
        return (u4) Enum.valueOf(u4.class, str);
    }

    public static u4[] values() {
        return (u4[]) c.clone();
    }
}
