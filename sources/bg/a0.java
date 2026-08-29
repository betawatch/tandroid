package bg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ka0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ a0(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                t2 t2Var = g1Var.r1;
                if (iVar == g1Var.B1) {
                    g1Var.B1 = null;
                    if (!this.c) {
                        t2Var.setVisibility(8);
                    }
                    t2Var.setMaskProvider(null);
                    break;
                }
                break;
            case 1:
                g1 g1Var2 = (g1) this.b;
                a1 a1Var = g1Var2.C1;
                if (iVar == g1Var2.I1) {
                    g1Var2.I1 = null;
                    if (!this.c) {
                        a1Var.setVisibility(8);
                        ag.h1.e(g1Var2.L1).g();
                        a1Var.getAdapter().l();
                        break;
                    }
                }
                break;
            default:
                ka0 ka0Var = (ka0) this.b;
                if (!z10) {
                    ka0Var.G = null;
                    boolean z11 = this.c;
                    ka0Var.setVisibility(z11 ? 8 : 0);
                    if (ka0Var.J && z11) {
                        ka0Var.J = false;
                        ka0Var.b.setLayoutManager(ka0Var.getNeededLayoutManager());
                        ka0Var.E = true;
                        ka0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
