package gi;

import org.telegram.ui.Components.ac;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ c8(o8 o8Var, int i3) {
        this.a = i3;
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t8 t8Var = this.b.a0;
                ac.h(t8Var.c);
                super/*org.telegram.ui.ActionBar.t2*/.dismiss();
                break;
            case 1:
                o8 o8Var = this.b;
                o8Var.w.setLoading(false);
                t8 t8Var2 = o8Var.a0;
                t8Var2.M0();
                t8Var2.j1.D(0);
                break;
            case 2:
                this.b.V = false;
                break;
            case 3:
                t8 t8Var3 = this.b.a0;
                t8Var3.E1 = 6;
                t8Var3.j1.D(1);
                break;
            case 4:
                o8 o8Var2 = this.b;
                o8Var2.n.g(2);
                o8Var2.f.forceLayout();
                o8Var2.k();
                break;
            default:
                o8 o8Var3 = this.b;
                t8 t8Var4 = o8Var3.a0;
                if (o8Var3.a != 0) {
                    t8Var4.onBackPressed();
                    break;
                } else {
                    t8Var4.dismiss();
                    break;
                }
        }
    }
}
