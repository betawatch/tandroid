package di;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
