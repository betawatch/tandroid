package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
