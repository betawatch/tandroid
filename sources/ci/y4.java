package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.bb0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ y4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                q5 q5Var = q6Var.w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.c) {
                        q5Var.setVisibility(8);
                        pg.u0.e(q6Var.F1).g();
                        q5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                q6 q6Var2 = (q6) this.b;
                qg.u1 u1Var = q6Var2.m1;
                if (hVar == q6Var2.v1) {
                    q6Var2.v1 = null;
                    if (!this.c) {
                        u1Var.setVisibility(8);
                    }
                    u1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                bb0 bb0Var = (bb0) this.b;
                if (!z10) {
                    bb0Var.K = null;
                    boolean z11 = this.c;
                    bb0Var.setVisibility(z11 ? 8 : 0);
                    if (bb0Var.N && z11) {
                        bb0Var.N = false;
                        bb0Var.b.setLayoutManager(bb0Var.getNeededLayoutManager());
                        bb0Var.I = true;
                        bb0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
