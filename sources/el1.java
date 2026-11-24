// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
