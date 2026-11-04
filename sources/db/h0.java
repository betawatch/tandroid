package db;

import b8.ad;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements le.e {
    public static final h0 a;
    private static final je.d descriptor;

    static {
        h0 h0Var = new h0();
        a = h0Var;
        le.m mVar = new le.m("com.google.firebase.sessions.SessionData", h0Var, 3);
        mVar.k("sessionDetails", false);
        mVar.k("backgroundTime", true);
        mVar.k("processDataMap", true);
        descriptor = mVar;
    }

    @Override // he.a
    public final Object a(g2.d decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        je.d dVar = descriptor;
        g2.d c2 = decoder.c(dVar);
        dd.c[] cVarArr = j0.d;
        n0 n0Var = null;
        boolean z10 = true;
        int i3 = 0;
        h1 h1Var = null;
        Map map = null;
        while (z10) {
            int d = c2.d(dVar);
            if (d == -1) {
                z10 = false;
            } else if (d == 0) {
                n0Var = (n0) c2.k(dVar, 0, l0.a, n0Var);
                i3 |= 1;
            } else if (d == 1) {
                h1Var = (h1) c2.j(dVar, 1, f1.a, h1Var);
                i3 |= 2;
            } else {
                if (d != 2) {
                    throw new he.d(d);
                }
                map = (Map) c2.j(dVar, 2, (he.a) cVarArr[2].getValue(), map);
                i3 |= 4;
            }
        }
        c2.p(dVar);
        return new j0(i3, n0Var, h1Var, map);
    }

    @Override // le.e
    public final he.a[] b() {
        return new he.a[]{l0.a, ad.a(f1.a), ad.a((he.a) j0.d[2].getValue())};
    }

    @Override // he.a
    public final void c(ne.h hVar, Object obj) {
        j0 value = (j0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        je.d dVar = descriptor;
        ne.h a10 = hVar.a(dVar);
        dd.c[] cVarArr = j0.d;
        l0 l0Var = l0.a;
        n0 n0Var = value.a;
        Map map = value.c;
        h1 h1Var = value.b;
        a10.h(dVar, 0, l0Var, n0Var);
        if (a10.p(dVar) || h1Var != null) {
            a10.g(dVar, 1, f1.a, h1Var);
        }
        if (a10.p(dVar) || map != null) {
            a10.g(dVar, 2, (he.a) cVarArr[2].getValue(), map);
        }
        a10.l(dVar);
    }

    @Override // he.a
    public final je.d d() {
        return descriptor;
    }
}
