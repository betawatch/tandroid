package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class gu0 {
    public static final gu0 a;
    public static final gu0 b;
    public static final /* synthetic */ gu0[] c;

    static {
        gu0 gu0Var = new gu0("DEFAULT", 0);
        a = gu0Var;
        gu0 gu0Var2 = new gu0("RECORDING", 1);
        b = gu0Var2;
        c = new gu0[]{gu0Var, gu0Var2};
    }

    public static gu0 valueOf(String str) {
        return (gu0) Enum.valueOf(gu0.class, str);
    }

    public static gu0[] values() {
        return (gu0[]) c.clone();
    }
}
