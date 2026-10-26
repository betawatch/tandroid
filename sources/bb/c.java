package bb;

import android.os.Build;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
