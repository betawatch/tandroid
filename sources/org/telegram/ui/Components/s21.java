package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s21 {
    public static final s21 a;
    public static final s21 b;
    public static final s21 c;
    public static final /* synthetic */ s21[] d;

    static {
        s21 s21Var = new s21("TOP", 0);
        a = s21Var;
        s21 s21Var2 = new s21("LEFT", 1);
        b = s21Var2;
        s21 s21Var3 = new s21("BOTTOM", 2);
        c = s21Var3;
        d = new s21[]{s21Var, s21Var2, s21Var3};
    }

    public static s21 valueOf(String str) {
        return (s21) Enum.valueOf(s21.class, str);
    }

    public static s21[] values() {
        return (s21[]) d.clone();
    }
}
