package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u21 {
    public static final u21 a;
    public static final u21 b;
    public static final u21 c;
    public static final /* synthetic */ u21[] d;

    static {
        u21 u21Var = new u21("TOP", 0);
        a = u21Var;
        u21 u21Var2 = new u21("LEFT", 1);
        b = u21Var2;
        u21 u21Var3 = new u21("BOTTOM", 2);
        c = u21Var3;
        d = new u21[]{u21Var, u21Var2, u21Var3};
    }

    public static u21 valueOf(String str) {
        return (u21) Enum.valueOf(u21.class, str);
    }

    public static u21[] values() {
        return (u21[]) d.clone();
    }
}
