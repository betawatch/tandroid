package bi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ k3(o3 o3Var, int i7) {
        this.a = i7;
        this.b = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o3 o3Var = this.b;
                if (o3Var.l2) {
                    o3Var.l2 = false;
                    o3Var.d2.setLoading(false);
                    o3Var.g1();
                    break;
                }
                break;
            case 1:
                o3 o3Var2 = this.b;
                if (!o3Var2.j2) {
                    o3Var2.j2 = true;
                    o3Var2.i2 = false;
                    o3Var2.h2 = false;
                    o3Var2.dismiss();
                    Runnable runnable = o3Var2.r2;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                if (!o3Var2.k2) {
                    o3Var2.k2 = true;
                    ai.a1 a1Var = o3Var2.t2;
                    if (a1Var != null) {
                        a1Var.run();
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
