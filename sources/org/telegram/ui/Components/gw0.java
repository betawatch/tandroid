package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gw0 {
    public static final gw0 a;
    public static final gw0 b;
    public static final /* synthetic */ gw0[] c;

    static {
        gw0 gw0Var = new gw0("DEFAULT", 0);
        a = gw0Var;
        gw0 gw0Var2 = new gw0("RECORDING", 1);
        b = gw0Var2;
        c = new gw0[]{gw0Var, gw0Var2};
    }

    public static gw0 valueOf(String str) {
        return (gw0) Enum.valueOf(gw0.class, str);
    }

    public static gw0[] values() {
        return (gw0[]) c.clone();
    }
}
