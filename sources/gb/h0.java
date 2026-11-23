package gb;

import c8.h9;
import java.util.Map;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements oe.e {
    public static final h0 a;
    private static final me.d descriptor;

    static {
        h0 h0Var = new h0();
        a = h0Var;
        oe.m mVar = new oe.m("com.google.firebase.sessions.SessionData", h0Var, 3);
        mVar.k("sessionDetails", false);
        mVar.k("backgroundTime", true);
        mVar.k("processDataMap", true);
        descriptor = mVar;
    }

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        j0 value = (j0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        gd.c[] cVarArr = j0.d;
        l0 l0Var = l0.a;
        n0 n0Var = value.a;
        Map map = value.c;
        g1 g1Var = value.b;
        a10.h(dVar, 0, l0Var, n0Var);
        if (a10.p(dVar) || g1Var != null) {
            a10.g(dVar, 1, e1.a, g1Var);
        }
        if (a10.p(dVar) || map != null) {
            a10.g(dVar, 2, (ke.a) cVarArr[2].getValue(), map);
        }
        a10.l(dVar);
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        gd.c[] cVarArr = j0.d;
        n0 n0Var = null;
        boolean z10 = true;
        int i7 = 0;
        g1 g1Var = null;
        Map map = null;
        while (z10) {
            int d = c10.d(dVar);
            if (d == -1) {
                z10 = false;
            } else if (d == 0) {
                n0Var = (n0) c10.k(dVar, 0, l0.a, n0Var);
                i7 |= 1;
            } else if (d == 1) {
                g1Var = (g1) c10.j(dVar, 1, e1.a, g1Var);
                i7 |= 2;
            } else {
                if (d != 2) {
                    throw new ke.d(d);
                }
                map = (Map) c10.j(dVar, 2, (ke.a) cVarArr[2].getValue(), map);
                i7 |= 4;
            }
        }
        c10.p(dVar);
        return new j0(i7, n0Var, g1Var, map);
    }

    @Override // oe.e
    public final ke.a[] c() {
        return new ke.a[]{l0.a, h9.a(e1.a), h9.a((ke.a) j0.d[2].getValue())};
    }

    @Override // ke.a
    public final me.d d() {
        return descriptor;
    }
}
