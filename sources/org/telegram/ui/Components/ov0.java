package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ov0 {
    public static final ov0 a;
    public static final ov0 b;
    public static final /* synthetic */ ov0[] c;

    static {
        ov0 ov0Var = new ov0("DEFAULT", 0);
        a = ov0Var;
        ov0 ov0Var2 = new ov0("RECORDING", 1);
        b = ov0Var2;
        c = new ov0[]{ov0Var, ov0Var2};
    }

    public static ov0 valueOf(String str) {
        return (ov0) Enum.valueOf(ov0.class, str);
    }

    public static ov0[] values() {
        return (ov0[]) c.clone();
    }
}
