// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ef8 extends to4 {
    public final aqb f;

    public ef8(bqb bqbVar) {
        super(bqbVar);
        this.f = new aqb();
    }

    @Override // to4, bqb
    public final ypb f(int i, ypb ypbVar, boolean z) {
        bqb bqbVar = this.e;
        ypb f = bqbVar.f(i, ypbVar, z);
        if (!bqbVar.m(f.c, this.f, 0L).a()) {
            f.f = true;
            return f;
        }
        Object obj = ypbVar.a;
        Object obj2 = ypbVar.b;
        int i2 = ypbVar.c;
        long j = ypbVar.d;
        long j2 = ypbVar.e;
        da daVar = da.c;
        f.h(obj, obj2, i2, j, j2, true);
        return f;
    }
}
