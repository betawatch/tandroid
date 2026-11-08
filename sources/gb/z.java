package gb;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements oe.e {
    public static final z a;
    private static final me.d descriptor;

    static {
        z zVar = new z();
        a = zVar;
        oe.m mVar = new oe.m("com.google.firebase.sessions.ProcessData", zVar, 2);
        mVar.k("pid", false);
        mVar.k("uuid", false);
        descriptor = mVar;
    }

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        b0 value = (b0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        int i7 = value.a;
        a10.b(dVar, 0);
        a10.c(i7);
        a10.k(dVar, 1, value.b);
        a10.l(dVar);
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        String str = null;
        boolean z9 = true;
        int i7 = 0;
        int i10 = 0;
        while (z9) {
            int d = c10.d(dVar);
            if (d == -1) {
                z9 = false;
            } else if (d == 0) {
                i10 = c10.f(dVar, 0);
                i7 |= 1;
            } else {
                if (d != 1) {
                    throw new ke.d(d);
                }
                str = c10.n(dVar, 1);
                i7 |= 2;
            }
        }
        c10.p(dVar);
        return new b0(i7, i10, str);
    }

    @Override // oe.e
    public final ke.a[] c() {
        return new ke.a[]{oe.f.a, oe.p.a};
    }

    @Override // ke.a
    public final me.d d() {
        return descriptor;
    }
}
