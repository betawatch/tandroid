package ae;

import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class r0 extends m1 {
    public final /* synthetic */ int e;
    public final Object f;

    public /* synthetic */ r0(Object obj, int i10) {
        this.e = i10;
        this.f = obj;
    }

    @Override // ae.f1
    public final void a(Throwable th2) {
        switch (this.e) {
            case 0:
                ((q0) this.f).dispose();
                return;
            case 1:
                ((f1) this.f).a(th2);
                return;
            case 2:
                ((w1) this.f).u();
                throw null;
            case 3:
                n1 n1Var = (n1) this.f;
                Object u10 = i().u();
                if (u10 instanceof v) {
                    n1Var.resumeWith(a8.a(((v) u10).a));
                    return;
                } else {
                    n1Var.resumeWith(g0.u(u10));
                    return;
                }
            default:
                ((m) this.f).resumeWith(hd.i.a);
                return;
        }
    }

    public r0(w1 w1Var) {
        this.e = 2;
        this.f = w1Var;
    }
}
