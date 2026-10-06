package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class wv0 {
    public static final wv0 a;
    public static final wv0 b;
    public static final /* synthetic */ wv0[] c;

    static {
        wv0 wv0Var = new wv0("DEFAULT", 0);
        a = wv0Var;
        wv0 wv0Var2 = new wv0("RECORDING", 1);
        b = wv0Var2;
        c = new wv0[]{wv0Var, wv0Var2};
    }

    public static wv0 valueOf(String str) {
        return (wv0) Enum.valueOf(wv0.class, str);
    }

    public static wv0[] values() {
        return (wv0[]) c.clone();
    }
}
