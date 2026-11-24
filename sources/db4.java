// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class db4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lb4 b;
    public final /* synthetic */ kb4 c;

    public /* synthetic */ db4(lb4 lb4Var, kb4 kb4Var, byte b) {
        this.a = b;
        this.b = lb4Var;
        this.c = kb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kb4 kb4Var = this.c;
        lb4 lb4Var = this.b;
        switch (b) {
            case 0:
                kb4Var.l = null;
                lb4Var.H0.remove(kb4Var);
                kb4Var.k = true;
                break;
            default:
                lb4Var.k(kb4Var, null);
                kb4Var.f.freeResources();
                break;
        }
    }
}
