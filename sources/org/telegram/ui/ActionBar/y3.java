package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class y3 {
    public static final y3 a;
    public static final y3 b;
    public static final y3 c;
    public static final /* synthetic */ y3[] d;

    static {
        y3 y3Var = new y3("NONE", 0);
        a = y3Var;
        y3 y3Var2 = new y3("VERTICAL", 1);
        b = y3Var2;
        y3 y3Var3 = new y3("FULL", 2);
        c = y3Var3;
        d = new y3[]{y3Var, y3Var2, y3Var3};
    }

    public static y3 valueOf(String str) {
        return (y3) Enum.valueOf(y3.class, str);
    }

    public static y3[] values() {
        return (y3[]) d.clone();
    }
}
