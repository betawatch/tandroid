package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class l21 {
    public static final l21 a;
    public static final l21 b;
    public static final l21 c;
    public static final /* synthetic */ l21[] d;

    static {
        l21 l21Var = new l21("TOP", 0);
        a = l21Var;
        l21 l21Var2 = new l21("LEFT", 1);
        b = l21Var2;
        l21 l21Var3 = new l21("BOTTOM", 2);
        c = l21Var3;
        d = new l21[]{l21Var, l21Var2, l21Var3};
    }

    public static l21 valueOf(String str) {
        return (l21) Enum.valueOf(l21.class, str);
    }

    public static l21[] values() {
        return (l21[]) d.clone();
    }
}
