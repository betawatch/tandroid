package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.za0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                za0 za0Var = (za0) this.b;
                if (!z10) {
                    za0Var.K = null;
                    boolean z11 = this.c;
                    za0Var.setVisibility(z11 ? 8 : 0);
                    if (za0Var.N && z11) {
                        za0Var.N = false;
                        za0Var.b.setLayoutManager(za0Var.getNeededLayoutManager());
                        za0Var.I = true;
                        za0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
