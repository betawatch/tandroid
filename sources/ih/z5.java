package ih;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ z5(v6 v6Var, int i9) {
        this.a = i9;
        this.b = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v6 v6Var = this.b;
                v6Var.R = false;
                v6Var.S = null;
                break;
            case 1:
                v6 v6Var2 = this.b;
                v6Var2.s = true;
                v6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                v6 v6Var3 = this.b;
                v6Var3.R = false;
                v6Var3.S = null;
                break;
        }
    }
}
