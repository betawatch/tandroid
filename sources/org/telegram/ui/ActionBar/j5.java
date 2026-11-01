package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j5 {
    public static final j5 a;
    public static final j5 b;
    public static final /* synthetic */ j5[] c;

    static {
        j5 j5Var = new j5("ICON", 0);
        a = j5Var;
        j5 j5Var2 = new j5("TEXT", 1);
        b = j5Var2;
        c = new j5[]{j5Var, j5Var2};
    }

    public static j5 valueOf(String str) {
        return (j5) Enum.valueOf(j5.class, str);
    }

    public static j5[] values() {
        return (j5[]) c.clone();
    }
}
