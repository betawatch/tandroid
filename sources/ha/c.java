package ha;

import android.os.Build;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c implements q9.d {
    public static final c a = new c();
    public static final q9.c b = q9.c.c("packageName");
    public static final q9.c c = q9.c.c("versionName");
    public static final q9.c d = q9.c.c("appBuildVersion");
    public static final q9.c e = q9.c.c("deviceManufacturer");
    public static final q9.c f = q9.c.c("currentProcessDetails");
    public static final q9.c g = q9.c.c("appProcessDetails");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, aVar.a);
        eVar.g(c, aVar.b);
        eVar.g(d, aVar.c);
        eVar.g(e, Build.MANUFACTURER);
        eVar.g(f, aVar.d);
        eVar.g(g, aVar.e);
    }
}
