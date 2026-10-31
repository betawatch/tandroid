package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k21 {
    public static final k21 a;
    public static final k21 b;
    public static final k21 c;
    public static final /* synthetic */ k21[] d;

    static {
        k21 k21Var = new k21("TOP", 0);
        a = k21Var;
        k21 k21Var2 = new k21("LEFT", 1);
        b = k21Var2;
        k21 k21Var3 = new k21("BOTTOM", 2);
        c = k21Var3;
        d = new k21[]{k21Var, k21Var2, k21Var3};
    }

    public static k21 valueOf(String str) {
        return (k21) Enum.valueOf(k21.class, str);
    }

    public static k21[] values() {
        return (k21[]) d.clone();
    }
}
