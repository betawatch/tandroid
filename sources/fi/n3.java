package fi;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t3 b;

    public /* synthetic */ n3(t3 t3Var, int i7) {
        this.a = i7;
        this.b = t3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((z8) this.b.x.A1).g(false);
                break;
            case 1:
                b4 b4Var = this.b.x;
                u3 u3Var = b4Var.A1;
                if (u3Var != null) {
                    i9 i9Var = ((z8) u3Var).d;
                    i9Var.Z0 = false;
                    i9Var.V();
                }
                b4Var.d1(false);
                b4Var.R2 = true;
                b4Var.u0.E(true);
                break;
            case 2:
                b4 b4Var2 = this.b.x;
                b4Var2.E3 = true;
                b4Var2.setActive(false);
                break;
            default:
                b4 b4Var3 = this.b.x;
                b4Var3.E3 = true;
                b4Var3.setActive(false);
                break;
        }
    }
}
