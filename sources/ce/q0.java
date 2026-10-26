package ce;

import a8.jd;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class q0 extends l1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ q0(Object obj, int i10) {
        this.e = i10;
        this.f = obj;
    }

    @Override // ce.e1
    public final void a(Throwable th2) {
        switch (this.e) {
            case 0:
                ((p0) this.f).dispose();
                return;
            case 1:
                ((e1) this.f).a(th2);
                return;
            case 2:
                ((v1) this.f).u();
                throw null;
            case 3:
                m1 m1Var = (m1) this.f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    m1Var.resumeWith(jd.a(((v) u10).a));
                    return;
                } else {
                    m1Var.resumeWith(f0.u(u10));
                    return;
                }
            default:
                ((m) this.f).resumeWith(jd.i.a);
                return;
        }
    }

    public q0(v1 v1Var) {
        this.e = 2;
        this.f = v1Var;
    }
}
