package ci;

import android.widget.FrameLayout;
import org.telegram.ui.Components.pb0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ x4(FrameLayout frameLayout, boolean z10, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = z10;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) this.b;
                p5 p5Var = q6Var.w1;
                if (hVar == q6Var.C1) {
                    q6Var.C1 = null;
                    if (!this.c) {
                        p5Var.setVisibility(8);
                        pg.u0.e(q6Var.F1).g();
                        p5Var.getAdapter().l();
                        break;
                    }
                }
                break;
            case 1:
                q6 q6Var2 = (q6) this.b;
                qg.t1 t1Var = q6Var2.m1;
                if (hVar == q6Var2.v1) {
                    q6Var2.v1 = null;
                    if (!this.c) {
                        t1Var.setVisibility(8);
                    }
                    t1Var.setMaskProvider(null);
                    break;
                }
                break;
            default:
                pb0 pb0Var = (pb0) this.b;
                if (!z10) {
                    pb0Var.K = null;
                    boolean z11 = this.c;
                    pb0Var.setVisibility(z11 ? 8 : 0);
                    if (pb0Var.N && z11) {
                        pb0Var.N = false;
                        pb0Var.b.setLayoutManager(pb0Var.getNeededLayoutManager());
                        pb0Var.I = true;
                        pb0Var.o(true);
                        break;
                    }
                }
                break;
        }
    }
}
