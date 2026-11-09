package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class j11 {
    public static final j11 a;
    public static final j11 b;
    public static final j11 c;
    public static final /* synthetic */ j11[] d;

    static {
        j11 j11Var = new j11("TOP", 0);
        a = j11Var;
        j11 j11Var2 = new j11("LEFT", 1);
        b = j11Var2;
        j11 j11Var3 = new j11("BOTTOM", 2);
        c = j11Var3;
        d = new j11[]{j11Var, j11Var2, j11Var3};
    }

    public static j11 valueOf(String str) {
        return (j11) Enum.valueOf(j11.class, str);
    }

    public static j11[] values() {
        return (j11[]) d.clone();
    }
}
