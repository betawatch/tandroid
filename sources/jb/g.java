package jb;

import c8.k1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements oe.e {
    public static final g a;
    private static final me.d descriptor;

    static {
        g gVar = new g();
        a = gVar;
        oe.m mVar = new oe.m("com.google.firebase.sessions.settings.SessionConfigs", gVar, 5);
        mVar.k("sessionsEnabled", false);
        mVar.k("sessionSamplingRate", false);
        mVar.k("sessionTimeoutSeconds", false);
        mVar.k("cacheDurationSeconds", false);
        mVar.k("cacheUpdatedTimeSeconds", false);
        descriptor = mVar;
    }

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        i value = (i) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        a10.g(dVar, 0, oe.a.a, value.a);
        a10.g(dVar, 1, oe.c.a, value.b);
        oe.f fVar = oe.f.a;
        a10.g(dVar, 2, fVar, value.c);
        a10.g(dVar, 3, fVar, value.d);
        a10.g(dVar, 4, oe.i.a, value.e);
        a10.l(dVar);
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        int i7 = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l10 = null;
        boolean z9 = true;
        while (z9) {
            int d2 = c10.d(dVar);
            if (d2 == -1) {
                z9 = false;
            } else if (d2 == 0) {
                bool = (Boolean) c10.j(dVar, 0, oe.a.a, bool);
                i7 |= 1;
            } else if (d2 == 1) {
                d = (Double) c10.j(dVar, 1, oe.c.a, d);
                i7 |= 2;
            } else if (d2 == 2) {
                num = (Integer) c10.j(dVar, 2, oe.f.a, num);
                i7 |= 4;
            } else if (d2 == 3) {
                num2 = (Integer) c10.j(dVar, 3, oe.f.a, num2);
                i7 |= 8;
            } else {
                if (d2 != 4) {
                    throw new ke.d(d2);
                }
                l10 = (Long) c10.j(dVar, 4, oe.i.a, l10);
                i7 |= 16;
            }
        }
        c10.p(dVar);
        return new i(i7, bool, d, num, num2, l10);
    }

    @Override // oe.e
    public final ke.a[] c() {
        ke.a a10 = k1.a(oe.a.a);
        ke.a a11 = k1.a(oe.c.a);
        oe.f fVar = oe.f.a;
        return new ke.a[]{a10, a11, k1.a(fVar), k1.a(fVar), k1.a(oe.i.a)};
    }

    @Override // ke.a
    public final me.d d() {
        return descriptor;
    }
}
