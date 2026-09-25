package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class g31 {
    public static final g31 a;
    public static final g31 b;
    public static final g31 c;
    public static final /* synthetic */ g31[] d;

    static {
        g31 g31Var = new g31("TOP", 0);
        a = g31Var;
        g31 g31Var2 = new g31("LEFT", 1);
        b = g31Var2;
        g31 g31Var3 = new g31("BOTTOM", 2);
        c = g31Var3;
        d = new g31[]{g31Var, g31Var2, g31Var3};
    }

    public static g31 valueOf(String str) {
        return (g31) Enum.valueOf(g31.class, str);
    }

    public static g31[] values() {
        return (g31[]) d.clone();
    }
}
