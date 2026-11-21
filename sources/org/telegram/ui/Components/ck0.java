package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ck0 {
    public static final ck0 a;
    public static final ck0 b;
    public static final /* synthetic */ ck0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ck0 EF0;

    static {
        ck0 ck0Var = new ck0("FULL_BACKGROUND", 0);
        ck0 ck0Var2 = new ck0("SECTION_COLOR_BACKGROUND", 1);
        ck0 ck0Var3 = new ck0("OPTIMIZED_BACKGROUND", 2);
        a = ck0Var3;
        ck0 ck0Var4 = new ck0("DRAW_VERTICES", 3);
        b = ck0Var4;
        c = new ck0[]{ck0Var, ck0Var2, ck0Var3, ck0Var4};
    }

    public static ck0 valueOf(String str) {
        return (ck0) Enum.valueOf(ck0.class, str);
    }

    public static ck0[] values() {
        return (ck0[]) c.clone();
    }
}
