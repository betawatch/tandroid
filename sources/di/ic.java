package di;

import org.telegram.ui.n01;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class ic extends kc {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ic(Object obj, int i10) {
        this.g = i10;
        this.h = obj;
    }

    @Override // di.kc
    public final void e() {
        switch (this.g) {
            case 0:
                n01 n01Var = (n01) this.h;
                n01Var.Q = false;
                n01Var.invalidate();
                break;
            case 1:
                bi.o5 t10 = ((bi.pb) this.h).t();
                if (t10 != null) {
                    t10.m0(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.x9 x9Var = (org.telegram.ui.Components.x9) this.h;
                x9Var.post(new nb(x9Var, 3));
                break;
        }
    }

    @Override // di.kc
    public final void f(boolean z10) {
        switch (this.g) {
            case 0:
                n01 n01Var = (n01) this.h;
                n01Var.Q = true;
                n01Var.invalidate();
                break;
            case 1:
                bi.o5 t10 = ((bi.pb) this.h).t();
                if (t10 != null) {
                    t10.m0(false);
                }
                bi.l4 l4Var = this.f;
                if (l4Var != null) {
                    l4Var.setTranslationX(0.0f);
                    this.f.setTranslationY(0.0f);
                    break;
                }
                break;
            default:
                ((org.telegram.ui.Components.x9) this.h).setVisibility(0);
                break;
        }
    }
}
