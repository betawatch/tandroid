package db;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements le.e {
    public static final y a;
    private static final je.d descriptor;

    static {
        y yVar = new y();
        a = yVar;
        le.m mVar = new le.m("com.google.firebase.sessions.ProcessData", yVar, 2);
        mVar.k("pid", false);
        mVar.k("uuid", false);
        descriptor = mVar;
    }

    @Override // he.a
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        String str = null;
        boolean z10 = true;
        int i3 = 0;
        int i10 = 0;
        while (z10) {
            int d = c2.d(dVar);
            if (d == -1) {
                z10 = false;
            } else if (d == 0) {
                i10 = c2.f(dVar, 0);
                i3 |= 1;
            } else {
                if (d != 1) {
                    throw new he.d(d);
                }
                str = c2.n(dVar, 1);
                i3 |= 2;
            }
        }
        c2.p(dVar);
        return new a0(i3, i10, str);
    }

    @Override // le.e
    public final he.a[] b() {
        return new he.a[]{le.f.a, le.p.a};
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        a0 value = (a0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        int i3 = value.a;
        a10.b(dVar, 0);
        a10.c(i3);
        a10.k(dVar, 1, value.b);
        a10.l(dVar);
    }

    @Override // he.a
    public final je.d d() {
        return descriptor;
    }
}
