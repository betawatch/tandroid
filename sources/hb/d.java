package hb;

import c8.n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class d {
    public static final d a;
    public static final d b;
    public static final /* synthetic */ d[] c;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        a = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        b = dVar2;
        d[] dVarArr = {dVar, dVar2, new d("MATT_SAYS_HI", 2)};
        c = dVarArr;
        n1.a(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) c.clone();
    }
}
