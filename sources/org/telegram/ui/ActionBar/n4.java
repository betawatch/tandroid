package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class n4 {
    public static final n4 a;
    public static final n4 b;
    public static final /* synthetic */ n4[] c;

    static {
        n4 n4Var = new n4("BACK", 0);
        a = n4Var;
        n4 n4Var2 = new n4("MENU", 1);
        b = n4Var2;
        c = new n4[]{n4Var, n4Var2};
    }

    public static n4 valueOf(String str) {
        return (n4) Enum.valueOf(n4.class, str);
    }

    public static n4[] values() {
        return (n4[]) c.clone();
    }
}
