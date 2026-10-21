package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class n31 {
    public static final n31 a;
    public static final n31 b;
    public static final n31 c;
    public static final /* synthetic */ n31[] d;

    static {
        n31 n31Var = new n31("TOP", 0);
        a = n31Var;
        n31 n31Var2 = new n31("LEFT", 1);
        b = n31Var2;
        n31 n31Var3 = new n31("BOTTOM", 2);
        c = n31Var3;
        d = new n31[]{n31Var, n31Var2, n31Var3};
    }

    public static n31 valueOf(String str) {
        return (n31) Enum.valueOf(n31.class, str);
    }

    public static n31[] values() {
        return (n31[]) d.clone();
    }
}
