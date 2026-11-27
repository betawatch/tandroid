// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class kl6 extends xo4 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public kl6(asb asbVar, Object obj, Object obj2) {
        super(asbVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // xo4, asb
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // xo4, asb
    public final xrb f(int i, xrb xrbVar, boolean z) {
        this.e.f(i, xrbVar, z);
        if (Objects.equals(xrbVar.b, this.g) && z) {
            xrbVar.b = h;
        }
        return xrbVar;
    }

    @Override // xo4, asb
    public final Object l(int i) {
        Object l = this.e.l(i);
        return Objects.equals(l, this.g) ? h : l;
    }

    @Override // xo4, asb
    public final zrb m(int i, zrb zrbVar, long j) {
        this.e.m(i, zrbVar, j);
        if (Objects.equals(zrbVar.a, this.f)) {
            zrbVar.a = zrb.p;
        }
        return zrbVar;
    }
}
