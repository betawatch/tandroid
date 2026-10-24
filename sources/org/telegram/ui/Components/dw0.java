package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dw0 {
    public static final dw0 a;
    public static final dw0 b;
    public static final /* synthetic */ dw0[] c;

    static {
        dw0 dw0Var = new dw0("DEFAULT", 0);
        a = dw0Var;
        dw0 dw0Var2 = new dw0("RECORDING", 1);
        b = dw0Var2;
        c = new dw0[]{dw0Var, dw0Var2};
    }

    public static dw0 valueOf(String str) {
        return (dw0) Enum.valueOf(dw0.class, str);
    }

    public static dw0[] values() {
        return (dw0[]) c.clone();
    }
}
