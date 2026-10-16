package di;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
