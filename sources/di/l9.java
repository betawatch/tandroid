package di;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ l9(x9 x9Var, int i10) {
        this.a = i10;
        this.b = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ea eaVar = this.b.W;
                org.telegram.ui.Components.sc.h(eaVar.container);
                super/*org.telegram.ui.ActionBar.e3*/.dismiss();
                break;
            case 1:
                x9 x9Var = this.b;
                x9Var.v.setLoading(false);
                ea eaVar2 = x9Var.W;
                eaVar2.g1();
                eaVar2.b.D(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                ea eaVar3 = this.b.W;
                eaVar3.M = 6;
                eaVar3.b.D(1);
                break;
            case 4:
                x9 x9Var2 = this.b;
                x9Var2.n.m(2);
                x9Var2.f.forceLayout();
                x9Var2.j();
                break;
            default:
                x9 x9Var3 = this.b;
                ea eaVar4 = x9Var3.W;
                if (x9Var3.a != 0) {
                    eaVar4.onBackPressed();
                    break;
                } else {
                    eaVar4.dismiss();
                    break;
                }
        }
    }
}
