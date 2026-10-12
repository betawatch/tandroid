package bi;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ v7(x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x8 x8Var = this.b;
                x8Var.R = false;
                x8Var.S = null;
                break;
            case 1:
                x8 x8Var2 = this.b;
                x8Var2.s = true;
                x8Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                x8 x8Var3 = this.b;
                x8Var3.R = false;
                x8Var3.S = null;
                break;
        }
    }
}
