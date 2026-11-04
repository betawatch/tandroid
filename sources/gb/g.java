package gb;

import b8.ad;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements le.e {
    public static final g a;
    private static final je.d descriptor;

    static {
        g gVar = new g();
        a = gVar;
        le.m mVar = new le.m("com.google.firebase.sessions.settings.SessionConfigs", gVar, 5);
        mVar.k("sessionsEnabled", false);
        mVar.k("sessionSamplingRate", false);
        mVar.k("sessionTimeoutSeconds", false);
        mVar.k("cacheDurationSeconds", false);
        mVar.k("cacheUpdatedTimeSeconds", false);
        descriptor = mVar;
    }

    @Override // he.a
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        int i3 = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        boolean z10 = true;
        while (z10) {
            int d10 = c2.d(dVar);
            if (d10 == -1) {
                z10 = false;
            } else if (d10 == 0) {
                bool = (Boolean) c2.j(dVar, 0, le.a.a, bool);
                i3 |= 1;
            } else if (d10 == 1) {
                d = (Double) c2.j(dVar, 1, le.c.a, d);
                i3 |= 2;
            } else if (d10 == 2) {
                num = (Integer) c2.j(dVar, 2, le.f.a, num);
                i3 |= 4;
            } else if (d10 == 3) {
                num2 = (Integer) c2.j(dVar, 3, le.f.a, num2);
                i3 |= 8;
            } else {
                if (d10 != 4) {
                    throw new he.d(d10);
                }
                l10 = (Long) c2.j(dVar, 4, le.i.a, l10);
                i3 |= 16;
            }
        }
        c2.p(dVar);
        return new i(i3, bool, d, num, num2, l10);
    }

    @Override // le.e
    public final he.a[] b() {
        he.a a10 = ad.a(le.a.a);
        he.a a11 = ad.a(le.c.a);
        le.f fVar = le.f.a;
        return new he.a[]{a10, a11, ad.a(fVar), ad.a(fVar), ad.a(le.i.a)};
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        i value = (i) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        a10.g(dVar, 0, le.a.a, value.a);
        a10.g(dVar, 1, le.c.a, value.b);
        le.f fVar = le.f.a;
        a10.g(dVar, 2, fVar, value.c);
        a10.g(dVar, 3, fVar, value.d);
        a10.g(dVar, 4, le.i.a, value.e);
        a10.l(dVar);
    }

    @Override // he.a
    public final je.d d() {
        return descriptor;
    }
}
