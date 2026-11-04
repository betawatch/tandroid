package db;

import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements ma.d {
    public static final c a = new c();
    public static final ma.c b = ma.c.c("packageName");
    public static final ma.c c = ma.c.c("versionName");
    public static final ma.c d = ma.c.c("appBuildVersion");
    public static final ma.c e = ma.c.c("deviceManufacturer");
    public static final ma.c f = ma.c.c("currentProcessDetails");
    public static final ma.c g = ma.c.c("appProcessDetails");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, aVar.a);
        eVar.a(c, aVar.b);
        eVar.a(d, aVar.c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f, aVar.d);
        eVar.a(g, aVar.e);
    }
}
