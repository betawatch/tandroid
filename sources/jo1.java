// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class jo1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ k27 d;

    public /* synthetic */ jo1(mu1 mu1Var, int i, k27 k27Var) {
        this.b = mu1Var;
        this.c = i;
        this.d = k27Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        k27 k27Var = this.d;
        int i = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.D4 = null;
                k27Var.k.replies.read_max_id = i;
                break;
            default:
                u21.b0(mu1Var).c(k96.M0(2131754485, null)).j();
                na7.q1(i).l0(false);
                mu1Var.Pa(k27Var);
                mu1Var.Ra(k27Var);
                break;
        }
    }

    public /* synthetic */ jo1(mu1 mu1Var, k27 k27Var, int i) {
        this.b = mu1Var;
        this.d = k27Var;
        this.c = i;
    }
}
