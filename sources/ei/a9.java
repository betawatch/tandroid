package ei;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ a9(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r9 r9Var = this.b.W;
                org.telegram.ui.Components.qc.h(r9Var.container);
                super/*org.telegram.ui.ActionBar.h3*/.dismiss();
                break;
            case 1:
                k9 k9Var = this.b;
                k9Var.v.setLoading(false);
                r9 r9Var2 = k9Var.W;
                r9Var2.g1();
                r9Var2.b.D(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                r9 r9Var3 = this.b.W;
                r9Var3.M = 6;
                r9Var3.b.D(1);
                break;
            case 4:
                k9 k9Var2 = this.b;
                k9Var2.n.m(2);
                k9Var2.f.forceLayout();
                k9Var2.j();
                break;
            default:
                k9 k9Var3 = this.b;
                r9 r9Var4 = k9Var3.W;
                if (k9Var3.a != 0) {
                    r9Var4.onBackPressed();
                    break;
                } else {
                    r9Var4.dismiss();
                    break;
                }
        }
    }
}
