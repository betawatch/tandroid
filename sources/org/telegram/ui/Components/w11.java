package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w11 {
    public static final w11 a;
    public static final w11 b;
    public static final w11 c;
    public static final /* synthetic */ w11[] d;

    static {
        w11 w11Var = new w11("TOP", 0);
        a = w11Var;
        w11 w11Var2 = new w11("LEFT", 1);
        b = w11Var2;
        w11 w11Var3 = new w11("BOTTOM", 2);
        c = w11Var3;
        d = new w11[]{w11Var, w11Var2, w11Var3};
    }

    public static w11 valueOf(String str) {
        return (w11) Enum.valueOf(w11.class, str);
    }

    public static w11[] values() {
        return (w11[]) d.clone();
    }
}
