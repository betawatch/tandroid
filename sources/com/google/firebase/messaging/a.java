package com.google.firebase.messaging;

import hg.k0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class a implements ia.d {
    public static final a a = new a();
    public static final ia.c b = new ia.c("projectNumber", k0.n(k0.m(la.e.class, new la.a(1))));
    public static final ia.c c = new ia.c("messageId", k0.n(k0.m(la.e.class, new la.a(2))));
    public static final ia.c d = new ia.c("instanceId", k0.n(k0.m(la.e.class, new la.a(3))));
    public static final ia.c e = new ia.c("messageType", k0.n(k0.m(la.e.class, new la.a(4))));
    public static final ia.c f = new ia.c("sdkPlatform", k0.n(k0.m(la.e.class, new la.a(5))));
    public static final ia.c g = new ia.c("packageName", k0.n(k0.m(la.e.class, new la.a(6))));
    public static final ia.c h = new ia.c("collapseKey", k0.n(k0.m(la.e.class, new la.a(7))));
    public static final ia.c i = new ia.c("priority", k0.n(k0.m(la.e.class, new la.a(8))));
    public static final ia.c j = new ia.c("ttl", k0.n(k0.m(la.e.class, new la.a(9))));
    public static final ia.c k = new ia.c("topic", k0.n(k0.m(la.e.class, new la.a(10))));
    public static final ia.c l = new ia.c("bulkId", k0.n(k0.m(la.e.class, new la.a(11))));
    public static final ia.c m = new ia.c("event", k0.n(k0.m(la.e.class, new la.a(12))));
    public static final ia.c n = new ia.c("analyticsLabel", k0.n(k0.m(la.e.class, new la.a(13))));
    public static final ia.c o = new ia.c("campaignId", k0.n(k0.m(la.e.class, new la.a(14))));
    public static final ia.c p = new ia.c("composerLabel", k0.n(k0.m(la.e.class, new la.a(15))));

    @Override // ia.a
    public final void a(Object obj, Object obj2) {
        wa.d dVar = (wa.d) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.f(b, dVar.a);
        eVar.a(c, dVar.b);
        eVar.a(d, dVar.c);
        eVar.a(e, dVar.d);
        eVar.a(f, wa.c.b);
        eVar.a(g, dVar.e);
        eVar.a(h, dVar.f);
        eVar.e(i, 0);
        eVar.e(j, dVar.g);
        eVar.a(k, dVar.h);
        eVar.f(l, 0L);
        eVar.a(m, wa.a.b);
        eVar.a(n, dVar.i);
        eVar.f(o, 0L);
        eVar.a(p, dVar.j);
    }
}
