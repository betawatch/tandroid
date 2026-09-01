package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class pm0 {
    public static final pm0 a;
    public static final pm0 b;
    public static final /* synthetic */ pm0[] c;

    static {
        pm0 pm0Var = new pm0("LINE", 0);
        a = pm0Var;
        pm0 pm0Var2 = new pm0("TAB", 1);
        b = pm0Var2;
        c = new pm0[]{pm0Var, pm0Var2};
    }

    public static pm0 valueOf(String str) {
        return (pm0) Enum.valueOf(pm0.class, str);
    }

    public static pm0[] values() {
        return (pm0[]) c.clone();
    }
}
