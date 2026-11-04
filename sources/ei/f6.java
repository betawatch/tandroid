package ei;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ f6(z6 z6Var, int i3) {
        this.a = i3;
        this.b = z6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z6 z6Var = this.b;
                z6Var.R = false;
                z6Var.S = null;
                break;
            case 1:
                z6 z6Var2 = this.b;
                z6Var2.s = true;
                z6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                z6 z6Var3 = this.b;
                z6Var3.R = false;
                z6Var3.S = null;
                break;
        }
    }
}
