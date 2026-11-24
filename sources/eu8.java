// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ku8 b;

    public /* synthetic */ eu8(ku8 ku8Var, byte b) {
        this.a = b;
        this.b = ku8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ku8 ku8Var = this.b;
        switch (b) {
            case 0:
                if (!ku8Var.T && !ku8Var.S) {
                    tl0.c(ku8Var.F, ku8Var.h);
                    ku8Var.G.d();
                    soc socVar = ku8Var.r;
                    eu8 eu8Var = new eu8(ku8Var, (byte) 1);
                    moc mocVar = socVar.E;
                    if (mocVar == null) {
                        eu8Var.run();
                        break;
                    } else if (mocVar.b == null) {
                        mocVar.d = eu8Var;
                        break;
                    } else {
                        eu8Var.run();
                        break;
                    }
                }
                break;
            default:
                if (!ku8Var.T && !ku8Var.S) {
                    ku8Var.a(1.0f);
                    break;
                }
                break;
        }
    }
}
