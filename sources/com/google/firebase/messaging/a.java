package com.google.firebase.messaging;

import i2.o1;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class a implements ja.d {
    public static final a a = new a();
    public static final ja.c b = new ja.c("projectNumber", o1.p(o1.o(ma.e.class, new ma.a(1))));
    public static final ja.c c = new ja.c("messageId", o1.p(o1.o(ma.e.class, new ma.a(2))));
    public static final ja.c d = new ja.c("instanceId", o1.p(o1.o(ma.e.class, new ma.a(3))));
    public static final ja.c e = new ja.c("messageType", o1.p(o1.o(ma.e.class, new ma.a(4))));
    public static final ja.c f = new ja.c("sdkPlatform", o1.p(o1.o(ma.e.class, new ma.a(5))));
    public static final ja.c g = new ja.c("packageName", o1.p(o1.o(ma.e.class, new ma.a(6))));
    public static final ja.c h = new ja.c("collapseKey", o1.p(o1.o(ma.e.class, new ma.a(7))));
    public static final ja.c i = new ja.c("priority", o1.p(o1.o(ma.e.class, new ma.a(8))));
    public static final ja.c j = new ja.c("ttl", o1.p(o1.o(ma.e.class, new ma.a(9))));
    public static final ja.c k = new ja.c("topic", o1.p(o1.o(ma.e.class, new ma.a(10))));
    public static final ja.c l = new ja.c("bulkId", o1.p(o1.o(ma.e.class, new ma.a(11))));
    public static final ja.c m = new ja.c("event", o1.p(o1.o(ma.e.class, new ma.a(12))));
    public static final ja.c n = new ja.c("analyticsLabel", o1.p(o1.o(ma.e.class, new ma.a(13))));
    public static final ja.c o = new ja.c("campaignId", o1.p(o1.o(ma.e.class, new ma.a(14))));
    public static final ja.c p = new ja.c("composerLabel", o1.p(o1.o(ma.e.class, new ma.a(15))));

    @Override // ja.a
    public final void a(Object obj, Object obj2) {
        xa.d dVar = (xa.d) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.f(b, dVar.a);
        eVar.d(c, dVar.b);
        eVar.d(d, dVar.c);
        eVar.d(e, dVar.d);
        eVar.d(f, xa.c.b);
        eVar.d(g, dVar.e);
        eVar.d(h, dVar.f);
        eVar.g(i, 0);
        eVar.g(j, dVar.g);
        eVar.d(k, dVar.h);
        eVar.f(l, 0L);
        eVar.d(m, xa.a.b);
        eVar.d(n, dVar.i);
        eVar.f(o, 0L);
        eVar.d(p, dVar.j);
    }
}
