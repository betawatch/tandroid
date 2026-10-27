package di;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ n6(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h7 h7Var = this.b;
                h7Var.R = false;
                h7Var.S = null;
                break;
            case 1:
                h7 h7Var2 = this.b;
                h7Var2.s = true;
                h7Var2.l.edit().putBoolean("read_loaded", true).apply();
                break;
            default:
                h7 h7Var3 = this.b;
                h7Var3.R = false;
                h7Var3.S = null;
                break;
        }
    }
}
