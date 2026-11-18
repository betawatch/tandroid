package oi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;

    public /* synthetic */ x0(e1 e1Var, int i7) {
        this.a = i7;
        this.b = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e1 e1Var = this.b;
                h4 h4Var = e1Var.L2;
                if (h4Var != null && e1Var.f2 != null) {
                    e1Var.M2 = true;
                    h4Var.b().a.m(false);
                    try {
                        e1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((q2) e1Var.f2).a(e1Var, e1Var.L2, true);
                    break;
                }
                break;
            case 1:
                this.b.K();
                break;
            default:
                this.b.P();
                break;
        }
    }
}
