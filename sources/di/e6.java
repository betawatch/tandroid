package di;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ e6(y6 y6Var, int i7) {
        this.a = i7;
        this.b = y6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y6 y6Var = this.b;
                y6Var.R = false;
                y6Var.S = null;
                break;
            case 1:
                y6 y6Var2 = this.b;
                y6Var2.s = true;
                y6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                y6 y6Var3 = this.b;
                y6Var3.R = false;
                y6Var3.S = null;
                break;
        }
    }
}
