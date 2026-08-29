package lh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ p3(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((z8) this.b.l.M1).g(false);
                break;
            case 1:
                d4 d4Var = this.b.l;
                x3 x3Var = d4Var.M1;
                if (x3Var != null) {
                    i9 i9Var = ((z8) x3Var).d;
                    i9Var.V0 = false;
                    i9Var.P();
                }
                d4Var.f1(false);
                d4Var.d3 = true;
                d4Var.G0.D(true);
                break;
            case 2:
                d4 d4Var2 = this.b.l;
                d4Var2.Q3 = true;
                d4Var2.setActive(false);
                break;
            default:
                d4 d4Var3 = this.b.l;
                d4Var3.Q3 = true;
                d4Var3.setActive(false);
                break;
        }
    }
}
