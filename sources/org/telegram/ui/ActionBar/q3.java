package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q3 {
    public static final q3 a;
    public static final q3 b;
    public static final q3 c;
    public static final /* synthetic */ q3[] d;

    static {
        q3 q3Var = new q3("NONE", 0);
        a = q3Var;
        q3 q3Var2 = new q3("VERTICAL", 1);
        b = q3Var2;
        q3 q3Var3 = new q3("FULL", 2);
        c = q3Var3;
        d = new q3[]{q3Var, q3Var2, q3Var3};
    }

    public static q3 valueOf(String str) {
        return (q3) Enum.valueOf(q3.class, str);
    }

    public static q3[] values() {
        return (q3[]) d.clone();
    }
}
