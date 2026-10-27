package ee;

import a8.we;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ a[] a;

    static {
        a[] aVarArr = {new a("SUSPEND", 0), new a("DROP_OLDEST", 1), new a("DROP_LATEST", 2)};
        a = aVarArr;
        we.a(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) a.clone();
    }
}
