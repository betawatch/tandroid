package ja;

import android.os.Build;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements s9.d {
    public static final c a = new c();
    public static final s9.c b = s9.c.c("packageName");
    public static final s9.c c = s9.c.c("versionName");
    public static final s9.c d = s9.c.c("appBuildVersion");
    public static final s9.c e = s9.c.c("deviceManufacturer");
    public static final s9.c f = s9.c.c("currentProcessDetails");
    public static final s9.c g = s9.c.c("appProcessDetails");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, aVar.a);
        eVar.e(c, aVar.b);
        eVar.e(d, aVar.c);
        eVar.e(e, Build.MANUFACTURER);
        eVar.e(f, aVar.d);
        eVar.e(g, aVar.e);
    }
}
