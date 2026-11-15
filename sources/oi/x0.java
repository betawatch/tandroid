package oi;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                f4 f4Var = e1Var.L2;
                if (f4Var != null && e1Var.f2 != null) {
                    e1Var.M2 = true;
                    f4Var.b().a.m(false);
                    try {
                        e1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((p2) e1Var.f2).a(e1Var, e1Var.L2, true);
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
