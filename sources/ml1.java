// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ml1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ml1(mu1 mu1Var, int i, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 1:
                this.b.J(this.c, 0, 0, 0, false, true);
                break;
            case 2:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 3:
                mu1Var.u9(i);
                break;
            case 4:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 5:
                mu1Var.q8(i);
                break;
            case 6:
                mu1Var.p8(i);
                break;
            case 7:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 8:
                mu1Var.O8(i);
                break;
            default:
                mu1Var.P8(i);
                break;
        }
    }
}
