package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class c4 {
    public static final c4 a;
    public static final c4 b;
    public static final c4 c;
    public static final /* synthetic */ c4[] d;

    static {
        c4 c4Var = new c4("NONE", 0);
        a = c4Var;
        c4 c4Var2 = new c4("VERTICAL", 1);
        b = c4Var2;
        c4 c4Var3 = new c4("FULL", 2);
        c = c4Var3;
        d = new c4[]{c4Var, c4Var2, c4Var3};
    }

    public static c4 valueOf(String str) {
        return (c4) Enum.valueOf(c4.class, str);
    }

    public static c4[] values() {
        return (c4[]) d.clone();
    }
}
