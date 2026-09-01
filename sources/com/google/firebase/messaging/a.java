package com.google.firebase.messaging;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a implements u9.d {
    public static final a a = new a();
    public static final u9.c b = new u9.c("projectNumber", w.c.h(w.c.g(x9.d.class, new x9.a(1))));
    public static final u9.c c = new u9.c("messageId", w.c.h(w.c.g(x9.d.class, new x9.a(2))));
    public static final u9.c d = new u9.c("instanceId", w.c.h(w.c.g(x9.d.class, new x9.a(3))));
    public static final u9.c e = new u9.c("messageType", w.c.h(w.c.g(x9.d.class, new x9.a(4))));
    public static final u9.c f = new u9.c("sdkPlatform", w.c.h(w.c.g(x9.d.class, new x9.a(5))));
    public static final u9.c g = new u9.c("packageName", w.c.h(w.c.g(x9.d.class, new x9.a(6))));
    public static final u9.c h = new u9.c("collapseKey", w.c.h(w.c.g(x9.d.class, new x9.a(7))));
    public static final u9.c i = new u9.c("priority", w.c.h(w.c.g(x9.d.class, new x9.a(8))));
    public static final u9.c j = new u9.c("ttl", w.c.h(w.c.g(x9.d.class, new x9.a(9))));
    public static final u9.c k = new u9.c("topic", w.c.h(w.c.g(x9.d.class, new x9.a(10))));
    public static final u9.c l = new u9.c("bulkId", w.c.h(w.c.g(x9.d.class, new x9.a(11))));
    public static final u9.c m = new u9.c("event", w.c.h(w.c.g(x9.d.class, new x9.a(12))));
    public static final u9.c n = new u9.c("analyticsLabel", w.c.h(w.c.g(x9.d.class, new x9.a(13))));
    public static final u9.c o = new u9.c("campaignId", w.c.h(w.c.g(x9.d.class, new x9.a(14))));
    public static final u9.c p = new u9.c("composerLabel", w.c.h(w.c.g(x9.d.class, new x9.a(15))));

    @Override // u9.a
    public final void a(Object obj, Object obj2) {
        ia.d dVar = (ia.d) obj;
        u9.e eVar = (u9.e) obj2;
        eVar.b(b, dVar.a);
        eVar.e(c, dVar.b);
        eVar.e(d, dVar.c);
        eVar.e(e, dVar.d);
        eVar.e(f, ia.c.b);
        eVar.e(g, dVar.e);
        eVar.e(h, dVar.f);
        eVar.a(i, 0);
        eVar.a(j, dVar.g);
        eVar.e(k, dVar.h);
        eVar.b(l, 0L);
        eVar.e(m, ia.a.b);
        eVar.e(n, dVar.i);
        eVar.b(o, 0L);
        eVar.e(p, dVar.j);
    }
}
