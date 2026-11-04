package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c11 {
    public static final c11 a;
    public static final c11 b;
    public static final c11 c;
    public static final /* synthetic */ c11[] d;

    static {
        c11 c11Var = new c11("TOP", 0);
        a = c11Var;
        c11 c11Var2 = new c11("LEFT", 1);
        b = c11Var2;
        c11 c11Var3 = new c11("BOTTOM", 2);
        c = c11Var3;
        d = new c11[]{c11Var, c11Var2, c11Var3};
    }

    public static c11 valueOf(String str) {
        return (c11) Enum.valueOf(c11.class, str);
    }

    public static c11[] values() {
        return (c11[]) d.clone();
    }
}
