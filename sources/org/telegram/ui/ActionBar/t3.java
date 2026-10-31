package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t3 {
    public static final t3 a;
    public static final t3 b;
    public static final t3 c;
    public static final /* synthetic */ t3[] d;

    static {
        t3 t3Var = new t3("NONE", 0);
        a = t3Var;
        t3 t3Var2 = new t3("VERTICAL", 1);
        b = t3Var2;
        t3 t3Var3 = new t3("FULL", 2);
        c = t3Var3;
        d = new t3[]{t3Var, t3Var2, t3Var3};
    }

    public static t3 valueOf(String str) {
        return (t3) Enum.valueOf(t3.class, str);
    }

    public static t3[] values() {
        return (t3[]) d.clone();
    }
}
