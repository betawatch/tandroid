// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jk8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lk8 b;

    public /* synthetic */ jk8(lk8 lk8Var, byte b) {
        this.a = b;
        this.b = lk8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        lk8 lk8Var = this.b;
        switch (b) {
            case 0:
                String str = "https://t.me/giftcode/" + lk8Var.M2;
                nk3 nk3Var = new nk3(td4.j(3, "onlySelect", "dialogsType", true));
                nk3Var.E2 = new cz6(lk8Var, str, (byte) 25);
                lk8Var.r1.presentFragment(nk3Var);
                lk8Var.dismiss();
                break;
            default:
                yj8 yj8Var = new yj8(lk8Var.r1, z8c.t0, null, null, null, lk8Var.J0);
                yj8Var.E2 = true;
                yj8Var.F2 = true;
                yj8Var.X1 = true;
                lk8Var.r1.showDialog(yj8Var);
                break;
        }
    }
}
