package ai;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ j8(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l9 l9Var = this.b;
                l9Var.R = false;
                l9Var.S = null;
                break;
            case 1:
                l9 l9Var2 = this.b;
                l9Var2.s = true;
                l9Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                l9 l9Var3 = this.b;
                l9Var3.R = false;
                l9Var3.S = null;
                break;
        }
    }
}
