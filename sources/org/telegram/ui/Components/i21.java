package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i21 {
    public static final i21 a;
    public static final i21 b;
    public static final i21 c;
    public static final /* synthetic */ i21[] d;

    static {
        i21 i21Var = new i21("TOP", 0);
        a = i21Var;
        i21 i21Var2 = new i21("LEFT", 1);
        b = i21Var2;
        i21 i21Var3 = new i21("BOTTOM", 2);
        c = i21Var3;
        d = new i21[]{i21Var, i21Var2, i21Var3};
    }

    public static i21 valueOf(String str) {
        return (i21) Enum.valueOf(i21.class, str);
    }

    public static i21[] values() {
        return (i21[]) d.clone();
    }
}
