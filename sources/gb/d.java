package gb;

import android.os.Build;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d implements na.d {
    public static final d a = new d();
    public static final na.c b = na.c.c("appId");
    public static final na.c c = na.c.c("deviceModel");
    public static final na.c d = na.c.c("sessionSdkVersion");
    public static final na.c e = na.c.c("osVersion");
    public static final na.c f = na.c.c("logEnvironment");
    public static final na.c g = na.c.c("androidAppInfo");

    @Override // na.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        na.e eVar = (na.e) obj2;
        eVar.a(b, bVar.a);
        eVar.a(c, Build.MODEL);
        eVar.a(d, "3.0.8");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f, y.b);
        eVar.a(g, bVar.b);
    }
}
