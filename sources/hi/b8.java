package hi;

import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ b8(l8 l8Var, int i7) {
        this.a = i7;
        this.b = l8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q8 q8Var = this.b.a0;
                gc.h(q8Var.c);
                super/*org.telegram.ui.ActionBar.x2*/.dismiss();
                break;
            case 1:
                l8 l8Var = this.b;
                l8Var.w.setLoading(false);
                q8 q8Var2 = l8Var.a0;
                q8Var2.N0();
                q8Var2.m1.A(0);
                break;
            case 2:
                this.b.V = false;
                break;
            case 3:
                q8 q8Var3 = this.b.a0;
                q8Var3.H1 = 6;
                q8Var3.m1.A(1);
                break;
            case 4:
                l8 l8Var2 = this.b;
                l8Var2.n.g(2);
                l8Var2.f.forceLayout();
                l8Var2.k();
                break;
            default:
                l8 l8Var3 = this.b;
                q8 q8Var4 = l8Var3.a0;
                if (l8Var3.a != 0) {
                    q8Var4.onBackPressed();
                    break;
                } else {
                    q8Var4.dismiss();
                    break;
                }
        }
    }
}
