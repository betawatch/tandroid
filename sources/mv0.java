// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qw0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ mv0(qw0 qw0Var, String str, byte b) {
        this.a = b;
        this.b = qw0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.c;
        qw0 qw0Var = this.b;
        switch (b) {
            case 0:
                mw0 mw0Var = qw0Var.a;
                if (mw0Var != null) {
                    mw0Var.c(str);
                    break;
                }
                break;
            default:
                qw0Var.O = false;
                qw0Var.Q = 0L;
                qw0Var.U = false;
                qw0Var.b = str;
                qw0Var.a();
                mw0 mw0Var2 = qw0Var.a;
                if (mw0Var2 != null) {
                    mw0Var2.onResume();
                    qw0Var.a.loadUrl(str);
                    break;
                }
                break;
        }
    }
}
