package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class i31 {
    public static final i31 a;
    public static final i31 b;
    public static final i31 c;
    public static final /* synthetic */ i31[] d;

    static {
        i31 i31Var = new i31("TOP", 0);
        a = i31Var;
        i31 i31Var2 = new i31("LEFT", 1);
        b = i31Var2;
        i31 i31Var3 = new i31("BOTTOM", 2);
        c = i31Var3;
        d = new i31[]{i31Var, i31Var2, i31Var3};
    }

    public static i31 valueOf(String str) {
        return (i31) Enum.valueOf(i31.class, str);
    }

    public static i31[] values() {
        return (i31[]) d.clone();
    }
}
