package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class tm0 {
    public static final tm0 a;
    public static final tm0 b;
    public static final /* synthetic */ tm0[] c;

    static {
        tm0 tm0Var = new tm0("LINE", 0);
        a = tm0Var;
        tm0 tm0Var2 = new tm0("TAB", 1);
        b = tm0Var2;
        c = new tm0[]{tm0Var, tm0Var2};
    }

    public static tm0 valueOf(String str) {
        return (tm0) Enum.valueOf(tm0.class, str);
    }

    public static tm0[] values() {
        return (tm0[]) c.clone();
    }
}
