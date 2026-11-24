// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class npb implements hu4 {
    public static final npb a;
    private static final y6a descriptor;

    static {
        npb npbVar = new npb();
        a = npbVar;
        if8 if8Var = new if8("com.google.firebase.sessions.Time", npbVar, 3);
        if8Var.j("ms", false);
        if8Var.j("us", true);
        if8Var.j("seconds", true);
        descriptor = if8Var;
    }

    @Override // hu4
    public final cx5[] a() {
        uh6 uh6Var = uh6.a;
        return new cx5[]{uh6Var, uh6Var, uh6Var};
    }

    @Override // cx5
    public final void b(c40 c40Var, Object obj) {
        ppb ppbVar = (ppb) obj;
        ppbVar.getClass();
        y6a y6aVar = descriptor;
        c40 a2 = c40Var.a(y6aVar);
        long j = ppbVar.a;
        long j2 = ppbVar.c;
        long j3 = ppbVar.b;
        a2.f(y6aVar, 0, j);
        if (a2.p(y6aVar) || j3 != j * 1000) {
            a2.f(y6aVar, 1, j3);
        }
        if (a2.p(y6aVar) || j2 != j / 1000) {
            a2.f(y6aVar, 2, j2);
        }
        a2.l(y6aVar);
    }

    @Override // cx5
    public final Object c(jif jifVar) {
        y6a y6aVar = descriptor;
        jif a2 = jifVar.a(y6aVar);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int b = a2.b(y6aVar);
            if (b == -1) {
                z = false;
            } else if (b == 0) {
                j = a2.h(y6aVar, 0);
                i |= 1;
            } else if (b == 1) {
                j2 = a2.h(y6aVar, 1);
                i |= 2;
            } else {
                if (b != 2) {
                    throw new tw5(b);
                }
                j3 = a2.h(y6aVar, 2);
                i |= 4;
            }
        }
        a2.o(y6aVar);
        return new ppb(i, j, j2, j3);
    }

    @Override // cx5
    public final y6a d() {
        return descriptor;
    }
}
