package la;

import android.os.Build;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
