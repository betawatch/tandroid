package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class t21 {
    public static final t21 a;
    public static final t21 b;
    public static final t21 c;
    public static final /* synthetic */ t21[] d;

    static {
        t21 t21Var = new t21("TOP", 0);
        a = t21Var;
        t21 t21Var2 = new t21("LEFT", 1);
        b = t21Var2;
        t21 t21Var3 = new t21("BOTTOM", 2);
        c = t21Var3;
        d = new t21[]{t21Var, t21Var2, t21Var3};
    }

    public static t21 valueOf(String str) {
        return (t21) Enum.valueOf(t21.class, str);
    }

    public static t21[] values() {
        return (t21[]) d.clone();
    }
}
