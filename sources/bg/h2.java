package bg;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q2 b;

    public /* synthetic */ h2(q2 q2Var, int i9) {
        this.a = i9;
        this.b = q2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.V(true);
                break;
            case 1:
                this.b.a0(true, false);
                break;
            case 2:
                this.b.Q();
                break;
            case 3:
                this.b.a0(true, false);
                break;
            case 4:
                this.b.a0(true, false);
                break;
            case 5:
                this.b.a0(true, false);
                break;
            case 6:
                q2 q2Var = this.b;
                q2Var.a0.clear();
                q2Var.b0.clear();
                q2Var.dismiss();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
