package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.wa0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) this.b;
                r5 r5Var = r6Var.w1;
                if (hVar == r6Var.C1) {
                    r6Var.C1 = null;
                    if (!this.c) {
                        r5Var.setVisibility(8);
                        pg.u0.e(r6Var.F1).g();
                        r5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                r6 r6Var2 = (r6) this.b;
                qg.t1 t1Var = r6Var2.m1;
                if (hVar == r6Var2.v1) {
                    r6Var2.v1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                wa0 wa0Var = (wa0) this.b;
                if (!z10) {
                    wa0Var.K = null;
                    boolean z11 = this.c;
                    wa0Var.setVisibility(z11 ? 8 : 0);
                    if (wa0Var.N && z11) {
                        wa0Var.N = false;
                        wa0Var.b.setLayoutManager(wa0Var.getNeededLayoutManager());
                        wa0Var.I = true;
                        wa0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
