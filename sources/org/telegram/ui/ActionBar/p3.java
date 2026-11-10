package org.telegram.ui.ActionBar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p3 {
    public static final p3 a;
    public static final p3 b;
    public static final p3 c;
    public static final /* synthetic */ p3[] d;

    static {
        p3 p3Var = new p3("NONE", 0);
        a = p3Var;
        p3 p3Var2 = new p3("VERTICAL", 1);
        b = p3Var2;
        p3 p3Var3 = new p3("FULL", 2);
        c = p3Var3;
        d = new p3[]{p3Var, p3Var2, p3Var3};
    }

    public static p3 valueOf(String str) {
        return (p3) Enum.valueOf(p3.class, str);
    }

    public static p3[] values() {
        return (p3[]) d.clone();
    }
}
