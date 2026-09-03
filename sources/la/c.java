package la;

import android.os.Build;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c implements u9.d {
    public static final c a = new c();
    public static final u9.c b = u9.c.c("packageName");
    public static final u9.c c = u9.c.c("versionName");
    public static final u9.c d = u9.c.c("appBuildVersion");
    public static final u9.c e = u9.c.c("deviceManufacturer");
    public static final u9.c f = u9.c.c("currentProcessDetails");
    public static final u9.c g = u9.c.c("appProcessDetails");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, aVar.a);
        eVar.e(c, aVar.b);
        eVar.e(d, aVar.c);
        eVar.e(e, Build.MANUFACTURER);
        eVar.e(f, aVar.d);
        eVar.e(g, aVar.e);
    }
}
