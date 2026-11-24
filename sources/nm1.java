// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ vs9 c;
    public final /* synthetic */ String d;

    public /* synthetic */ nm1(yv1 yv1Var, vs9 vs9Var, String str, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = vs9Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        String str = this.d;
        vs9 vs9Var = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                vs9Var.dismiss();
                gm.g(str);
                c41.b0(yv1Var).i(jb6.M0(2131746068, null)).j();
                break;
            case 1:
                yv1Var.getClass();
                vs9Var.dismiss();
                gm.g(str);
                c41.b0(yv1Var).i(jb6.M0(2131742884, null)).j();
                break;
            case 2:
                vs9Var.dismiss();
                gm.g("@".concat(str));
                c41.b0(yv1Var).i(jb6.M0(2131743352, null)).j();
                break;
            default:
                vs9Var.dismiss();
                gm.g(str);
                c41.b0(yv1Var).i(jb6.M0(2131752506, null)).j();
                break;
        }
    }
}
