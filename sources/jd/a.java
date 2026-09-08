package jd;

import w7.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public static final a a;
    public static final /* synthetic */ a[] b;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        a = aVar;
        a[] aVarArr = {aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
        b = aVarArr;
        m.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) b.clone();
    }
}
