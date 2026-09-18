package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a5 {
    public static final a5 a;
    public static final a5 b;
    public static final /* synthetic */ a5[] c;

    static {
        a5 a5Var = new a5("BACK", 0);
        a = a5Var;
        a5 a5Var2 = new a5("MENU", 1);
        b = a5Var2;
        c = new a5[]{a5Var, a5Var2};
    }

    public static a5 valueOf(String str) {
        return (a5) Enum.valueOf(a5.class, str);
    }

    public static a5[] values() {
        return (a5[]) c.clone();
    }
}
