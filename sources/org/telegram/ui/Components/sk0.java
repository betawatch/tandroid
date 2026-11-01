package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class sk0 {
    public static final sk0 a;
    public static final sk0 b;
    public static final /* synthetic */ sk0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    sk0 EF0;

    static {
        sk0 sk0Var = new sk0("FULL_BACKGROUND", 0);
        sk0 sk0Var2 = new sk0("SECTION_COLOR_BACKGROUND", 1);
        sk0 sk0Var3 = new sk0("OPTIMIZED_BACKGROUND", 2);
        a = sk0Var3;
        sk0 sk0Var4 = new sk0("DRAW_VERTICES", 3);
        b = sk0Var4;
        c = new sk0[]{sk0Var, sk0Var2, sk0Var3, sk0Var4};
    }

    public static sk0 valueOf(String str) {
        return (sk0) Enum.valueOf(sk0.class, str);
    }

    public static sk0[] values() {
        return (sk0[]) c.clone();
    }
}
