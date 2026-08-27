package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z11 {
    public static final z11 a;
    public static final z11 b;
    public static final z11 c;
    public static final /* synthetic */ z11[] d;

    static {
        z11 z11Var = new z11("TOP", 0);
        a = z11Var;
        z11 z11Var2 = new z11("LEFT", 1);
        b = z11Var2;
        z11 z11Var3 = new z11("BOTTOM", 2);
        c = z11Var3;
        d = new z11[]{z11Var, z11Var2, z11Var3};
    }

    public static z11 valueOf(String str) {
        return (z11) Enum.valueOf(z11.class, str);
    }

    public static z11[] values() {
        return (z11[]) d.clone();
    }
}
