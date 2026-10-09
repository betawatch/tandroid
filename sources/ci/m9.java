package ci;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ m9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fa faVar = this.b.W;
                org.telegram.ui.Components.tc.h(faVar.container);
                super/*org.telegram.ui.ActionBar.f3*/.dismiss();
                break;
            case 1:
                y9 y9Var = this.b;
                y9Var.v.setLoading(false);
                fa faVar2 = y9Var.W;
                faVar2.g1();
                faVar2.b.D(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                fa faVar3 = this.b.W;
                faVar3.M = 6;
                faVar3.b.D(1);
                break;
            case 4:
                y9 y9Var2 = this.b;
                y9Var2.n.m(2);
                y9Var2.f.forceLayout();
                y9Var2.j();
                break;
            default:
                y9 y9Var3 = this.b;
                fa faVar4 = y9Var3.W;
                if (y9Var3.a != 0) {
                    faVar4.onBackPressed();
                    break;
                } else {
                    faVar4.dismiss();
                    break;
                }
        }
    }
}
