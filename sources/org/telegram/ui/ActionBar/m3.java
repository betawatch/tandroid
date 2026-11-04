package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m3 {
    public static final m3 a;
    public static final m3 b;
    public static final m3 c;
    public static final /* synthetic */ m3[] d;

    static {
        m3 m3Var = new m3("NONE", 0);
        a = m3Var;
        m3 m3Var2 = new m3("VERTICAL", 1);
        b = m3Var2;
        m3 m3Var3 = new m3("FULL", 2);
        c = m3Var3;
        d = new m3[]{m3Var, m3Var2, m3Var3};
    }

    public static m3 valueOf(String str) {
        return (m3) Enum.valueOf(m3.class, str);
    }

    public static m3[] values() {
        return (m3[]) d.clone();
    }
}
