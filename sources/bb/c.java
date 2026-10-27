package bb;

import android.os.Build;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class c implements ka.d {
    public static final c a = new c();
    public static final ka.c b = ka.c.c("packageName");
    public static final ka.c c = ka.c.c("versionName");
    public static final ka.c d = ka.c.c("appBuildVersion");
    public static final ka.c e = ka.c.c("deviceManufacturer");
    public static final ka.c f = ka.c.c("currentProcessDetails");
    public static final ka.c g = ka.c.c("appProcessDetails");

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.a(b, aVar.a);
        eVar.a(c, aVar.b);
        eVar.a(d, aVar.c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f, aVar.d);
        eVar.a(g, aVar.e);
    }
}
