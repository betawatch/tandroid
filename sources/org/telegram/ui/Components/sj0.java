package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sj0 {
    public static final sj0 a;
    public static final sj0 b;
    public static final /* synthetic */ sj0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    sj0 EF0;

    static {
        sj0 sj0Var = new sj0("FULL_BACKGROUND", 0);
        sj0 sj0Var2 = new sj0("SECTION_COLOR_BACKGROUND", 1);
        sj0 sj0Var3 = new sj0("OPTIMIZED_BACKGROUND", 2);
        a = sj0Var3;
        sj0 sj0Var4 = new sj0("DRAW_VERTICES", 3);
        b = sj0Var4;
        c = new sj0[]{sj0Var, sj0Var2, sj0Var3, sj0Var4};
    }

    public static sj0 valueOf(String str) {
        return (sj0) Enum.valueOf(sj0.class, str);
    }

    public static sj0[] values() {
        return (sj0[]) c.clone();
    }
}
