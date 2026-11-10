package gd;

import c8.j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
