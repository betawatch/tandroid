package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ot0 {
    public static final ot0 a;
    public static final ot0 b;
    public static final /* synthetic */ ot0[] c;

    static {
        ot0 ot0Var = new ot0("DEFAULT", 0);
        a = ot0Var;
        ot0 ot0Var2 = new ot0("RECORDING", 1);
        b = ot0Var2;
        c = new ot0[]{ot0Var, ot0Var2};
    }

    public static ot0 valueOf(String str) {
        return (ot0) Enum.valueOf(ot0.class, str);
    }

    public static ot0[] values() {
        return (ot0[]) c.clone();
    }
}
