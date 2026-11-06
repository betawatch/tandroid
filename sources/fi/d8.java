package fi;

import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ d8(n8 n8Var, int i7) {
        this.a = i7;
        this.b = n8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s8 s8Var = this.b.W;
                cc.h(s8Var.c);
                super/*org.telegram.ui.ActionBar.v2*/.dismiss();
                break;
            case 1:
                n8 n8Var = this.b;
                n8Var.w.setLoading(false);
                s8 s8Var2 = n8Var.W;
                s8Var2.M0();
                s8Var2.i1.E(0);
                break;
            case 2:
                this.b.U = false;
                break;
            case 3:
                s8 s8Var3 = this.b.W;
                s8Var3.D1 = 6;
                s8Var3.i1.E(1);
                break;
            case 4:
                n8 n8Var2 = this.b;
                n8Var2.n.g(2);
                n8Var2.f.forceLayout();
                n8Var2.k();
                break;
            default:
                n8 n8Var3 = this.b;
                s8 s8Var4 = n8Var3.W;
                if (n8Var3.a != 0) {
                    s8Var4.onBackPressed();
                    break;
                } else {
                    s8Var4.dismiss();
                    break;
                }
        }
    }
}
