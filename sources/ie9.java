// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ne9 b;

    public /* synthetic */ ie9(ne9 ne9Var, byte b) {
        this.a = b;
        this.b = ne9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ne9 ne9Var = this.b;
        switch (b) {
            case 0:
                qh9 qh9Var = ne9Var.L2;
                if (qh9Var != null && ne9Var.f2 != null) {
                    ne9Var.M2 = true;
                    qh9Var.b().a.n(false);
                    try {
                        ne9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((ag9) ne9Var.f2).a(ne9Var, ne9Var.L2, true);
                    break;
                }
                break;
            case 1:
                ne9Var.K();
                break;
            default:
                ne9Var.P();
                break;
        }
    }
}
