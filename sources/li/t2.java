package li;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ t2(g1 g1Var, int i7, int i10) {
        this.a = i10;
        this.b = g1Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                g1Var.N();
                g1Var.setSelection(Math.max(0, Math.min(this.c, g1Var.length())));
                break;
            case 1:
                g1 g1Var2 = this.b;
                g1Var2.N();
                g1Var2.setSelection(Math.max(0, Math.min(this.c, g1Var2.length())));
                break;
            case 2:
                g1 g1Var3 = this.b;
                g1Var3.N();
                g1Var3.setSelection(Math.max(0, Math.min(this.c, g1Var3.length())));
                break;
            case 3:
                g1 g1Var4 = this.b;
                g1Var4.N();
                g1Var4.setSelection(Math.min(this.c, g1Var4.length()));
                break;
            default:
                g1 g1Var5 = this.b;
                g1Var5.N();
                g1Var5.setSelection(Math.max(0, Math.min(this.c, g1Var5.length())));
                break;
        }
    }
}
