package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fu0 {
    public static final fu0 a;
    public static final fu0 b;
    public static final /* synthetic */ fu0[] c;

    static {
        fu0 fu0Var = new fu0("DEFAULT", 0);
        a = fu0Var;
        fu0 fu0Var2 = new fu0("RECORDING", 1);
        b = fu0Var2;
        c = new fu0[]{fu0Var, fu0Var2};
    }

    public static fu0 valueOf(String str) {
        return (fu0) Enum.valueOf(fu0.class, str);
    }

    public static fu0[] values() {
        return (fu0[]) c.clone();
    }
}
