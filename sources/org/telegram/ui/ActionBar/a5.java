package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a5 {
    public static final a5 a;
    public static final a5 b;
    public static final /* synthetic */ a5[] c;

    static {
        a5 a5Var = new a5("GLASS", 0);
        a = a5Var;
        a5 a5Var2 = new a5("ACCENT", 1);
        b = a5Var2;
        c = new a5[]{a5Var, a5Var2};
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) c.clone();
    }
}
