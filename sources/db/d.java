package db;

import android.os.Build;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d implements ma.d {
    public static final d a = new d();
    public static final ma.c b = ma.c.c("appId");
    public static final ma.c c = ma.c.c("deviceModel");
    public static final ma.c d = ma.c.c("sessionSdkVersion");
    public static final ma.c e = ma.c.c("osVersion");
    public static final ma.c f = ma.c.c("logEnvironment");
    public static final ma.c g = ma.c.c("androidAppInfo");

    @Override // ma.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ma.e eVar = (ma.e) obj2;
        eVar.a(b, bVar.a);
        eVar.a(c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f, x.b);
        eVar.a(g, bVar.b);
    }
}
