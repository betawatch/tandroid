package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class h31 {
    public static final h31 a;
    public static final h31 b;
    public static final h31 c;
    public static final /* synthetic */ h31[] d;

    static {
        h31 h31Var = new h31("TOP", 0);
        a = h31Var;
        h31 h31Var2 = new h31("LEFT", 1);
        b = h31Var2;
        h31 h31Var3 = new h31("BOTTOM", 2);
        c = h31Var3;
        d = new h31[]{h31Var, h31Var2, h31Var3};
    }

    public static h31 valueOf(String str) {
        return (h31) Enum.valueOf(h31.class, str);
    }

    public static h31[] values() {
        return (h31[]) d.clone();
    }
}
