package ja;

import android.os.Build;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d implements s9.d {
    public static final d a = new d();
    public static final s9.c b = s9.c.c("appId");
    public static final s9.c c = s9.c.c("deviceModel");
    public static final s9.c d = s9.c.c("sessionSdkVersion");
    public static final s9.c e = s9.c.c("osVersion");
    public static final s9.c f = s9.c.c("logEnvironment");
    public static final s9.c g = s9.c.c("androidAppInfo");

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.e(b, bVar.a);
        eVar.e(c, Build.MODEL);
        eVar.e(d, "1.2.0");
        eVar.e(e, Build.VERSION.RELEASE);
        eVar.e(f, p.b);
        eVar.e(g, bVar.b);
    }
}
