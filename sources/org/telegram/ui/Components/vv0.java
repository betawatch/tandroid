package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class vv0 {
    public static final vv0 a;
    public static final vv0 b;
    public static final /* synthetic */ vv0[] c;

    static {
        vv0 vv0Var = new vv0("DEFAULT", 0);
        a = vv0Var;
        vv0 vv0Var2 = new vv0("RECORDING", 1);
        b = vv0Var2;
        c = new vv0[]{vv0Var, vv0Var2};
    }

    public static vv0 valueOf(String str) {
        return (vv0) Enum.valueOf(vv0.class, str);
    }

    public static vv0[] values() {
        return (vv0[]) c.clone();
    }
}
