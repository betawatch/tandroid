package com.google.firebase.messaging;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a implements ka.d {
    public static final a a = new a();
    public static final ka.c b = new ka.c("projectNumber", ic.a.m(ic.a.l(na.d.class, new na.a(1))));
    public static final ka.c c = new ka.c("messageId", ic.a.m(ic.a.l(na.d.class, new na.a(2))));
    public static final ka.c d = new ka.c("instanceId", ic.a.m(ic.a.l(na.d.class, new na.a(3))));
    public static final ka.c e = new ka.c("messageType", ic.a.m(ic.a.l(na.d.class, new na.a(4))));
    public static final ka.c f = new ka.c("sdkPlatform", ic.a.m(ic.a.l(na.d.class, new na.a(5))));
    public static final ka.c g = new ka.c("packageName", ic.a.m(ic.a.l(na.d.class, new na.a(6))));
    public static final ka.c h = new ka.c("collapseKey", ic.a.m(ic.a.l(na.d.class, new na.a(7))));
    public static final ka.c i = new ka.c("priority", ic.a.m(ic.a.l(na.d.class, new na.a(8))));
    public static final ka.c j = new ka.c("ttl", ic.a.m(ic.a.l(na.d.class, new na.a(9))));
    public static final ka.c k = new ka.c("topic", ic.a.m(ic.a.l(na.d.class, new na.a(10))));
    public static final ka.c l = new ka.c("bulkId", ic.a.m(ic.a.l(na.d.class, new na.a(11))));
    public static final ka.c m = new ka.c("event", ic.a.m(ic.a.l(na.d.class, new na.a(12))));
    public static final ka.c n = new ka.c("analyticsLabel", ic.a.m(ic.a.l(na.d.class, new na.a(13))));
    public static final ka.c o = new ka.c("campaignId", ic.a.m(ic.a.l(na.d.class, new na.a(14))));
    public static final ka.c p = new ka.c("composerLabel", ic.a.m(ic.a.l(na.d.class, new na.a(15))));

    @Override // ka.a
    public final void a(Object obj, Object obj2) {
        ya.d dVar = (ya.d) obj;
        ka.e eVar = (ka.e) obj2;
        eVar.f(b, dVar.a);
        eVar.a(c, dVar.b);
        eVar.a(d, dVar.c);
        eVar.a(e, dVar.d);
        eVar.a(f, ya.c.b);
        eVar.a(g, dVar.e);
        eVar.a(h, dVar.f);
        eVar.e(i, 0);
        eVar.e(j, dVar.g);
        eVar.a(k, dVar.h);
        eVar.f(l, 0L);
        eVar.a(m, ya.a.b);
        eVar.a(n, dVar.i);
        eVar.f(o, 0L);
        eVar.a(p, dVar.j);
    }
}
