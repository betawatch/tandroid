package ei;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ib0;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ q4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                g5 g5Var = f6Var.w1;
                if (hVar == f6Var.C1) {
                    f6Var.C1 = null;
                    if (!this.c) {
                        g5Var.setVisibility(8);
                        qg.u0.e(f6Var.F1).g();
                        g5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                f6 f6Var2 = (f6) this.b;
                rg.t1 t1Var = f6Var2.m1;
                if (hVar == f6Var2.v1) {
                    f6Var2.v1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                ib0 ib0Var = (ib0) this.b;
                if (!z10) {
                    ib0Var.K = null;
                    boolean z11 = this.c;
                    ib0Var.setVisibility(z11 ? 8 : 0);
                    if (ib0Var.N && z11) {
                        ib0Var.N = false;
                        ib0Var.b.setLayoutManager(ib0Var.getNeededLayoutManager());
                        ib0Var.I = true;
                        ib0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
