package oh;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;

    public /* synthetic */ x5(t6 t6Var, int i10) {
        this.a = i10;
        this.b = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t6 t6Var = this.b;
                t6Var.R = false;
                t6Var.S = null;
                break;
            case 1:
                t6 t6Var2 = this.b;
                t6Var2.s = true;
                t6Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                t6 t6Var3 = this.b;
                t6Var3.R = false;
                t6Var3.S = null;
                break;
        }
    }
}
