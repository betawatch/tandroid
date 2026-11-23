package bi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ q3(u3 u3Var, int i7) {
        this.a = i7;
        this.b = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u3 u3Var = this.b;
                if (u3Var.l2) {
                    u3Var.l2 = false;
                    u3Var.d2.setLoading(false);
                    u3Var.g1();
                    break;
                }
                break;
            case 1:
                u3 u3Var2 = this.b;
                if (!u3Var2.j2) {
                    u3Var2.j2 = true;
                    u3Var2.i2 = false;
                    u3Var2.h2 = false;
                    u3Var2.dismiss();
                    Runnable runnable = u3Var2.r2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!u3Var2.k2) {
                    u3Var2.k2 = true;
                    ai.e1 e1Var = u3Var2.t2;
                    if (e1Var != null) {
                        e1Var.run();
                        break;
                    }
                }
                break;
            case 2:
                this.b.f1();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
