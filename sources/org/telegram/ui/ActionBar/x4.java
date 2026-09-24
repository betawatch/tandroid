package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class x4 {
    public static final x4 a;
    public static final x4 b;
    public static final /* synthetic */ x4[] c;

    static {
        x4 x4Var = new x4("BACK", 0);
        a = x4Var;
        x4 x4Var2 = new x4("MENU", 1);
        b = x4Var2;
        c = new x4[]{x4Var, x4Var2};
    }

    public static x4 valueOf(String str) {
        return (x4) Enum.valueOf(x4.class, str);
    }

    public static x4[] values() {
        return (x4[]) c.clone();
    }
}
