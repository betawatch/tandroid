package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class vm0 {
    public static final vm0 a;
    public static final vm0 b;
    public static final /* synthetic */ vm0[] c;

    static {
        vm0 vm0Var = new vm0("LINE", 0);
        a = vm0Var;
        vm0 vm0Var2 = new vm0("TAB", 1);
        b = vm0Var2;
        c = new vm0[]{vm0Var, vm0Var2};
    }

    public static vm0 valueOf(String str) {
        return (vm0) Enum.valueOf(vm0.class, str);
    }

    public static vm0[] values() {
        return (vm0[]) c.clone();
    }
}
