package ia;

import android.os.Build;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements r9.d {
    public static final c a = new c();
    public static final r9.c b = r9.c.c("packageName");
    public static final r9.c c = r9.c.c("versionName");
    public static final r9.c d = r9.c.c("appBuildVersion");
    public static final r9.c e = r9.c.c("deviceManufacturer");
    public static final r9.c f = r9.c.c("currentProcessDetails");
    public static final r9.c g = r9.c.c("appProcessDetails");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, aVar.a);
        eVar.a(c, aVar.b);
        eVar.a(d, aVar.c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f, aVar.d);
        eVar.a(g, aVar.e);
    }
}
