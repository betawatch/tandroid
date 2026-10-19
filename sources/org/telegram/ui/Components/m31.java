package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class m31 {
    public static final m31 a;
    public static final m31 b;
    public static final m31 c;
    public static final /* synthetic */ m31[] d;

    static {
        m31 m31Var = new m31("TOP", 0);
        a = m31Var;
        m31 m31Var2 = new m31("LEFT", 1);
        b = m31Var2;
        m31 m31Var3 = new m31("BOTTOM", 2);
        c = m31Var3;
        d = new m31[]{m31Var, m31Var2, m31Var3};
    }

    public static m31 valueOf(String str) {
        return (m31) Enum.valueOf(m31.class, str);
    }

    public static m31[] values() {
        return (m31[]) d.clone();
    }
}
