package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b4 {
    public static final b4 a;
    public static final b4 b;
    public static final b4 c;
    public static final /* synthetic */ b4[] d;

    static {
        b4 b4Var = new b4("NONE", 0);
        a = b4Var;
        b4 b4Var2 = new b4("VERTICAL", 1);
        b = b4Var2;
        b4 b4Var3 = new b4("FULL", 2);
        c = b4Var3;
        d = new b4[]{b4Var, b4Var2, b4Var3};
    }

    public static b4 valueOf(String str) {
        return (b4) Enum.valueOf(b4.class, str);
    }

    public static b4[] values() {
        return (b4[]) d.clone();
    }
}
