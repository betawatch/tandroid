package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zv0 {
    public static final zv0 a;
    public static final zv0 b;
    public static final /* synthetic */ zv0[] c;

    static {
        zv0 zv0Var = new zv0("DEFAULT", 0);
        a = zv0Var;
        zv0 zv0Var2 = new zv0("RECORDING", 1);
        b = zv0Var2;
        c = new zv0[]{zv0Var, zv0Var2};
    }

    public static zv0 valueOf(String str) {
        return (zv0) Enum.valueOf(zv0.class, str);
    }

    public static zv0[] values() {
        return (zv0[]) c.clone();
    }
}
