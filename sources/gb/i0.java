package gb;

import c8.i9;
import java.util.Map;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements oe.e {
    public static final i0 a;
    private static final me.d descriptor;

    static {
        i0 i0Var = new i0();
        a = i0Var;
        oe.m mVar = new oe.m("com.google.firebase.sessions.SessionData", i0Var, 3);
        mVar.k("sessionDetails", false);
        mVar.k("backgroundTime", true);
        mVar.k("processDataMap", true);
        descriptor = mVar;
    }

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        k0 value = (k0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        gd.c[] cVarArr = k0.d;
        m0 m0Var = m0.a;
        o0 o0Var = value.a;
        Map map = value.c;
        h1 h1Var = value.b;
        a10.h(dVar, 0, m0Var, o0Var);
        if (a10.p(dVar) || h1Var != null) {
            a10.g(dVar, 1, f1.a, h1Var);
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
        gd.c[] cVarArr = k0.d;
        o0 o0Var = null;
        boolean z10 = true;
        int i7 = 0;
        h1 h1Var = null;
        Map map = null;
        while (z10) {
            int d = c10.d(dVar);
            if (d == -1) {
                z10 = false;
            } else if (d == 0) {
                o0Var = (o0) c10.k(dVar, 0, m0.a, o0Var);
                i7 |= 1;
            } else if (d == 1) {
                h1Var = (h1) c10.j(dVar, 1, f1.a, h1Var);
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
        return new k0(i7, o0Var, h1Var, map);
    }

    @Override // oe.e
    public final ke.a[] c() {
        return new ke.a[]{m0.a, i9.a(f1.a), i9.a((ke.a) k0.d[2].getValue())};
    }

    @Override // ke.a
    public final me.d d() {
        return descriptor;
    }
}
