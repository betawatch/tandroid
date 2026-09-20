package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
