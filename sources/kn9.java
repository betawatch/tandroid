// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class kn9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ et8 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ kn9(et8 et8Var, Exception exc, byte b) {
        this.a = b;
        this.b = et8Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Exception exc = this.c;
        et8 et8Var = this.b;
        switch (b) {
            case 0:
                un9 un9Var = (un9) et8Var.b;
                un9Var.m.a("recording segment interrupted in state=".concat(hg9.A(un9Var.a0)), exc);
                int i = un9Var.a0;
                if (i != 3) {
                    if (i == 2) {
                        un9Var.D = true;
                        break;
                    }
                } else {
                    un9Var.q();
                    break;
                }
                break;
            default:
                ((un9) et8Var.b).h(exc);
                break;
        }
    }
}
