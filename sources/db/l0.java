package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements le.e {
    public static final l0 a;
    private static final je.d descriptor;

    static {
        l0 l0Var = new l0();
        a = l0Var;
        le.m mVar = new le.m("com.google.firebase.sessions.SessionDetails", l0Var, 4);
        mVar.k("sessionId", false);
        mVar.k("firstSessionId", false);
        mVar.k("sessionIndex", false);
        mVar.k("sessionStartTimestampUs", false);
        descriptor = mVar;
    }

    @Override // he.a
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        int i3 = 0;
        int i10 = 0;
        String str = null;
        String str2 = null;
        long j10 = 0;
        boolean z10 = true;
        while (z10) {
            int d = c2.d(dVar);
            if (d == -1) {
                z10 = false;
            } else if (d == 0) {
                str = c2.n(dVar, 0);
                i3 |= 1;
            } else if (d == 1) {
                str2 = c2.n(dVar, 1);
                i3 |= 2;
            } else if (d == 2) {
                i10 = c2.f(dVar, 2);
                i3 |= 4;
            } else {
                if (d != 3) {
                    throw new he.d(d);
                }
                j10 = c2.h(dVar, 3);
                i3 |= 8;
            }
        }
        c2.p(dVar);
        return new n0(i3, str, str2, i10, j10);
    }

    @Override // le.e
    public final he.a[] b() {
        le.p pVar = le.p.a;
        return new he.a[]{pVar, pVar, le.f.a, le.i.a};
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        n0 value = (n0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        a10.k(dVar, 0, value.a);
        a10.k(dVar, 1, value.b);
        int i3 = value.c;
        a10.b(dVar, 2);
        a10.c(i3);
        a10.e(dVar, 3, value.d);
        a10.l(dVar);
    }

    @Override // he.a
    public final je.d d() {
        return descriptor;
    }
}
