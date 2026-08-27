package ia;

import android.os.Build;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d implements r9.d {
    public static final d a = new d();
    public static final r9.c b = r9.c.c("appId");
    public static final r9.c c = r9.c.c("deviceModel");
    public static final r9.c d = r9.c.c("sessionSdkVersion");
    public static final r9.c e = r9.c.c("osVersion");
    public static final r9.c f = r9.c.c("logEnvironment");
    public static final r9.c g = r9.c.c("androidAppInfo");

    @Override // r9.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        r9.e eVar = (r9.e) obj2;
        eVar.a(b, bVar.a);
        eVar.a(c, Build.MODEL);
        eVar.a(d, "1.2.0");
        eVar.a(e, Build.VERSION.RELEASE);
        eVar.a(f, q.b);
        eVar.a(g, bVar.b);
    }
}
