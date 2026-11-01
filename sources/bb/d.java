package bb;

import android.os.Build;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class d implements ja.d {
    public static final d a = new d();
    public static final ja.c b = ja.c.c("appId");
    public static final ja.c c = ja.c.c("deviceModel");
    public static final ja.c d = ja.c.c("sessionSdkVersion");
    public static final ja.c e = ja.c.c("osVersion");
    public static final ja.c f = ja.c.c("logEnvironment");
    public static final ja.c g = ja.c.c("androidAppInfo");

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(b, bVar.a);
        eVar.d(c, Build.MODEL);
        eVar.d(d, "1.2.0");
        eVar.d(e, Build.VERSION.RELEASE);
        eVar.d(f, p.b);
        eVar.d(g, bVar.b);
    }
}
