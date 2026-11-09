package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class oj0 {
    public static final oj0 a;
    public static final oj0 b;
    public static final /* synthetic */ oj0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    oj0 EF0;

    static {
        oj0 oj0Var = new oj0("FULL_BACKGROUND", 0);
        oj0 oj0Var2 = new oj0("SECTION_COLOR_BACKGROUND", 1);
        oj0 oj0Var3 = new oj0("OPTIMIZED_BACKGROUND", 2);
        a = oj0Var3;
        oj0 oj0Var4 = new oj0("DRAW_VERTICES", 3);
        b = oj0Var4;
        c = new oj0[]{oj0Var, oj0Var2, oj0Var3, oj0Var4};
    }

    public static oj0 valueOf(String str) {
        return (oj0) Enum.valueOf(oj0.class, str);
    }

    public static oj0[] values() {
        return (oj0[]) c.clone();
    }
}
