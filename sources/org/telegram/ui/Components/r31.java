package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class r31 {
    public static final r31 a;
    public static final r31 b;
    public static final r31 c;
    public static final /* synthetic */ r31[] d;

    static {
        r31 r31Var = new r31("TOP", 0);
        a = r31Var;
        r31 r31Var2 = new r31("LEFT", 1);
        b = r31Var2;
        r31 r31Var3 = new r31("BOTTOM", 2);
        c = r31Var3;
        d = new r31[]{r31Var, r31Var2, r31Var3};
    }

    public static r31 valueOf(String str) {
        return (r31) Enum.valueOf(r31.class, str);
    }

    public static r31[] values() {
        return (r31[]) d.clone();
    }
}
