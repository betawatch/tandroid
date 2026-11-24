// default package

import j$.util.Objects;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class fj6 extends sm4 {
    public static final Object h = new Object();
    public final Object f;
    public final Object g;

    public fj6(aob aobVar, Object obj, Object obj2) {
        super(aobVar);
        this.f = obj;
        this.g = obj2;
    }

    @Override // sm4, aob
    public final int b(Object obj) {
        Object obj2;
        if (h == obj && (obj2 = this.g) != null) {
            obj = obj2;
        }
        return this.e.b(obj);
    }

    @Override // sm4, aob
    public final xnb f(int i, xnb xnbVar, boolean z) {
        this.e.f(i, xnbVar, z);
        if (Objects.equals(xnbVar.b, this.g) && z) {
            xnbVar.b = h;
        }
        return xnbVar;
    }

    @Override // sm4, aob
    public final Object l(int i) {
        Object l = this.e.l(i);
        return Objects.equals(l, this.g) ? h : l;
    }

    @Override // sm4, aob
    public final znb m(int i, znb znbVar, long j) {
        this.e.m(i, znbVar, j);
        if (Objects.equals(znbVar.a, this.f)) {
            znbVar.a = znb.p;
        }
        return znbVar;
    }
}
