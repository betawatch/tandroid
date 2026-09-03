package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z3 {
    public static final z3 a;
    public static final z3 b;
    public static final z3 c;
    public static final /* synthetic */ z3[] d;

    static {
        z3 z3Var = new z3("NONE", 0);
        a = z3Var;
        z3 z3Var2 = new z3("VERTICAL", 1);
        b = z3Var2;
        z3 z3Var3 = new z3("FULL", 2);
        c = z3Var3;
        d = new z3[]{z3Var, z3Var2, z3Var3};
    }

    public static z3 valueOf(String str) {
        return (z3) Enum.valueOf(z3.class, str);
    }

    public static z3[] values() {
        return (z3[]) d.clone();
    }
}
