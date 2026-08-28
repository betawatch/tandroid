package kh;

import android.widget.FrameLayout;
import org.telegram.ui.Components.w90;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ r4(FrameLayout frameLayout, boolean z10, int i9) {
        this.a = i9;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                g6 g6Var = (g6) this.b;
                h5 h5Var = g6Var.s1;
                if (hVar == g6Var.y1) {
                    g6Var.y1 = null;
                    if (!this.c) {
                        h5Var.setVisibility(8);
                        xf.s0.e(g6Var.B1).g();
                        h5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                g6 g6Var2 = (g6) this.b;
                yf.t1 t1Var = g6Var2.i1;
                if (hVar == g6Var2.r1) {
                    g6Var2.r1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                w90 w90Var = (w90) this.b;
                if (!z10) {
                    w90Var.G = null;
                    boolean z11 = this.c;
                    w90Var.setVisibility(z11 ? 8 : 0);
                    if (w90Var.J && z11) {
                        w90Var.J = false;
                        w90Var.b.setLayoutManager(w90Var.getNeededLayoutManager());
                        w90Var.E = true;
                        w90Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
