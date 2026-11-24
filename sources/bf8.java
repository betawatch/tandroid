// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bf8 extends bqb {
    public static final Object j = new Object();
    public final bt6 e;
    public final boolean f;
    public final boolean g;
    public final ws6 h;
    public final long i;

    public bf8(cf8 cf8Var) {
        this.e = cf8Var.u();
        this.f = cf8Var.c0();
        this.g = cf8Var.u0();
        this.h = cf8Var.P0() ? ws6.f : null;
        this.i = hac.T(cf8Var.z());
    }

    @Override // bqb
    public final int b(Object obj) {
        return j != obj ? -1 : 0;
    }

    @Override // bqb
    public final ypb f(int i, ypb ypbVar, boolean z) {
        da daVar = da.c;
        Object obj = j;
        ypbVar.h(obj, obj, 0, this.i, 0L, false);
        return ypbVar;
    }

    @Override // bqb
    public final int h() {
        return 1;
    }

    @Override // bqb
    public final Object l(int i) {
        return j;
    }

    @Override // bqb
    public final aqb m(int i, aqb aqbVar, long j2) {
        aqbVar.b(j, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f, this.g, this.h, 0L, this.i, 0, 0, 0L);
        aqbVar.j = false;
        return aqbVar;
    }

    @Override // bqb
    public final int o() {
        return 1;
    }
}
