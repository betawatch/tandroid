package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y31 {
    public static final y31 a;
    public static final y31 b;
    public static final y31 c;
    public static final /* synthetic */ y31[] d;

    static {
        y31 y31Var = new y31("TOP", 0);
        a = y31Var;
        y31 y31Var2 = new y31("LEFT", 1);
        b = y31Var2;
        y31 y31Var3 = new y31("BOTTOM", 2);
        c = y31Var3;
        d = new y31[]{y31Var, y31Var2, y31Var3};
    }

    public static y31 valueOf(String str) {
        return (y31) Enum.valueOf(y31.class, str);
    }

    public static y31[] values() {
        return (y31[]) d.clone();
    }
}
