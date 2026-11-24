// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class mv4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pv4 b;

    public /* synthetic */ mv4(pv4 pv4Var, byte b) {
        this.a = b;
        this.b = pv4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        pv4 pv4Var = this.b;
        switch (b) {
            case 0:
                pv4Var.E();
                break;
            default:
                String str = "https://t.me/giftcode/" + pv4Var.h;
                nk3 nk3Var = new nk3(td4.j(3, "onlySelect", "dialogsType", true));
                nk3Var.E2 = new nv4(pv4Var, str, (byte) 0);
                pv4Var.e.presentFragment(nk3Var);
                ((qv4) pv4Var).r.dismiss();
                break;
        }
    }
}
