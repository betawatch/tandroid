// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class il6 extends to4 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public il6(bqb bqbVar, Object obj, Object obj2) {
        super(bqbVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // to4, bqb
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // to4, bqb
    public final ypb f(int i, ypb ypbVar, boolean z) {
        this.e.f(i, ypbVar, z);
        if (Objects.equals(ypbVar.b, this.g) && z) {
            ypbVar.b = h;
        }
        return ypbVar;
    }

    @Override // to4, bqb
    public final Object l(int i) {
        Object l = this.e.l(i);
        return Objects.equals(l, this.g) ? h : l;
    }

    @Override // to4, bqb
    public final aqb m(int i, aqb aqbVar, long j) {
        this.e.m(i, aqbVar, j);
        if (Objects.equals(aqbVar.a, this.f)) {
            aqbVar.a = aqb.p;
        }
        return aqbVar;
    }
}
