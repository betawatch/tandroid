package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class t5 {
    public static final t5 a;
    public static final t5 b;
    public static final /* synthetic */ t5[] c;

    static {
        t5 t5Var = new t5("GLASS", 0);
        a = t5Var;
        t5 t5Var2 = new t5("ACCENT", 1);
        b = t5Var2;
        c = new t5[]{t5Var, t5Var2};
    }

    public static t5 valueOf(String str) {
        return (t5) Enum.valueOf(t5.class, str);
    }

    public static t5[] values() {
        return (t5[]) c.clone();
    }
}
