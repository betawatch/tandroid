package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class i11 {
    public static final i11 a;
    public static final i11 b;
    public static final i11 c;
    public static final /* synthetic */ i11[] d;

    static {
        i11 i11Var = new i11("TOP", 0);
        a = i11Var;
        i11 i11Var2 = new i11("LEFT", 1);
        b = i11Var2;
        i11 i11Var3 = new i11("BOTTOM", 2);
        c = i11Var3;
        d = new i11[]{i11Var, i11Var2, i11Var3};
    }

    public static i11 valueOf(String str) {
        return (i11) Enum.valueOf(i11.class, str);
    }

    public static i11[] values() {
        return (i11[]) d.clone();
    }
}
