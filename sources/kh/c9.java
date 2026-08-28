package kh;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ c9(n9 n9Var, int i9) {
        this.a = i9;
        this.b = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t9 t9Var = this.b.S;
                org.telegram.ui.Components.gc.h(t9Var.container);
                super/*org.telegram.ui.ActionBar.f3*/.dismiss();
                break;
            case 1:
                n9 n9Var = this.b;
                n9Var.v.setLoading(false);
                t9 t9Var2 = n9Var.S;
                t9Var2.f1();
                t9Var2.b.D(0);
                break;
            case 2:
                this.b.Q = false;
                break;
            case 3:
                t9 t9Var3 = this.b.S;
                t9Var3.I = 6;
                t9Var3.b.D(1);
                break;
            case 4:
                n9 n9Var2 = this.b;
                n9Var2.n.m(2);
                n9Var2.f.forceLayout();
                n9Var2.j();
                break;
            default:
                n9 n9Var3 = this.b;
                t9 t9Var4 = n9Var3.S;
                if (n9Var3.a != 0) {
                    t9Var4.onBackPressed();
                    break;
                } else {
                    t9Var4.dismiss();
                    break;
                }
        }
    }
}
