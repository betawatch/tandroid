package id;

import h7.k6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q0 extends l1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ q0(Object obj, int i10) {
        this.e = i10;
        this.f = obj;
    }

    @Override // id.e1
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
                    m1Var.resumeWith(k6.a(((v) u10).a));
                    return;
                } else {
                    m1Var.resumeWith(f0.u(u10));
                    return;
                }
            default:
                ((m) this.f).resumeWith(pc.i.a);
                return;
        }
    }

    public q0(v1 v1Var) {
        this.e = 2;
        this.f = v1Var;
    }
}
