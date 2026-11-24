// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class el1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ tq9 c;
    public final /* synthetic */ String d;

    public /* synthetic */ el1(mu1 mu1Var, tq9 tq9Var, String str, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = tq9Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        tq9 tq9Var = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                tq9Var.dismiss();
                gl.g(str);
                u21.b0(mu1Var).i(k96.M0(2131746142, null)).j();
                break;
            case 1:
                mu1Var.getClass();
                tq9Var.dismiss();
                gl.g(str);
                u21.b0(mu1Var).i(k96.M0(2131742958, null)).j();
                break;
            case 2:
                tq9Var.dismiss();
                gl.g(str);
                u21.b0(mu1Var).i(k96.M0(2131752541, null)).j();
                break;
            default:
                tq9Var.dismiss();
                gl.g("@".concat(str));
                u21.b0(mu1Var).i(k96.M0(2131743426, null)).j();
                break;
        }
    }
}
