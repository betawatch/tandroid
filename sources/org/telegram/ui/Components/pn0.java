package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class pn0 {
    public static final pn0 a;
    public static final pn0 b;
    public static final /* synthetic */ pn0[] c;

    static {
        pn0 pn0Var = new pn0("LINE", 0);
        a = pn0Var;
        pn0 pn0Var2 = new pn0("TAB", 1);
        b = pn0Var2;
        c = new pn0[]{pn0Var, pn0Var2};
    }

    public static pn0 valueOf(String str) {
        return (pn0) Enum.valueOf(pn0.class, str);
    }

    public static pn0[] values() {
        return (pn0[]) c.clone();
    }
}
