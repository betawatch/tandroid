package bi;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f5 b;

    public /* synthetic */ x4(f5 f5Var, int i10) {
        this.a = i10;
        this.b = f5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((gb) this.b.l.Q1).g(false);
                break;
            case 1:
                o5 o5Var = this.b.l;
                h5 h5Var = o5Var.Q1;
                if (h5Var != null) {
                    pb pbVar = ((gb) h5Var).d;
                    pbVar.Z0 = false;
                    pbVar.P();
                }
                o5Var.f1(false);
                o5Var.h3 = true;
                o5Var.K0.D(true);
                break;
            case 2:
                o5 o5Var2 = this.b.l;
                o5Var2.U3 = true;
                o5Var2.setActive(false);
                break;
            default:
                o5 o5Var3 = this.b.l;
                o5Var3.U3 = true;
                o5Var3.setActive(false);
                break;
        }
    }
}
