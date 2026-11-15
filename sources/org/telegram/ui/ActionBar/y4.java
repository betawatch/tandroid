package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class y4 {
    public static final y4 a;
    public static final y4 b;
    public static final /* synthetic */ y4[] c;

    static {
        y4 y4Var = new y4("GLASS", 0);
        a = y4Var;
        y4 y4Var2 = new y4("ACCENT", 1);
        b = y4Var2;
        c = new y4[]{y4Var, y4Var2};
    }

    public static y4 valueOf(String str) {
        return (y4) Enum.valueOf(y4.class, str);
    }

    public static y4[] values() {
        return (y4[]) c.clone();
    }
}
