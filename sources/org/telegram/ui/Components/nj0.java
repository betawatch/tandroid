package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class nj0 {
    public static final nj0 a;
    public static final nj0 b;
    public static final /* synthetic */ nj0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    nj0 EF0;

    static {
        nj0 nj0Var = new nj0("FULL_BACKGROUND", 0);
        nj0 nj0Var2 = new nj0("SECTION_COLOR_BACKGROUND", 1);
        nj0 nj0Var3 = new nj0("OPTIMIZED_BACKGROUND", 2);
        a = nj0Var3;
        nj0 nj0Var4 = new nj0("DRAW_VERTICES", 3);
        b = nj0Var4;
        c = new nj0[]{nj0Var, nj0Var2, nj0Var3, nj0Var4};
    }

    public static nj0 valueOf(String str) {
        return (nj0) Enum.valueOf(nj0.class, str);
    }

    public static nj0[] values() {
        return (nj0[]) c.clone();
    }
}
