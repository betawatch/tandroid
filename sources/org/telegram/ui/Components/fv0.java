package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fv0 {
    public static final fv0 a;
    public static final fv0 b;
    public static final /* synthetic */ fv0[] c;

    static {
        fv0 fv0Var = new fv0("DEFAULT", 0);
        a = fv0Var;
        fv0 fv0Var2 = new fv0("RECORDING", 1);
        b = fv0Var2;
        c = new fv0[]{fv0Var, fv0Var2};
    }

    public static fv0 valueOf(String str) {
        return (fv0) Enum.valueOf(fv0.class, str);
    }

    public static fv0[] values() {
        return (fv0[]) c.clone();
    }
}
