package jd;

import w7.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class a {
    public static final a a;
    public static final /* synthetic */ a[] b;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        a = aVar;
        a[] aVarArr = {aVar, new a("UNDECIDED", 1), new a("RESUMED", 2)};
        b = aVarArr;
        n.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) b.clone();
    }
}
