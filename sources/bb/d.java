package bb;

import android.os.Build;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d implements ka.d {
    public static final d a = new d();
    public static final ka.c b = ka.c.c("appId");
    public static final ka.c c = ka.c.c("deviceModel");
    public static final ka.c d = ka.c.c("sessionSdkVersion");
    public static final ka.c e = ka.c.c("osVersion");
    public static final ka.c f = ka.c.c("logEnvironment");
    public static final ka.c g = ka.c.c("androidAppInfo");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, bVar.a);
        eVar.a(c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f, p.b);
        eVar.a(g, bVar.b);
    }
}
