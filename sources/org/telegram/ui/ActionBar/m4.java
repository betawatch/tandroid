package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m4 {
    public static final m4 a;
    public static final m4 b;
    public static final /* synthetic */ m4[] c;

    static {
        m4 m4Var = new m4("BACK", 0);
        a = m4Var;
        m4 m4Var2 = new m4("MENU", 1);
        b = m4Var2;
        c = new m4[]{m4Var, m4Var2};
    }

    public static m4 valueOf(String str) {
        return (m4) Enum.valueOf(m4.class, str);
    }

    public static m4[] values() {
        return (m4[]) c.clone();
    }
}
