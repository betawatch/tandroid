package com.google.firebase.messaging;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a implements s9.d {
    public static final a a = new a();
    public static final s9.c b = new s9.c("projectNumber", u3.c.h(u3.c.g(v9.d.class, new v9.a(1))));
    public static final s9.c c = new s9.c("messageId", u3.c.h(u3.c.g(v9.d.class, new v9.a(2))));
    public static final s9.c d = new s9.c("instanceId", u3.c.h(u3.c.g(v9.d.class, new v9.a(3))));
    public static final s9.c e = new s9.c("messageType", u3.c.h(u3.c.g(v9.d.class, new v9.a(4))));
    public static final s9.c f = new s9.c("sdkPlatform", u3.c.h(u3.c.g(v9.d.class, new v9.a(5))));
    public static final s9.c g = new s9.c("packageName", u3.c.h(u3.c.g(v9.d.class, new v9.a(6))));
    public static final s9.c h = new s9.c("collapseKey", u3.c.h(u3.c.g(v9.d.class, new v9.a(7))));
    public static final s9.c i = new s9.c("priority", u3.c.h(u3.c.g(v9.d.class, new v9.a(8))));
    public static final s9.c j = new s9.c("ttl", u3.c.h(u3.c.g(v9.d.class, new v9.a(9))));
    public static final s9.c k = new s9.c("topic", u3.c.h(u3.c.g(v9.d.class, new v9.a(10))));
    public static final s9.c l = new s9.c("bulkId", u3.c.h(u3.c.g(v9.d.class, new v9.a(11))));
    public static final s9.c m = new s9.c("event", u3.c.h(u3.c.g(v9.d.class, new v9.a(12))));
    public static final s9.c n = new s9.c("analyticsLabel", u3.c.h(u3.c.g(v9.d.class, new v9.a(13))));
    public static final s9.c o = new s9.c("campaignId", u3.c.h(u3.c.g(v9.d.class, new v9.a(14))));
    public static final s9.c p = new s9.c("composerLabel", u3.c.h(u3.c.g(v9.d.class, new v9.a(15))));

    @Override // s9.a
    public final void a(Object obj, Object obj2) {
        ga.d dVar = (ga.d) obj;
        s9.e eVar = (s9.e) obj2;
        eVar.c(b, dVar.a);
        eVar.e(c, dVar.b);
        eVar.e(d, dVar.c);
        eVar.e(e, dVar.d);
        eVar.e(f, ga.c.b);
        eVar.e(g, dVar.e);
        eVar.e(h, dVar.f);
        eVar.b(i, 0);
        eVar.b(j, dVar.g);
        eVar.e(k, dVar.h);
        eVar.c(l, 0L);
        eVar.e(m, ga.a.b);
        eVar.e(n, dVar.i);
        eVar.c(o, 0L);
        eVar.e(p, dVar.j);
    }
}
