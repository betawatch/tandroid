package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class b5 {
    public static final b5 a;
    public static final b5 b;
    public static final /* synthetic */ b5[] c;

    static {
        b5 b5Var = new b5("BACK", 0);
        a = b5Var;
        b5 b5Var2 = new b5("MENU", 1);
        b = b5Var2;
        c = new b5[]{b5Var, b5Var2};
    }

    public static b5 valueOf(String str) {
        return (b5) Enum.valueOf(b5.class, str);
    }

    public static b5[] values() {
        return (b5[]) c.clone();
    }
}
