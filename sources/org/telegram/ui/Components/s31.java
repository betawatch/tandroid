package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class s31 {
    public static final s31 a;
    public static final s31 b;
    public static final s31 c;
    public static final /* synthetic */ s31[] d;

    static {
        s31 s31Var = new s31("TOP", 0);
        a = s31Var;
        s31 s31Var2 = new s31("LEFT", 1);
        b = s31Var2;
        s31 s31Var3 = new s31("BOTTOM", 2);
        c = s31Var3;
        d = new s31[]{s31Var, s31Var2, s31Var3};
    }

    public static s31 valueOf(String str) {
        return (s31) Enum.valueOf(s31.class, str);
    }

    public static s31[] values() {
        return (s31[]) d.clone();
    }
}
