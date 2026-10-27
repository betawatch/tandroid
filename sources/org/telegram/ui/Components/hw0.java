package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hw0 {
    public static final hw0 a;
    public static final hw0 b;
    public static final /* synthetic */ hw0[] c;

    static {
        hw0 hw0Var = new hw0("DEFAULT", 0);
        a = hw0Var;
        hw0 hw0Var2 = new hw0("RECORDING", 1);
        b = hw0Var2;
        c = new hw0[]{hw0Var, hw0Var2};
    }

    public static hw0 valueOf(String str) {
        return (hw0) Enum.valueOf(hw0.class, str);
    }

    public static hw0[] values() {
        return (hw0[]) c.clone();
    }
}
