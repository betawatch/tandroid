package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class b5 {
    public static final b5 a;
    public static final b5 b;
    public static final /* synthetic */ b5[] c;

    static {
        b5 b5Var = new b5("ICON", 0);
        a = b5Var;
        b5 b5Var2 = new b5("TEXT", 1);
        b = b5Var2;
        c = new b5[]{b5Var, b5Var2};
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) c.clone();
    }
}
