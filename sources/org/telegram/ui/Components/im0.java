package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class im0 {
    public static final im0 a;
    public static final im0 b;
    public static final /* synthetic */ im0[] c;

    static {
        im0 im0Var = new im0("LINE", 0);
        a = im0Var;
        im0 im0Var2 = new im0("TAB", 1);
        b = im0Var2;
        c = new im0[]{im0Var, im0Var2};
    }

    public static im0 valueOf(String str) {
        return (im0) Enum.valueOf(im0.class, str);
    }

    public static im0[] values() {
        return (im0[]) c.clone();
    }
}
