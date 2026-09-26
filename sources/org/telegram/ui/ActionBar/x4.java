package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
