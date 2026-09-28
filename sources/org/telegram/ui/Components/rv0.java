package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class rv0 {
    public static final rv0 a;
    public static final rv0 b;
    public static final /* synthetic */ rv0[] c;

    static {
        rv0 rv0Var = new rv0("DEFAULT", 0);
        a = rv0Var;
        rv0 rv0Var2 = new rv0("RECORDING", 1);
        b = rv0Var2;
        c = new rv0[]{rv0Var, rv0Var2};
    }

    public static rv0 valueOf(String str) {
        return (rv0) Enum.valueOf(rv0.class, str);
    }

    public static rv0[] values() {
        return (rv0[]) c.clone();
    }
}
