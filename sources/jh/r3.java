package jh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;

    public /* synthetic */ r3(x3 x3Var, int i10) {
        this.a = i10;
        this.b = x3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((z8) this.b.l.M1).g(false);
                break;
            case 1:
                e4 e4Var = this.b.l;
                y3 y3Var = e4Var.M1;
                if (y3Var != null) {
                    i9 i9Var = ((z8) y3Var).d;
                    i9Var.V0 = false;
                    i9Var.P();
                }
                e4Var.f1(false);
                e4Var.d3 = true;
                e4Var.G0.D(true);
                break;
            case 2:
                e4 e4Var2 = this.b.l;
                e4Var2.Q3 = true;
                e4Var2.setActive(false);
                break;
            default:
                e4 e4Var3 = this.b.l;
                e4Var3.Q3 = true;
                e4Var3.setActive(false);
                break;
        }
    }
}
