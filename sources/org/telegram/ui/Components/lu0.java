package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lu0 {
    public static final lu0 a;
    public static final lu0 b;
    public static final /* synthetic */ lu0[] c;

    static {
        lu0 lu0Var = new lu0("DEFAULT", 0);
        a = lu0Var;
        lu0 lu0Var2 = new lu0("RECORDING", 1);
        b = lu0Var2;
        c = new lu0[]{lu0Var, lu0Var2};
    }

    public static lu0 valueOf(String str) {
        return (lu0) Enum.valueOf(lu0.class, str);
    }

    public static lu0[] values() {
        return (lu0[]) c.clone();
    }
}
