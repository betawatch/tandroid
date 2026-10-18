package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class l31 {
    public static final l31 a;
    public static final l31 b;
    public static final l31 c;
    public static final /* synthetic */ l31[] d;

    static {
        l31 l31Var = new l31("TOP", 0);
        a = l31Var;
        l31 l31Var2 = new l31("LEFT", 1);
        b = l31Var2;
        l31 l31Var3 = new l31("BOTTOM", 2);
        c = l31Var3;
        d = new l31[]{l31Var, l31Var2, l31Var3};
    }

    public static l31 valueOf(String str) {
        return (l31) Enum.valueOf(l31.class, str);
    }

    public static l31[] values() {
        return (l31[]) d.clone();
    }
}
