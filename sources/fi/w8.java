package fi;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9 b;

    public /* synthetic */ w8(g9 g9Var, int i10) {
        this.a = i10;
        this.b = g9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n9 n9Var = this.b.W;
                org.telegram.ui.Components.qc.h(n9Var.container);
                super/*org.telegram.ui.ActionBar.k3*/.dismiss();
                break;
            case 1:
                g9 g9Var = this.b;
                g9Var.v.setLoading(false);
                n9 n9Var2 = g9Var.W;
                n9Var2.g1();
                n9Var2.b.E(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                n9 n9Var3 = this.b.W;
                n9Var3.M = 6;
                n9Var3.b.E(1);
                break;
            case 4:
                g9 g9Var2 = this.b;
                g9Var2.n.m(2);
                g9Var2.f.forceLayout();
                g9Var2.j();
                break;
            default:
                g9 g9Var3 = this.b;
                n9 n9Var4 = g9Var3.W;
                if (g9Var3.a != 0) {
                    n9Var4.onBackPressed();
                    break;
                } else {
                    n9Var4.dismiss();
                    break;
                }
        }
    }
}
