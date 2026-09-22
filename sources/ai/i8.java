package ai;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ i8(l9 l9Var, int i10) {
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
