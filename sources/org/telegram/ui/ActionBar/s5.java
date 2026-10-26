package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class s5 {
    public static final s5 a;
    public static final s5 b;
    public static final /* synthetic */ s5[] c;

    static {
        s5 s5Var = new s5("ICON", 0);
        a = s5Var;
        s5 s5Var2 = new s5("TEXT", 1);
        b = s5Var2;
        c = new s5[]{s5Var, s5Var2};
    }

    public static s5 valueOf(String str) {
        return (s5) Enum.valueOf(s5.class, str);
    }

    public static s5[] values() {
        return (s5[]) c.clone();
    }
}
