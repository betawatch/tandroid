package gd;

import c8.l1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ d[] a;

    static {
        d[] dVarArr = {new d("SYNCHRONIZED", 0), new d("PUBLICATION", 1), new d("NONE", 2)};
        a = dVarArr;
        l1.a(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }
}
