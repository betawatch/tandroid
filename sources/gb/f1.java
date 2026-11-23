package gb;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements oe.e {
    public static final f1 a;
    private static final me.d descriptor;

    static {
        f1 f1Var = new f1();
        a = f1Var;
        oe.m mVar = new oe.m("com.google.firebase.sessions.Time", f1Var, 3);
        mVar.k("ms", false);
        mVar.k("us", true);
        mVar.k("seconds", true);
        descriptor = mVar;
    }

    @Override // ke.a
    public final void a(qe.h hVar, Object obj) {
        h1 value = (h1) obj;
        kotlin.jvm.internal.j.e(value, "value");
        me.d dVar = descriptor;
        qe.h a10 = hVar.a(dVar);
        long j3 = value.a;
        long j10 = value.c;
        long j11 = value.b;
        a10.e(dVar, 0, j3);
        if (a10.p(dVar) || j11 != 1000 * j3) {
            a10.e(dVar, 1, j11);
        }
        if (a10.p(dVar) || j10 != j3 / 1000) {
            a10.e(dVar, 2, j10);
        }
        a10.l(dVar);
    }

    @Override // ke.a
    public final Object b(h2.c decoder) {
        kotlin.jvm.internal.j.e(decoder, "decoder");
        me.d dVar = descriptor;
        h2.c c10 = decoder.c(dVar);
        int i7 = 0;
        long j3 = 0;
        long j10 = 0;
        long j11 = 0;
        boolean z10 = true;
        while (z10) {
            int d = c10.d(dVar);
            if (d == -1) {
                z10 = false;
            } else if (d == 0) {
                j3 = c10.h(dVar, 0);
                i7 |= 1;
            } else if (d == 1) {
                j10 = c10.h(dVar, 1);
                i7 |= 2;
            } else {
                if (d != 2) {
                    throw new ke.d(d);
                }
                j11 = c10.h(dVar, 2);
                i7 |= 4;
            }
        }
        c10.p(dVar);
        return new h1(i7, j3, j10, j11);
    }

    @Override // oe.e
    public final ke.a[] c() {
        oe.i iVar = oe.i.a;
        return new ke.a[]{iVar, iVar, iVar};
    }

    @Override // ke.a
    public final me.d d() {
        return descriptor;
    }
}
