package hd;

import g7.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q0 extends l1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ q0(Object obj, int i9) {
        this.e = i9;
        this.f = obj;
    }

    @Override // hd.e1
    public final void a(Throwable th) {
        switch (this.e) {
            case 0:
                ((p0) this.f).dispose();
                return;
            case 1:
                ((e1) this.f).a(th);
                return;
            case 2:
                ((v1) this.f).u();
                throw null;
            case 3:
                m1 m1Var = (m1) this.f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    m1Var.resumeWith(y5.a(((v) u10).a));
                    return;
                } else {
                    m1Var.resumeWith(f0.u(u10));
                    return;
                }
            default:
                ((m) this.f).resumeWith(oc.i.a);
                return;
        }
    }

    public q0(v1 v1Var) {
        this.e = 2;
        this.f = v1Var;
    }
}
