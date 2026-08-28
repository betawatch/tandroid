package ha;

import android.os.Build;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements q9.d {
    public static final d a = new d();
    public static final q9.c b = q9.c.c("appId");
    public static final q9.c c = q9.c.c("deviceModel");
    public static final q9.c d = q9.c.c("sessionSdkVersion");
    public static final q9.c e = q9.c.c("osVersion");
    public static final q9.c f = q9.c.c("logEnvironment");
    public static final q9.c g = q9.c.c("androidAppInfo");

    @Override // q9.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        q9.e eVar = (q9.e) obj2;
        eVar.g(b, bVar.a);
        eVar.g(c, Build.MODEL);
        eVar.g(d, "1.2.0");
        eVar.g(e, Build.VERSION.RELEASE);
        eVar.g(f, p.b);
        eVar.g(g, bVar.b);
    }
}
