package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e5 {
    public static final e5 a;
    public static final e5 b;
    public static final /* synthetic */ e5[] c;

    static {
        e5 e5Var = new e5("BACK", 0);
        a = e5Var;
        e5 e5Var2 = new e5("MENU", 1);
        b = e5Var2;
        c = new e5[]{e5Var, e5Var2};
    }

    public static e5 valueOf(String str) {
        return (e5) Enum.valueOf(e5.class, str);
    }

    public static e5[] values() {
        return (e5[]) c.clone();
    }
}
