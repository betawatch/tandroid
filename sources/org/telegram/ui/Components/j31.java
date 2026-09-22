package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class j31 {
    public static final j31 a;
    public static final j31 b;
    public static final j31 c;
    public static final /* synthetic */ j31[] d;

    static {
        j31 j31Var = new j31("TOP", 0);
        a = j31Var;
        j31 j31Var2 = new j31("LEFT", 1);
        b = j31Var2;
        j31 j31Var3 = new j31("BOTTOM", 2);
        c = j31Var3;
        d = new j31[]{j31Var, j31Var2, j31Var3};
    }

    public static j31 valueOf(String str) {
        return (j31) Enum.valueOf(j31.class, str);
    }

    public static j31[] values() {
        return (j31[]) d.clone();
    }
}
