package mh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ o4(p4 p4Var, int i9) {
        this.a = i9;
        this.b = p4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p4 p4Var = this.b;
                if (p4Var.w) {
                    p4Var.d();
                    break;
                }
                break;
            default:
                this.b.invalidateSelf();
                break;
        }
    }
}
