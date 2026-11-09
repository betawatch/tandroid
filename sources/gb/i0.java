package gb;

import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        i1 i1Var = value.b;
        a10.h(dVar, 0, m0Var, o0Var);
        if (a10.p(dVar) || i1Var != null) {
            a10.g(dVar, 1, g1.a, i1Var);
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
        boolean z9 = true;
        int i7 = 0;
        i1 i1Var = null;
        Map map = null;
        while (z9) {
            int d = c10.d(dVar);
            if (d == -1) {
                z9 = false;
            } else if (d == 0) {
                o0Var = (o0) c10.k(dVar, 0, m0.a, o0Var);
                i7 |= 1;
            } else if (d == 1) {
                i1Var = (i1) c10.j(dVar, 1, g1.a, i1Var);
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
        return new k0(i7, o0Var, i1Var, map);
    }

    @Override // oe.e
    public final ke.a[] c() {
        return new ke.a[]{m0.a, c8.k1.a(g1.a), c8.k1.a((ke.a) k0.d[2].getValue())};
    }

    @Override // ke.a
    public final me.d d() {
        return descriptor;
    }
}
