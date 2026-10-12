package org.telegram.ui.Components;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jn0 {
    public static final jn0 a;
    public static final jn0 b;
    public static final /* synthetic */ jn0[] c;

    static {
        jn0 jn0Var = new jn0("LINE", 0);
        a = jn0Var;
        jn0 jn0Var2 = new jn0("TAB", 1);
        b = jn0Var2;
        c = new jn0[]{jn0Var, jn0Var2};
    }

    public static jn0 valueOf(String str) {
        return (jn0) Enum.valueOf(jn0.class, str);
    }

    public static jn0[] values() {
        return (jn0[]) c.clone();
    }
}
