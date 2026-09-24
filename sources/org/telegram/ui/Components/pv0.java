package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class pv0 {
    public static final pv0 a;
    public static final pv0 b;
    public static final /* synthetic */ pv0[] c;

    static {
        pv0 pv0Var = new pv0("DEFAULT", 0);
        a = pv0Var;
        pv0 pv0Var2 = new pv0("RECORDING", 1);
        b = pv0Var2;
        c = new pv0[]{pv0Var, pv0Var2};
    }

    public static pv0 valueOf(String str) {
        return (pv0) Enum.valueOf(pv0.class, str);
    }

    public static pv0[] values() {
        return (pv0[]) c.clone();
    }
}
