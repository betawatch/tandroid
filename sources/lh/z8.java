package lh;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ z8(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q9 q9Var = this.b.S;
                org.telegram.ui.Components.ec.h(q9Var.container);
                super/*org.telegram.ui.ActionBar.e3*/.dismiss();
                break;
            case 1:
                k9 k9Var = this.b;
                k9Var.v.setLoading(false);
                q9 q9Var2 = k9Var.S;
                q9Var2.f1();
                q9Var2.b.D(0);
                break;
            case 2:
                this.b.Q = false;
                break;
            case 3:
                q9 q9Var3 = this.b.S;
                q9Var3.I = 6;
                q9Var3.b.D(1);
                break;
            case 4:
                k9 k9Var2 = this.b;
                k9Var2.n.m(2);
                k9Var2.f.forceLayout();
                k9Var2.j();
                break;
            default:
                k9 k9Var3 = this.b;
                q9 q9Var4 = k9Var3.S;
                if (k9Var3.a != 0) {
                    q9Var4.onBackPressed();
                    break;
                } else {
                    q9Var4.dismiss();
                    break;
                }
        }
    }
}
