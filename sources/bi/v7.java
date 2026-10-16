package bi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
