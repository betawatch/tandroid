package dg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.pa0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ z(FrameLayout frameLayout, boolean z4, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z4;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.b;
                q2 q2Var = e1Var.s1;
                if (hVar == e1Var.C1) {
                    e1Var.C1 = null;
                    if (!this.c) {
                        q2Var.setVisibility(8);
                    }
                    q2Var.setMaskProvider(null);
                    break;
                }
                break;
            case 1:
                e1 e1Var2 = (e1) this.b;
                z0 z0Var = e1Var2.D1;
                if (hVar == e1Var2.J1) {
                    e1Var2.J1 = null;
                    if (!this.c) {
                        z0Var.setVisibility(8);
                        cg.f1.e(e1Var2.M1).g();
                        z0Var.getAdapter().l();
                        break;
                    }
                }
                break;
            default:
                pa0 pa0Var = (pa0) this.b;
                if (!z4) {
                    pa0Var.H = null;
                    boolean z10 = this.c;
                    pa0Var.setVisibility(z10 ? 8 : 0);
                    if (pa0Var.K && z10) {
                        pa0Var.K = false;
                        pa0Var.b.setLayoutManager(pa0Var.getNeededLayoutManager());
                        pa0Var.F = true;
                        pa0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
