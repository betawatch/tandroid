package gb;

import android.os.Build;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class c implements na.d {
    public static final c a = new c();
    public static final na.c b = na.c.c("packageName");
    public static final na.c c = na.c.c("versionName");
    public static final na.c d = na.c.c("appBuildVersion");
    public static final na.c e = na.c.c("deviceManufacturer");
    public static final na.c f = na.c.c("currentProcessDetails");
    public static final na.c g = na.c.c("appProcessDetails");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, aVar.a);
        eVar.a(c, aVar.b);
        eVar.a(d, aVar.c);
        eVar.a(e, Build.MANUFACTURER);
        eVar.a(f, aVar.d);
        eVar.a(g, aVar.e);
    }
}
