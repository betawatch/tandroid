package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o4 {
    public static final o4 a;
    public static final o4 b;
    public static final /* synthetic */ o4[] c;

    static {
        o4 o4Var = new o4("BACK", 0);
        a = o4Var;
        o4 o4Var2 = new o4("MENU", 1);
        b = o4Var2;
        c = new o4[]{o4Var, o4Var2};
    }

    public static o4 valueOf(String str) {
        return (o4) Enum.valueOf(o4.class, str);
    }

    public static o4[] values() {
        return (o4[]) c.clone();
    }
}
