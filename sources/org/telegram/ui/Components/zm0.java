package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class zm0 {
    public static final zm0 a;
    public static final zm0 b;
    public static final /* synthetic */ zm0[] c;

    static {
        zm0 zm0Var = new zm0("LINE", 0);
        a = zm0Var;
        zm0 zm0Var2 = new zm0("TAB", 1);
        b = zm0Var2;
        c = new zm0[]{zm0Var, zm0Var2};
    }

    public static zm0 valueOf(String str) {
        return (zm0) Enum.valueOf(zm0.class, str);
    }

    public static zm0[] values() {
        return (zm0[]) c.clone();
    }
}
