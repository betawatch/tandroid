package la;

import android.os.Build;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d implements u9.d {
    public static final d a = new d();
    public static final u9.c b = u9.c.c("appId");
    public static final u9.c c = u9.c.c("deviceModel");
    public static final u9.c d = u9.c.c("sessionSdkVersion");
    public static final u9.c e = u9.c.c("osVersion");
    public static final u9.c f = u9.c.c("logEnvironment");
    public static final u9.c g = u9.c.c("androidAppInfo");

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.e(b, bVar.a);
        eVar.e(c, Build.MODEL);
        eVar.e(d, "1.2.0");
        eVar.e(e, Build.VERSION.RELEASE);
        eVar.e(f, o.b);
        eVar.e(g, bVar.b);
    }
}
