// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ml7 b;

    public /* synthetic */ fl7(ml7 ml7Var, byte b) {
        this.a = b;
        this.b = ml7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ml7 ml7Var = this.b;
        switch (b) {
            case 0:
                gm.t1(ml7Var.l1);
                break;
            default:
                gm.E3(ml7Var.m1.getEditText());
                break;
        }
    }
}
