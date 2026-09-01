package eg;

import android.widget.FrameLayout;
import org.telegram.ui.Components.ra0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x(FrameLayout frameLayout, boolean z4, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z4;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                c1 c1Var = (c1) this.b;
                o2 o2Var = c1Var.s1;
                if (hVar == c1Var.C1) {
                    c1Var.C1 = null;
                    if (!this.c) {
                        o2Var.setVisibility(8);
                    }
                    o2Var.setMaskProvider(null);
                    break;
                }
                break;
            case 1:
                c1 c1Var2 = (c1) this.b;
                x0 x0Var = c1Var2.D1;
                if (hVar == c1Var2.J1) {
                    c1Var2.J1 = null;
                    if (!this.c) {
                        x0Var.setVisibility(8);
                        dg.e1.e(c1Var2.M1).g();
                        x0Var.getAdapter().l();
                        break;
                    }
                }
                break;
            default:
                ra0 ra0Var = (ra0) this.b;
                if (!z4) {
                    ra0Var.H = null;
                    boolean z10 = this.c;
                    ra0Var.setVisibility(z10 ? 8 : 0);
                    if (ra0Var.K && z10) {
                        ra0Var.K = false;
                        ra0Var.b.setLayoutManager(ra0Var.getNeededLayoutManager());
                        ra0Var.F = true;
                        ra0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
