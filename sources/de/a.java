package de;

import w7.d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a[] a;

    static {
        a[] aVarArr = {new a("SUSPEND", 0), new a("DROP_OLDEST", 1), new a("DROP_LATEST", 2)};
        a = aVarArr;
        d0.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) a.clone();
    }
}
