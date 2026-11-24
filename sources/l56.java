// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class l56 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s56 b;

    public /* synthetic */ l56(s56 s56Var, byte b) {
        this.a = b;
        this.b = s56Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        s56 s56Var = this.b;
        switch (b) {
            case 0:
                l11.u(s56Var.getParentActivity(), jb6.M0(2131745889, null));
                break;
            case 1:
                s56Var.r.d.requestFocus();
                gm.E3(s56Var.r.d);
                break;
            default:
                s56Var.r.d.clearFocus();
                gm.t1(s56Var.r.d);
                break;
        }
    }
}
