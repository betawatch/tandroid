package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nt0 {
    public static final nt0 a;
    public static final nt0 b;
    public static final /* synthetic */ nt0[] c;

    static {
        nt0 nt0Var = new nt0("DEFAULT", 0);
        a = nt0Var;
        nt0 nt0Var2 = new nt0("RECORDING", 1);
        b = nt0Var2;
        c = new nt0[]{nt0Var, nt0Var2};
    }

    public static nt0 valueOf(String str) {
        return (nt0) Enum.valueOf(nt0.class, str);
    }

    public static nt0[] values() {
        return (nt0[]) c.clone();
    }
}
