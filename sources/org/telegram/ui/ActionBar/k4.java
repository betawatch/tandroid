package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k4 {
    public static final k4 a;
    public static final k4 b;
    public static final /* synthetic */ k4[] c;

    static {
        k4 k4Var = new k4("BACK", 0);
        a = k4Var;
        k4 k4Var2 = new k4("MENU", 1);
        b = k4Var2;
        c = new k4[]{k4Var, k4Var2};
    }

    public static k4 valueOf(String str) {
        return (k4) Enum.valueOf(k4.class, str);
    }

    public static k4[] values() {
        return (k4[]) c.clone();
    }
}
