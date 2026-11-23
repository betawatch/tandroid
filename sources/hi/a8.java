package hi;

import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ a8(k8 k8Var, int i7) {
        this.a = i7;
        this.b = k8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p8 p8Var = this.b.a0;
                gc.h(p8Var.c);
                super/*org.telegram.ui.ActionBar.w2*/.dismiss();
                break;
            case 1:
                k8 k8Var = this.b;
                k8Var.w.setLoading(false);
                p8 p8Var2 = k8Var.a0;
                p8Var2.N0();
                p8Var2.m1.A(0);
                break;
            case 2:
                this.b.V = false;
                break;
            case 3:
                p8 p8Var3 = this.b.a0;
                p8Var3.H1 = 6;
                p8Var3.m1.A(1);
                break;
            case 4:
                k8 k8Var2 = this.b;
                k8Var2.n.g(2);
                k8Var2.f.forceLayout();
                k8Var2.k();
                break;
            default:
                k8 k8Var3 = this.b;
                p8 p8Var4 = k8Var3.a0;
                if (k8Var3.a != 0) {
                    p8Var4.onBackPressed();
                    break;
                } else {
                    p8Var4.dismiss();
                    break;
                }
        }
    }
}
