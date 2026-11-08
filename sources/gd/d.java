package gd;

import c8.j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ d[] a;

    static {
        d[] dVarArr = {new d("SYNCHRONIZED", 0), new d("PUBLICATION", 1), new d("NONE", 2)};
        a = dVarArr;
        j1.a(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) a.clone();
    }
}
