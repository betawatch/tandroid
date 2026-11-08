package gb;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements oe.e {
    public static final m0 a;
    private static final me.d descriptor;

    static {
        m0 m0Var = new m0();
        a = m0Var;
        oe.m mVar = new oe.m("com.google.firebase.sessions.SessionDetails", m0Var, 4);
        mVar.k("sessionId", false);
        mVar.k("firstSessionId", false);
        mVar.k("sessionIndex", false);
        mVar.k("sessionStartTimestampUs", false);
        descriptor = mVar;
    }

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        o0 value = (o0) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        a10.k(dVar, 0, value.a);
        a10.k(dVar, 1, value.b);
        int i7 = value.c;
        a10.b(dVar, 2);
        a10.c(i7);
        a10.e(dVar, 3, value.d);
        a10.l(dVar);
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        int i7 = 0;
        int i10 = 0;
        String str = null;
        String str2 = null;
        long j3 = 0;
        boolean z9 = true;
        while (z9) {
            int d = c10.d(dVar);
            if (d == -1) {
                z9 = false;
            } else if (d == 0) {
                str = c10.n(dVar, 0);
                i7 |= 1;
            } else if (d == 1) {
                str2 = c10.n(dVar, 1);
                i7 |= 2;
            } else if (d == 2) {
                i10 = c10.f(dVar, 2);
                i7 |= 4;
            } else {
                if (d != 3) {
                    throw new ke.d(d);
                }
                j3 = c10.h(dVar, 3);
                i7 |= 8;
            }
        }
        c10.p(dVar);
        return new o0(i7, str, str2, i10, j3);
    }

    @Override // oe.e
    public final ke.a[] c() {
        oe.p pVar = oe.p.a;
        return new ke.a[]{pVar, pVar, oe.f.a, oe.i.a};
    }

    @Override // ke.a
    public final me.d d() {
        return descriptor;
    }
}
