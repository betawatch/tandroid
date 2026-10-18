package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class yv0 {
    public static final yv0 a;
    public static final yv0 b;
    public static final /* synthetic */ yv0[] c;

    static {
        yv0 yv0Var = new yv0("DEFAULT", 0);
        a = yv0Var;
        yv0 yv0Var2 = new yv0("RECORDING", 1);
        b = yv0Var2;
        c = new yv0[]{yv0Var, yv0Var2};
    }

    public static yv0 valueOf(String str) {
        return (yv0) Enum.valueOf(yv0.class, str);
    }

    public static yv0[] values() {
        return (yv0[]) c.clone();
    }
}
