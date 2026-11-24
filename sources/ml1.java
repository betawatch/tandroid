// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                mu1Var.w9(i);
                break;
            case 4:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 5:
                mu1Var.s8(i);
                break;
            case 6:
                mu1Var.r8(i);
                break;
            case 7:
                mu1Var.getConnectionsManager().cancelRequest(i, true);
                break;
            case 8:
                mu1Var.Q8(i);
                break;
            default:
                mu1Var.R8(i);
                break;
        }
    }
}
