package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dv0 {
    public static final dv0 a;
    public static final dv0 b;
    public static final /* synthetic */ dv0[] c;

    static {
        dv0 dv0Var = new dv0("DEFAULT", 0);
        a = dv0Var;
        dv0 dv0Var2 = new dv0("RECORDING", 1);
        b = dv0Var2;
        c = new dv0[]{dv0Var, dv0Var2};
    }

    public static dv0 valueOf(String str) {
        return (dv0) Enum.valueOf(dv0.class, str);
    }

    public static dv0[] values() {
        return (dv0[]) c.clone();
    }
}
