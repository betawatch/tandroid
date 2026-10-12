package ab;

import android.os.Build;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class c implements ja.d {
    public static final c a = new c();
    public static final ja.c b = ja.c.c("packageName");
    public static final ja.c c = ja.c.c("versionName");
    public static final ja.c d = ja.c.c("appBuildVersion");
    public static final ja.c e = ja.c.c("deviceManufacturer");
    public static final ja.c f = ja.c.c("currentProcessDetails");
    public static final ja.c g = ja.c.c("appProcessDetails");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, aVar.a);
        eVar.d(c, aVar.b);
        eVar.d(d, aVar.c);
        eVar.d(e, Build.MANUFACTURER);
        eVar.d(f, aVar.d);
        eVar.d(g, aVar.e);
    }
}
